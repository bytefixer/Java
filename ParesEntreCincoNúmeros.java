import java.util.Scanner;

public class ParesEntreCincoNúmeros {
	public static void main(String[] args) {
		int inputUser, loop, countzinho = 0;
		
		Scanner leitor = new Scanner(System.in);
		for(loop = 0; loop < 5; loop++) {
			inputUser = leitor.nextInt();
			if(inputUser % 2 == 0) {
				countzinho++;
			}
		}
		
		System.out.println(countzinho + " valores pares");
		
		leitor.close();
	}
	
}
