public class Operadores {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos
        // byte, short, int, long, float, double, char, boolean

        String nome = "Felipe";
        int idade = 20;
        double peso = 100.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        // Date dataNascimento = new Date(); // new Date() retorna a data atual


        // operadores aritméticos
        // +, -, *, /, % (resto da divisão)

        double soma = 10.5 + 15.7;
        int subtracao = 113- 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // resto da divisão
        // double resultado = (10 * 7) + (20 / 4);


        String nomeCompleto = "Linguagem" + " Java";
        System.out.println(nomeCompleto);


        int numero = 5;
        System.out.println( - numero); // imprime o número negativo -5

        numero = - numero;
        System.out.println(numero); // imprime o número negativo -5

        numero = numero * -1;
        System.out.println(numero); // imprime o número positivo 5

        numero = numero + 2;
        System.out.println(numero); // imprime o número 7
        
        numero++; // incrementa o número em 1 é o msm que numero = numero + 1
        System.out.println(numero); // imprime o número 6

        numero--; // decrementa o número em 1 é o msm que numero = numero - 1
        System.out.println(numero); // imprime o número 4

        boolean variavel = true;
        System.out.println(!variavel); // imprime false, inverte (!) operador que respresenta negação
        //, é o msm que variavel = !variavel
        System.out.println(variavel); // imprime true

        int a, b;
        //a = 5;
        a = 6;
        b = 6;
        
        // String resultado = " ";
        // if(a == b) { // operador de comparação ==
        //     resultado = "Iguais";
        // } else {
        //     resultado = "Diferentes";
        // }
        //é o msm que 
        String resultado = (a == b) ? "Iguais/verdadeiro" : "Diferentes/false"; // operador ternário ? 
        System.out.println(resultado);

        //operadores relacionais

        int num1 = 1;
        int num2 = 2;

        if( num1 < num2){ 
            System.out.println("A nossa condição é verdadeira");
        }
            

        boolean simNao = (num1 == num2); // operador de comparação ==
        System.out.println("num1 é igual a num2? " + simNao); // imprime false

        simNao = num1 != num2; // operador de comparação ==
        System.out.println("num1 é diferente de num2? " + simNao);

        simNao = num1 > num2; // operador de comparação ==
        System.out.println("num1 é maior que num2? " + simNao);


        String nome1 = "Felipe";
        String nome2 = "Felipe";

        System.out.println("nome1 é igual a nome2? " + nome1.equals(nome2)); // imprime true, pois os dois objetos são iguais

        // OPERADORES LÓGICOS
        // && (E), || (OU), ! (NÃO)

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){ // operador lógico E &&
            System.out.println("As duas condições são verdadeiras"); // imprime false, pois uma das condições é falsa
        } 

        if(condicao1 || condicao2){ // operador lógico OU ||
            System.out.println("Uma das condições é verdadeira"); // imprime true, pois uma das condições é verdadeira
        }

        System.out.println("Fim do programa"); // imprime Fim do programa
    }   
}
