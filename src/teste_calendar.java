import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class teste_calendar {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/User/Downloads/09-tratamento-de-excecoes.pdf");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
			System.out.println("Testando o git");
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
