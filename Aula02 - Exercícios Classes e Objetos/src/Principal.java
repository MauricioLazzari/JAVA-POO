public class Principal {
    public static void main(String[] args) {

        Computador c1 = new Computador("i9", "Windows XP", (byte)16, (short)500, true, false);

        c1.ligar(); //Ligou o computador.

        c1.instalarSO("Windows XP"); //Instalou o SO Windows XP, pois o mesmo foi passado como parâmetro para o método instalarSO.

        c1.listarDadosComputador(); //Lista dados do computador.

    }
}