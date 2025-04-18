package edu.felipe.prisem;

public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem-vindos");

        // int anoFabricacao = 2025;

        // boolean  verdadeira = false;

        String primeiroNome = "Felipe";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}