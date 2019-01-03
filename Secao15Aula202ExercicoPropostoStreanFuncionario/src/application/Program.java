package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("Enter full file path: ");
		String path = "D:\\funcionario.txt";
	
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Funcionario> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0],fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
						
			double mediaSalario = list.stream()
					.map(p -> p.getSalario())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			
			
			System.out.println("Media Salario: " + String.format("%.2f", mediaSalario));
			
			//Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			System.out.println("Abaixo da media");
			List<String> names = list.stream()
					.filter( p -> p.getSalario() < mediaSalario)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
			
			
			double sum = list.stream()
					.filter(x -> x.getNome().charAt(0) == 'M')
					.map(x -> x.getSalario())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Soma salario começa com M: "+sum);
			
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
