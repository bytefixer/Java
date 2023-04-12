import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		int numberOne, numberTwo;
		
		Scanner leitor = new Scanner(System.in);
		numberOne = leitor.nextInt();
		numberTwo = leitor.nextInt();
		
		if(numberOne % numberTwo == 0 || numberTwo % numberOne == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		leitor.close();
	}
}
