public class Bolsista extends Aluno{

    private float bolsa;

    public Bolsista(){

    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + getNome());
    }

    //@Override sobrescreve o método para que ele seja manipulado de forma específica para esta classe.
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do bolsista " + getNome());
    }

    public float getBolsa(){
        return this.bolsa;
    }

    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }

}
