public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        // if(plano == "B"){
        //     System.out.println("100 minutos de ligação");
        // } else if(plano == "M"){
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whats e Insta grátis");
        // } else if(plano == "T") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whats e Insta grátis");
        //     System.out.println("5GB Youtube");
        // }

        //pelo switch case
        // como n tem o break nos case ele vai ate a opção definida (anteriormente ou pelo usuario)
        // e continua até achar o break final
        switch (plano) {
            case "T":
                System.out.println("5GB Youtube");
            case "M":
                System.out.println("Whats e Insta grátis");
            case "B":
                    System.out.println("100 minutos de ligação");
            default:
                break;
        }
    }
}
