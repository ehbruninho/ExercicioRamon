import java.util.Scanner;

public class Elemento {
	String nome;
	Elemento proximo;
	int pos;
	
	
	public void ler(){
		Scanner tc = new Scanner(System.in);
		System.out.println("Digite o nome!!?");
		this.nome= tc.next();
	}
	public void lerPosicao(){
		Scanner tc = new Scanner (System.in);
		System.out.println("Digite a posicação:");
		this.pos = tc.nextInt();
		
	}
	public void mostrar(){
		System.out.println(this.nome);
	}

}
