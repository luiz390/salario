package entidade;

import java.util.Locale;
import java.util.Scanner;

import contracheque.FolhaDePagamento;

public class Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
          
		
		 FolhaDePagamento c = new FolhaDePagamento();
		 System.out.println("================================");
		 System.out.println("======FOLHA DE PAGAMENTO========");
		 System.out.println("================================");
		 System.out.println();
		 System.out.print("NOME DO FUNCIONARIO: ");
		 c.nome = sc.nextLine();
		 System.out.print("SALARIO DO FUNCIONARIO: ");
		 c.salariobr = sc.nextDouble();
		 System.out.print("VALOR DO IMPOSTO: ");
		 c.imposto = sc.nextDouble();
		 System.out.println(c);
		 System.out.println();
		 System.out.print("DIGITE A PORCENTAGEM: ");
		 double porcento = sc.nextDouble();
		 c.salarionovo(porcento);
		 System.out.println(c);
	}

}
