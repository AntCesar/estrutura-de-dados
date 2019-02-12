class TesteContem{

	public static void main(String[] args) {

		Vetor v1 = new Vetor();

		Aluno a1 = new Aluno();
		a1.setNome("Antonio");
		Aluno a2 = new Aluno();
		a2.setNome("Cesar");
		Aluno a3 = new Aluno();
		a3.setNome("Bezerra");

		v1.adicionar(a1);
		v1.adicionar(a2);
		v1.adicionar(a3);

		System.out.println(v1);

		Aluno a4 = new Aluno();
		a4.setNome("Antonio");

		System.out.println(v1.contem(a4));

	}
}