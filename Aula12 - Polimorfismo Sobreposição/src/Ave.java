public class Ave extends Animal{

    private String corPena;

    public Ave(){

    }

    public void fazerNinho(){
        System.out.println("A ave fez um ninho!");
    }

    @Override
    public void locomover(){
        System.out.println("A ave está voando!");
    }

    @Override
    public void alimentar(){
        System.out.println("A ave está se alimentando!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Ave cantou!");
    }

    public String getCorPena(){
        return this.corPena;
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", corPena='" + corPena + '\'' +
                '}';
    }
}
