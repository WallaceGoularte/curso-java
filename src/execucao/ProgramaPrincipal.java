package execucao;

import java.util.*;
import modelo.*;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto();
		
		System.out.println("Informe o Produto\n");
		
		System.out.print("Nome: ");
		p.nome = sc.nextLine();
		System.out.print("\nPreço: ");
		p.preco = sc.nextDouble();
		System.out.print("\nQuantidade: ");
		p.quantidade = sc.nextInt();
		
		System.out.println(p);
		
		
		sc.close();

	}

}
