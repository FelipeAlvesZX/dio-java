package candidatura;

public class ProcessoSeletivo3 {
    
    static String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
    static double salarioBase = 2000.0;
    static int candidatoSelecionado = 0;
    static int candidatoAtual = 0;
    
    public static void main(String[] args) {
       imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        System.out.println("Imprimindo a lista de candidatos informando o indice de elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº "+ (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interacao for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);            
        }

    }

}
