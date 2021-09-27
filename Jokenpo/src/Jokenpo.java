import java.util.Scanner;
import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Jokenpo");
		System.out.println("Digite: 0 para TESOURA, 1 para PAPEL e 2 para PEDRA");

		System.out.println("Escolha uma op��o:");
		float n1 = tec.nextFloat();

		System.out.println("Agora � a vez do seu advers�rio!");
		float n2 = rand.nextInt(3);

		System.out.printf("Voc� jogou %s, o advers�rio jogou %s\n", n1, n2);

		System.out.println(jokenpo(n1, n2));

		tec.close();
	}

	private static String jokenpo(float n1, float n2) {
		
		if(n1 == n2){
			return "EMPATOU!";
		} else if(n1 < n2){
			return "VOC� GANHOU!";
		} else if(n1 == 2 && n2 == 0) {
			return "VOC� GANHOU!";
			
		}else if(n1 == 0 && n2 == 2) {
			return "VOC� PERDEU!";
		}
		else {
			return "VOC� PERDEU!";
		
		}
}
}
	