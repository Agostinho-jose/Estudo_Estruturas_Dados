package filas;

public class FilasTreino {

	int[] num;
	int por, tirar;
	public FilasTreino(int tamanho) {
		this.num = new int[tamanho];
		this.por = 0;
		this.tirar = 0;
	}
	
	void inserir(int inteiro) {
		if(this.por == num.length) {
			System.out.println("Estrutura cheia");
			return;
		}
		num[this.por++] = inteiro;
	}
	
	int exibir() {
		if(this.tirar == this.por) {
			
			return 0;
		}
		return num[this.tirar++];
	}
	
}
