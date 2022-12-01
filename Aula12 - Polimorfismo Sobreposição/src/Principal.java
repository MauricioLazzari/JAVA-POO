public class Principal {

    public static void main(String [] args){

        //Objetos de classes que heram a classe abstrata Animal.
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        //Objetos das subclasses que herdam as classes acima.
        //Também herdam a classe animal consequentemente.
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        //O mesmo método da classe Animal sendo usado e sobrescrito pelas outras classes.
        //Assim temos o conceito de polimorfismo.
        //Poli = muitas.
        //Morfismo = formas.
        //Ou seja, muitas formas de se executar um mesmo método.
        c.locomover();
        k.locomover();
        j.locomover();
        t.locomover();
        g.locomover();
        e.locomover();

        System.out.println("---------------------------------");

        c.emitirSom();
        k.emitirSom();
        j.emitirSom();
        t.emitirSom();
        g.emitirSom();
        e.emitirSom();



    }

}
