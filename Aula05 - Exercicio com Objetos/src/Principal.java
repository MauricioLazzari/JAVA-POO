public class Principal {
    public static void main(String[] args) {

        ContaBanco c1 = new ContaBanco();

        c1.abrirConta('C');
        c1.tipoConta = 'P';
        System.out.println("---------------------------------");
        c1.setDonoConta("Maurício");
        c1.setNumConta(1234);
        c1.dadosConta();
        System.out.println("---------------------------------");
        c1.sacar(500);
        c1.depositar(600);
        c1.pagarMensalidade();


    }
}