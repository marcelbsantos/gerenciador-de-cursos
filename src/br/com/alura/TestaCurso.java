package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");
		javaColecoes.getAulas();
				
		javaColecoes.adiciona(new Aula("Trabalando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelendao com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
		
		
	}
}
