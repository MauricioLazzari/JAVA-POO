public class Principal {

    public static void main(String [] args){

        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        m.emitirSom();
        l.emitirSom();

        Cachorro c = new Cachorro();
        c.emitirSom();
        //Usando o mesmo método reagir e passando assinaturas diferentes.
        //Conceito de Polimorfismo de Sobrecarga.
        //Poli = muitas.
        //Morfismo = formas.
        //OBS: As assinaturas devem ser diferentes e nunca iguais.
        c.reagir(10, 5);
        c.reagir(false);
        c.reagir("Toma comida");
        c.reagir(12, 11.5f);



    }

}
