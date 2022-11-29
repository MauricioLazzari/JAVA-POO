public class Principal {

    public static void main(String [] args){

        //Criando objeto p1 e usando atributos da própria classe e da classe Pessoa.
        Pessoa p1 = new Pessoa();
        p1.setNome("Maurício");
        p1.setIdade(25);
        p1.setSexo("M");

        //Criando objeto p2 e usando atributos da própria classe e da classe Pessoa.
        Aluno p2 = new Aluno();
        p2.setNome("Mariana");
        p2.setIdade(24);
        p2.setSexo("F");

        //Criando objeto p3 e usando atributos da própria classe e da classe Pessoa.
        Professor p3 = new Professor();
        p3.setNome("Paulo");
        p3.setIdade(36);
        p3.setSexo("M");
        p3.setEspecialidade("Analista de Sistemas!");
        p3.setSalario(3.500f);

        //Criando objeto p4 e usando atributos da própria classe e da classe Pessoa.
        Funcionario p4 = new Funcionario();
        p4.setNome("Lazzari");
        p4.setIdade(26);
        p4.setSexo("M");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }

}
