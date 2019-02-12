class TesteAdiciona{
	
	public static void main(String[] args) {

		Aluno a1 = new Aluno();
    	Aluno a2 = new Aluno();

    	a1.setNome("Joao");
   	    a2.setNome("Jose");

 	    Vetor lista = new Vetor();

    	lista.adicionar(a1);
	    lista.adicionar(a2);

	    System.out.println(lista);
	}
}