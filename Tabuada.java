import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		int inputUserzinho, loop, calculandinho = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		inputUserzinho = leitor.nextInt();
		
		for(loop = 1; loop <= 10; loop++) {
			calculandinho = loop * inputUserzinho;
			System.out.printf("%d x %d = %d\n", loop, inputUserzinho, calculandinho);
		}
		
		leitor.close();
	}
}
