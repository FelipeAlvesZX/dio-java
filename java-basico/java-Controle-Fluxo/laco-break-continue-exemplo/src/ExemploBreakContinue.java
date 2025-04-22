public class ExemploBreakContinue {
    public static void main(String[] args) throws Exception {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println("Teste do break: "+numero);
        }
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println("Teste Continue: "+numero);
            
        }
    }
}
