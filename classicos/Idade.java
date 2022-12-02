package classsicos;
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int idade, idadeT=0 , media, idadeV=0 , idadeN=0 ;
		for (int i = 1; i <= 10; i++) {
			System.out.println("digite sua idade");
			idade = in.nextInt();
			idadeT = idadeT+idade;
			if(i == 1) {
				idadeV = idade;
				idadeN = idade;
			}else if(idade>idadeV) {
				idadeV = idade;
			}else if(idade<idadeN) {
				idadeN = idade;
			}
			
			
		}
		media = idadeT/10 ;
		System.out.println("a média de idades é "+media+ "anos");
		System.out.print("a idade do mais velho é "+idadeV+" anos");
		System.out.print("a idade do mais novo é "+idadeN+" anos");
			

	}
}
