package aulaclasseseobjetos;

public class Caneta{

    //Definindo os atributos e suas visibilidades.
    // ( + ) Public -> É possível acessar de fora da classe em qualquer situação.
    // ( - ) Private -> Não é possível acessar de fora da classe, somente através de métodos acessores.
    // ( # ) Protected -> É protegido e pode ser acessado de outra classe caso esta classe Caneta seja chamada.

    public String modelo;
    public String cor;
    private float carga;
    protected float ponta;
    protected boolean tampada;

    //Se tampada for igual a true, a caneta foi tampada.
    private void tampar(){
        this.tampada = true;
        if(this.tampada){
            System.out.println("Caneta foi tampada!");
        }
    }

    //Se tampada não for verdadeira, ou seja, false, a caneta foi destampada.
    private void destampar(){
        this.tampada = false;
        if(!this.tampada){
            System.out.println("Caneta foi destampada.");
        }
    }

    //Será possível rabiscar somente se a caneta estiver destampada.
    public void rabiscar(){
        if(!this.tampada){
            System.out.println("Você está rabiscando!");
        }else{
            System.out.println("Não é possível rabiscar. A caneta está tampada!");
        }
    }

    //Exibe os status da caneta.
    //Se tampada for igual a true, exibe "Tampada", se for igual a false, exibe "Destampada".
    public void status(){
        String tampada = this.tampada?"Tampada":"Destampada";
        System.out.println("Modelo da caneta: " + this.modelo + "\n"
                + "Cor da caneta: " + this.cor + "\n"
                + "Carga da caneta: " + this.carga + "\n"
                + "Ponta da caneta: " + this.ponta + "\n"
                + "Está tampada? "  + tampada);
    }

}
