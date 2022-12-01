public class Peixe extends Animal{

    private String corEscama;

    public Peixe(){

    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha!");
    }

    @Override
    public void locomover(){
        System.out.println("O peixe está nadando!");
    }

    @Override
    public void alimentar(){
        System.out.println("O peixe está comendo substâncias!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe não emite som");
    }


    public String getCorEscama(){
        return this.corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", corEscama='" + corEscama + '\'' +
                '}';
    }
}
