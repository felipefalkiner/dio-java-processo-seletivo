package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo!");
        // analisarCandidato(1900);
        // analisarCandidato(2000);
        // analisarCandidato(2300);
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        
        int candidatosSelecionados = 0;
        while(candidatosSelecionados < 5)

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO!");
        else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA!");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS!");
    }
}