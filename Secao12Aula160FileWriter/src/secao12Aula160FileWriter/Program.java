package secao12Aula160FileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lines =  new String[] {"bom dia","boa tarde"};
		
		String path = "d:\\texte1.txt";
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			
			for (String line : lines ) {
				bw.write(line);
				bw.newLine();
			}
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
