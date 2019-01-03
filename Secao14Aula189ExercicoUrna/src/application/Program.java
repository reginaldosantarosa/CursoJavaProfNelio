package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> candidatos = new HashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			
			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String username = fields[0];
				int votos = Integer.parseInt(fields[1]);

				if (candidatos.containsKey(username)){					
					int v = candidatos.get(username);
					candidatos.put(username, v + votos);
				}
					else {
						candidatos.put(username,votos);
					}
				line = br.readLine();
			}
			System.out.println("CANDIDATOS:");
			for (String key : candidatos.keySet()) {
				System.out.println(key + ": " + candidatos.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}