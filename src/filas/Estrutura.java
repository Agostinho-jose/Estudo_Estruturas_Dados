package filas;

public class Estrutura {

	public static void main(String[] args) {
	
		/*Filas fila = new Filas(100);
		Filas erros = new Filas(4);
		char ch;
		
		System.out.println("Preechendo estrutura, Alfabeto.");
		for(int i = 0; i < 26; i++) {
			fila.inserirDados((char) ('A' + i));
		}
		
		System.out.println("Exibir estrutura, Alfabeto.");
		for(int i = 0; i < 26; i++) {
			ch = fila.exibirDados();
			if(ch != 0) {
				System.out.print(ch);
			}
			
		}
		System.out.println();
		System.out.println("Erros estrutura, Alfabeto.");
		for(int i = 0; i < 5; i++) {
			System.out.println("Tentando armazernar: " + (char) ('Z'- i));
			erros.inserirDados((char) ('Z'- i));
			
	}
		System.out.println();
		System.out.println("Contents: ");
		for(int i = 0; i < 5; i++) {
			ch = erros.exibirDados();
			if(ch != (char) 0) {
				System.out.print(ch);
			}
			
		}
	}*/
		FilasTreino ft = new FilasTreino(100);
		FilasTreino erros = new FilasTreino(4);
		int inteiros;
		
		System.out.println("Inserir elementos: ");
		for(int i = 0; i < 15; i++) {
			
			ft.inserir(i);
		}
		
		System.out.println("Exibir elementos: ");
		for(int i = 0; i <15; i++) {
			inteiros = ft.exibir();
			if(inteiros != 0) {
				System.out.print(inteiros);
			}
		}
		
		System.out.println("\nEncontrando erros: ");
		System.out.println("Tentando inserir mais elementos: ");
		for(int i = 0; i <5; i++) {
			System.out.println("Inserir elementos: " + (i));
			erros.inserir(-i);
		}
		
		/*for(int i = 0; i <5; i++) {
			inteiros = erros.exibir();
			if(inteiros != 0) {
				System.out.print(inteiros);
			}
		}*/
	}
}
