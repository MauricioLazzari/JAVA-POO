public class Cachorro extends Mamifero{

    public Cachorro(){

    }

    @Override
    public void locomover(){
        System.out.println("O cachorro está andando!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Cachorro está latindo!");
    }

    public void enterrarOsso(){
        System.out.println("Cachorro está enterrando osso!");
    }

    public void abanarRabo(){
        System.out.println("Cachorro está abanando o rabo!");
    }
}
