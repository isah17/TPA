package vetor;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
			
			final int TAM = 10;
			int i;
			double  b[];
			int a[];
			
			a = new int [TAM];
			b = new double [TAM];
			
			for(i=0; i<TAM; i++) {
				System.out.println("Entre com o " +(i+1)+ "º valor");
				a[i] = in.nextInt();
				b[i]= Math.sqrt(a[i]);
				System.out.println(b[i]);
				
				
			}

	}

}
