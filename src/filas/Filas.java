package filas;

public class Filas {

	char[] f;
	int colocarDados, mostrarDados;
	
	public Filas(int tamanho) {
		
		this.f = new char[tamanho];
		this.colocarDados = 0;
		this.mostrarDados = 0;
	}
	
	public void inserirDados(char ch) {
		if(this.colocarDados == f.length) {
			System.out.println("Estrutura cheia");
			return;
		}
		f[this.colocarDados++] = ch;
	}
	
	public char exibirDados() {
		if(this.mostrarDados == this.colocarDados) {
			System.out.println(" - Estrutura vazia");
			return (char)0;
		}
		
		return f[this.mostrarDados++];
	}
}
