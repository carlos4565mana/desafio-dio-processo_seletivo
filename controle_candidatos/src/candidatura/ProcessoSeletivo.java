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

}
