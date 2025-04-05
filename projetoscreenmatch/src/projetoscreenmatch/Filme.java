package projetoscreenmatch;

public class Filme {
	String nome;
	int anoDeLancamento;
	int duracaoEmMinutos;
	boolean incluidoNoPlano;
	double somaDasAvaliacoes;
	int totalDeAvaliacoes;
	
	void exibeFichaTecnica() {
		System.out.println("Nome do filme: "+nome);
		System.out.println("Ano de lançameto: "+anoDeLancamento);
		System.out.println("Duração em minutos "+duracaoEmMinutos);
		System.out.println("Incluido no plano"+incluidoNoPlano);
	}
	
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    
    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
	
}
