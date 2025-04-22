public class ExemploForArray {
    public static void main(String[] args) throws Exception {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	    for (int x=0; x<alunos.length; x++) {
		    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	    }
        String outrosAlunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        //Forma abreviada
        for(String aluno : outrosAlunos) {
            System.out.println(aluno);
          }
    }
}
