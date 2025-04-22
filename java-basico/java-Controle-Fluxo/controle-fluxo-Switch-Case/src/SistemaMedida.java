public class SistemaMedida {
    public static void main(String[] args) throws Exception {
        String sigla = "M";
        
        // Verifica o tamanho do produto pelo if/else
        // if(sigla == "P"){
        //     System.out.println("Pequeno");
        // } else if(sigla == "M"){
        //     System.out.println("Medio");
        // } else if(sigla == "G"){
        //     System.out.println("Grande");
        // } else {
        //     System.out.println("Tamanho não reconhecido.");
        // }

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Tamanho não reconhecido.");
                break;
        }
    }
}
