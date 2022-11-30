public class Principal {

    public static void main(String [] args){

        //Objeto do tipo Visitante, que herda todos atributos e métodos de Pessoa.
        Visitante v1 = new Visitante();
        v1.setNome("Lazzari");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());

        //Objeto do tipo Aluno, que herda todos atributos e métodos de Pessoa.
        //Este objeto possui seus próprios atributos como curso e matrícula.
        Aluno a1 = new Aluno();
        a1.setNome("Maurício");
        a1.setIdade(26);
        a1.setSexo("M");
        a1.setCurso("Análise e Desenvolvimento de Sistemas!");
        a1.setMatricula(20493);
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        //Objeto do tipo Bolsista, que herda todos atributos e métodos de Aluno onde o mesmo herda de Pessoa.
        //Este objeto possui seus próprios atributos como curso e matrícula.
        Bolsista b1 = new Bolsista();
        b1.setNome("Mariana");
        b1.setIdade(24);
        b1.setSexo("F");
        b1.setBolsa(12.5f);
        System.out.println(b1.toString());
        b1.pagarMensalidade();
    }

}
