package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		
		System.out.println("Processo seletivo");
		
		System.out.println("\n-- Seleção de candidatos --");
        selecaoCandidatos();
        
        System.out.println("\n-- Imprimir Selecionados --");
        imprimirSelecionados();
	}

	private static void imprimirSelecionados() {
	
		String[] candidatos = {"Maria", "João", "Ana", "Pedro", "Clara", "Lucas", "Isabella", "Bruno", "Carolina", "Gustavo"};
        System.out.println("Imprimindo a lista de candidatos de acordo com o índice");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de número " + (i+1) + " é " + candidatos[i]);
        }
	}

	private static void selecaoCandidatos() {
		
		String [] candidatos = {"Maria", "João", "Ana", "Pedro", "Clara", "Lucas", "Isabella", "Bruno", "Carolina", "Gustavo"};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("Candidato: " + candidato + " - valor: " + salarioPretendido);

            if(salarioBase >= salarioPretendido) {
                System.out.println(candidato + " selecionado para a vaga!");
                candidatosSelecionados++;
            }

            candidatosAtual++;
			
		}
	}
	
	static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500, 2500);
    }
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        }else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
		
	}

}
