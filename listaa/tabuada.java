package listaa;
import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int numero;
		 
			System.out.println("digite o numero que deseja saber a tabuada");
			numero = in.nextInt();
			for(int i=0; i<=10; i++) {
			System.out.println(+numero+"X"+i+"="+ (numero*i));
			
		}


	}



	}


