package secao12Aula163ExercicioLeituraCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();
		
		String p0 = "d:\\leitura.txt";	
		
		File path = new File(p0);
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				String[] temp = line.split(",");
				Produto produto = new Produto(temp[0], Double.parseDouble(temp[1]), Integer.parseInt(temp[2]));
				list.add(produto);
				line = br.readLine();
			}
		}

		catch (IOException e) {
			System.out.println("error: " + e.getMessage());
			// TODO: handle exception
		}

		
		String t = "d:\\final.txt";
		
		
		String endereco = path.getParent();
		
		boolean success = new File(endereco + "\\out").mkdir();
		
		String fim = endereco + "\\out\\summary.csv";
				
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fim, true))) {

			for (Produto p : list) {
				bw.write ( p.getNome() + "," +  p.valorTotal());
				bw.newLine();
			}

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
