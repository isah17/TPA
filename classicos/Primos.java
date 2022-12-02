package classicos;
import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		System.out.println("digite um numero inteiro, para saber se e primo ou nao:");
		num = in.nextInt();
		if(num % num == 1  && num % 1 == num ){
			System.out.println("numero eh primo");
		}else 																																					 {
			System.out.println("numero nao eh primo");
		}																																																																																																																																
	}

}
