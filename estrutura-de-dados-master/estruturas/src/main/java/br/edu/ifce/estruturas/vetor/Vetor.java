import java.util.Arrays;

class Vetor{

	private Aluno[] alunos = new Aluno[100];

	private int totalDeElementos = 0;

	public void adicionar(Aluno aluno){
		this.alunos[this.totalDeElementos] = aluno;
		this.totalDeElementos++;
	}
	public void adicionarPorPosicao(int posicao, Aluno aluno){
		return 0;
	}
	public void remover(int posicao){
		return 0;
	}
	public Aluno pegar(int posicao){
		return 0;
	}
	public boolean contem(Aluno aluno){
		for(int i=0; i<this.totalDeElementos; i++){
			if(alunos[i].getNome() == aluno.getNome()){
				return true;
			}
		}
		return false;
	}
	public int tamanho(){
		return this.totalDeElementos;
	}
	public String toString(){
		if(this.totalDeElementos == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for(int i = 0; i<this.totalDeElementos - 1; i++){
			builder.append(this.alunos[i]);
			builder.append(", ");
		}

		builder.append(this.alunos[this.totalDeElementos - 1]);
		builder.append("]");

		return builder.toString();
	}
}