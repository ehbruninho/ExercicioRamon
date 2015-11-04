import java.util.Scanner;

public class Main {
	public static void main(String args[]){
	int op=0;
	Lista minhaLista = new Lista();
	Scanner tc = new Scanner(System.in);
	
	
	
	do {
		System.out.println("1- add inicio\n");
		System.out.println("2- add fim\n");
		System.out.println("3- add na posição\n");
		System.out.println("4- remover inicio\n");
		System.out.println("5- remover fim\n");
		System.out.println("6- remover posição\n");
		System.out.println("7- Listar\n");
		System.out.println("8- Mostrar quantidade\n");
		System.out.println("9- Mostrar um elemento pela posiçao");

		op = tc.nextInt();
		switch (op) {
		
		case 1: {
			Elemento e = new Elemento();
			e.ler();
			minhaLista.addInicio(e);
			break;
				}
		
		case 2: {
				Elemento e = new Elemento();
				e.ler();
				minhaLista.addFim(e);
				break;
				}
		case 3:{
				Elemento e = new Elemento();
				e.lerPosicao();
				e.ler();
				minhaLista.addEmX(e,e.pos);
				break;
				}
		case 4:
				{
					minhaLista.removeInicio();
					break;
				}
		case 5: {
			minhaLista.removerFim();
			break;
				}

		case 7: {
			minhaLista.listar();
			break;
	
	
		}
	}
	} while (op != 99);
	}
	
	}
	
