package classicos;
import java.util.Scanner;
public class FaixaEaria {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0 ;
		int idade, quant, p1, p2, p3, p4 ,p5, f1 = 0, f2= 0, f3 = 0, f4 = 0, f5 = 0;
		do {
			System.out.println("digite sua idade");
			idade= in.nextInt();
			if (idade<=15) {
				f1 = f1 + 1;
			} else
			if (idade <=30) {
				f2 = f2 + 1;
			} else 
			 if (idade<=45) {
				f3 = f3 + 1;
			} else
			if (idade <=60) {
				f4 = f4 + 1;
			} else
			if (idade>61) {
				f5 = f5+1;
			}
			
			
		i++;
		} while (i<=15);
			System.out.println("existe " +f1+ " pessoas na primeira faixa etaria.");
			System.out.println("existe " +f2+ " pessoas na segunda faixa etaria.");
			System.out.println("existe " +f3+ " pessoas na terceira faixa etaria.");
			System.out.println("existe " +f4+ " pessoas na quarta faixa etaria.");
			System.out.println("existe" +f5+ " pessoas na quinta faixa etaria.");
			p1 = (f1*100)/15;
			System.out.println(+p1+"% de pessoas na primeira faixa etaria");
			p2 = (f2*100)/15;
			System.out.println(+p2+"% de pessoas na segunda faixa etaria");
			p3 = (f3*100)/15;
			System.out.println(+p3+"% de pessoas na terceira faixa etaria");
			p4 = (f4*100)/15;
			System.out.println(+p4+"% de pessoas na quarta faixa etaria");
			p5 = (f5*100)/15;
			System.out.println(+p5+"% de pessoas na quinta faixa etaria");
	}

}
