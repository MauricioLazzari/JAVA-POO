public class Mamifero extends Animal{

    private String corPelo;

    public Mamifero(){

    }

    @Override
    public void locomover() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", corPelo='" + corPelo + '\'' +
                '}';
    }
}
