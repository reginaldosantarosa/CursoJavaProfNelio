package secao12Aula161Pastas;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com sua pasta: ");
		
		String strPatch = sc.nextLine();
		
		File path = new File(strPatch);
		
		
		File[] folders = path.listFiles(File::isDirectory);
		 
		for ( File folder: folders) {
			System.out.println(folder);
		}
		
		
		File[] files = path.listFiles(File::isFile);
		for ( File file: files) {
			System.out.println(file);
		}
		
		
		
		
		boolean sucesso = new File(strPatch + "\\bosta").mkdir();
		System.out.println(sucesso);
		sc.close();

	}

}
