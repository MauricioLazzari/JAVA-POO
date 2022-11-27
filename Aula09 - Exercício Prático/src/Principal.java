public class Principal {

    public static void main (String [] args){
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Maurício", 25, "M");
        p[1] = new Pessoa("Mariana", 24, "F");

        l[0] = new Livro("Cruso de JAVA", "Guanabara", 320, p[0]);
        l[1] = new Livro("Curso de Ruby", "Iuri", 400, p[1]);
        l[2] = new Livro("Curso de PHP", "Fernando", 350, p[1]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        l[0].voltarPag();
        l[0].detalhes();

    }

}
