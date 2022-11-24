public class Computador {

    String processador;
    String so;
    byte ram;
    short hd;
    boolean conectado;
    boolean ligado;

    public Computador(String processador, String so, byte ram, short hd, boolean conectado, boolean ligado) {
        this.processador = processador;
        this.so = so;
        this.ram = ram;
        this.hd = hd;
        this.conectado = conectado;
        this.ligado = ligado;
    }

    void listarDadosComputador(){

        String con = (this.conectado)?"Sim":"Não";
        String lig = (this.ligado)?"Sim":"Não";

        System.out.println("Processador: " + this.processador);
        System.out.println("SO: " + this.so);
        System.out.println("Memoria RAM: " + this.ram + " GB");
        System.out.println("HD: " + this.hd + " GB");
        System.out.println("Conectado ? " + con);
        System.out.println("Ligado ? " + lig);
    }

    void ligar(){
        if(this.conectado){
            System.out.println("Você ligou o computador!");
            this.ligado = true;
        }else{
            System.out.println("Não foi possível ligar! Está conectado a energia?");
        }
    }

    void instalarSO(String so){

        this.so = so;

        if(this.ligado){
            System.out.println("Você instalou o SO: " + this.so);
        }else{
            System.out.println("Computador não está ligado! Não foi possivel instalar o SO.");
        }
    }

    void desligar(){
        if(this.conectado && this.ligado){
            System.out.println("Você desligou o computador!");
            this.ligado = false;
        }else{
            System.out.println("Computador já está desligado!");
        }
    }

}

