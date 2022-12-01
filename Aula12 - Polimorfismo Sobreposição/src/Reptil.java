public class Reptil extends Animal{

    private String corEscama;

    public Reptil(){

    }

    @Override
    public void locomover() {
        System.out.println("O réptil está se locomovendo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Réptil está se alimentando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Réptil não emite som!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", corEscama='" + corEscama + '\'' +
                '}';
    }
}
