package aulaclasseseobjetos;

public class Principal {
    
    public static void main(String [] args){

        //Instanciando objeto c1 da classe Caneta.
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.carga = 0.20f;
        c1.tampada = false;
        c1.ponta = 0.5f;

        c1.status();
        c1.rabiscar();

        //Instanciando objeto c2 da classe Caneta.
        Caneta c2 = new Caneta();

        System.out.println("-----------------------------");

        c2.modelo = "Rech";
        c2.cor = "Vermelha";
        c2.carga = 0.5f;
        c2.tampada = true;
        c2.ponta  = 0.3f;

        c2.status();
        c2.rabiscar();


    
    }
    
}
