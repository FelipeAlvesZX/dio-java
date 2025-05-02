package candidatura;

import java.util.Random;

public class ProcessoSeletivo4 {
    
    static String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
    
    public static void main(String[] args) {
       for(String candidato: candidatos){
            entrandoEmContato(candidato);
       }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else {
                 System.out.println("Contato realizado com sucesso");
            }
        } while(continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na "+ tentativasRealizadas + " tentativa");
        } else{
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo de tentativas "+ tentativasRealizadas + " realizada");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

}
