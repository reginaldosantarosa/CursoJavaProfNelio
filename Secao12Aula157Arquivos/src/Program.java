import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("d:\\texte.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		}

		catch (IOException e) {
			System.out.println("Erro " + e.getMessage());
		}

		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
