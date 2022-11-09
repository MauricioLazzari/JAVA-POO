package aulaclasseseobjetos;

public class Caneta{
    String modelo;
    String cor;
    float carga;
    float ponta;
    boolean tampada;
    
    //Será possível rabiscar somente se a caneta estiver destampada.
    void rabiscar(){
        if(!this.tampada){
            System.out.println("Você está rabiscando!");
        }else{
            System.out.println("Não é possível rabiscar. A caneta está tampada!");
        }
    }

    //Se tampada for igual a true, a caneta foi tampada.
    void tampar(){
        this.tampada = true;
        if(this.tampada){
            System.out.println("Caneta foi tampada!");
        }
    }

    //Se tampada não for verdadeira, ou seja, false, a caneta foi destampada.
    void destampar(){
        this.tampada = false;
        if(!this.tampada){
            System.out.println("Caneta foi destampada.");
        }
    }

    //Exibe os status da caneta.
    //Se tampada for igual a true, exibe "Tampada", se for igual a false, exibe "Destampada".
    void status(){
        String tampada = this.tampada?"Tampada":"Destampada";
        System.out.println("Modelo da caneta: " + this.modelo + "\n"
                         + "Cor da caneta: " + this.cor + "\n"
                         + "Carga da caneta: " + this.carga + "\n" 
                         + "Está tampada? "  + tampada);
    }
}
