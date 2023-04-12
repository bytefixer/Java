import java.util.Scanner;

public class Animal {
	public static void main(String[] args) {
		String escolhendinho1, escolhendinho2, escolhendinho3;
		
		Scanner leitor = new Scanner(System.in);
		escolhendinho1 = leitor.next();
		escolhendinho2 = leitor.next();
		escolhendinho3 = leitor.next();
		
		if(escolhendinho1.equals("vertebrado")){
			if(escolhendinho2.equals("ave")){
				if(escolhendinho3.equals("carnivoro")) {
					System.out.println("aguia");
				} 
				
				else if(escolhendinho3.equals("onivoro")){
					System.out.println("pomba");
				}
			}
			
			if(escolhendinho2.equals("mamifero")) {
				if(escolhendinho3.equals("onivoro")) {
					System.out.println("homem");
				} 
				
				else if(escolhendinho3.equals("herbivoro")) { 
					System.out.println("vaca");
				}
			}
		}
		
		if(escolhendinho1.equals("invertebrado")) {
			if(escolhendinho2.equals("inseto")) {
				if(escolhendinho3.equals("hematofago")) {
					System.out.println("pulga");
				}
				
				else if(escolhendinho3.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			}
			
			if(escolhendinho2.equals("anelideo")) {
				if(escolhendinho3.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else if(escolhendinho3.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		
		leitor.close();
	}
}
