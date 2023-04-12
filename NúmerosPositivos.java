import java.util.Scanner;

public class NúmerosPositivos {
	public static void main(String[] args) {
		double inputNumbers, loop;
		int positiveCount = 0;
		
		Scanner leitor = new Scanner(System.in);
		for(loop = 0; loop < 6; loop++) {
			inputNumbers = leitor.nextDouble();
			if(inputNumbers > 0) {
				positiveCount++;
			}
		}
		
		System.out.println(positiveCount + " valores positivos");
		
		leitor.close();
    }
 
}
