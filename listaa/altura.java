package listaa;
import java.util.Scanner;
public class altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner (System.in);
		
		int i=1;
		double j, p, alP, alJ;
		do {
			
			System.out.println("Digite o tamanho de pedro");
			p = in.nextDouble();
			alP = p+20;
			System.out.println("Digite o tamanho de jo�o");
			j= in.nextDouble();
			alJ = j+25;
			if (i<24) {
			System.out.println("jo�o ainda � menor que pedro");
			} else {
				System.out.println("demorou "+i+" anos para jo�o ficar maior que pedro");
			}
			i++;
		} while (i<=24);
		
			
	}
	

}
