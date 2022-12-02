package vetor;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
		int maior = -100, menor = 200, i, a[];
		
		a = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o " +(i+1)+ "º valor");
			a[i] = in.nextInt();
			if (a[i]<=menor) {
				menor = a[i];
			}if (a[i]>=maior){
				maior = a[i];
			}
		}
		System.out.println("O menor valor eh " +menor);
		System.out.println("O maior valor eh "+maior);
	

	}

}
