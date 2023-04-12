import java.util.Scanner;

public class PositivosEMedia {
	public static void main(String[] args) {
		double inserindoNum, looping, somatoria = 0;
		int positiveCount = 0;
		
		Scanner leitor = new Scanner(System.in);
		for(looping = 0; looping < 6; looping++) {
			inserindoNum = leitor.nextDouble();
			if(inserindoNum > 0) {
				positiveCount++;
				somatoria = somatoria + inserindoNum;
			}
		}
		
		somatoria = somatoria / positiveCount;
		
		System.out.println(positiveCount + " valores positivos");
		System.out.printf("%.1f\n", somatoria);
		
		leitor.close();
    }
}
