package aulaclasseseobjetos;

public class Principal {

    public static void main(String [] args){

        Caneta c1 = new Caneta();

        //Não é possível acessar o atributo carga, pois o mesmo é privado.
        //c1.carga = 0.5f;

        //Modelo é um atributo público, então ele pode ser acessado.
        c1.modelo = "BIC";

        //Ponta é um atributo protegido, porém no método main tem chamada para classe Caneta, então é possível acessá-lo.
        c1.ponta = 0.5f;

        c1.status();

        //Métodos públicos que possuem chamadas de atributos privados, podem ser chamados, pois eles possuem acesso aos atributos.
        //Métodos privados não podem ser chamados.
        //c1.tampar(); -> Método privado.


    }

}
