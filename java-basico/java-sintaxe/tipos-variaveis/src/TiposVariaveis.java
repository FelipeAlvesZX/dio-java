public class TiposVariaveis {
    public static void main(String[] args){
        double salarioMinimo = 2500; 

        short numeroCurto = 1; // 16 bits
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // conversão explícita

        // short numeroCurto2 = numeroNormal; // não compila, pois o número normal é maior que o curto
        int numero = 5;
        numero = 10; // reatribuição de valor
        System.out.println(numero); 

        final double VALOR_DE_PI = 3.14; // n pode ser alterado se tiver a palavra reservada final no inicio da declaração
        // VALOR_DE_PI = 10.75;
    }
}
