public class Caneta {

    public String modelo;
    private float ponta;


    public Caneta(){

    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public void status(){
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Ponta da caneta: " + this.ponta);
    }


}
