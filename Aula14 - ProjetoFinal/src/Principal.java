public class Principal {

    public static void main(String[]args){

        //Objeto dos Gafanhotos que herdam atributos da classe Pessoa.
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Lazzari", 25, "M", "slowlazz");
        g[1] = new Gafanhoto("Mariana", 24, "F", "maarisantos");

        //Objeto dos Vídeos, que implementam métodos da interface AcoesVideo.
        Video v[] = new Video[3];
        v[0] = new Video("Curso em Java POO");
        v[1] = new Video("Curso em PHP POO");
        v[2] = new Video("Curso Ruby");


        //Objeto das Visualizações, que tem relacionamento com as classes Gafanhoto e Vídeo.
        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[1]); //Lazzari assiste "Curso em PHP POO".
        vis[1] = new Visualizacao(g[1], v[1]); //Mariana assiste "Curso em PHP POO".
        vis[0].avaliar(5);
        vis[1].avaliar(85.f);

        System.out.println(vis[0].toString());
        System.out.println("-------------------------------");
        System.out.println(vis[1].toString());





    }

}


