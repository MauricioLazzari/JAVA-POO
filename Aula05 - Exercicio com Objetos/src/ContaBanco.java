import java.sql.SQLOutput;

public class ContaBanco {

    public int numConta;
    protected char tipoConta;
    private String donoConta;
    private float saldo;
    private boolean status;

    public ContaBanco(){

    }

    public void abrirConta(char conta){

        setTipoConta(conta);
        setStatus(true);

        if(conta == 'C'){
            System.out.println("Você abriu uma conta corrente!");
            setSaldo(100);
        }else if(conta == 'P'){
            System.out.println("Você abriu uma conta poupança!");
            setSaldo(50);
        }

    }

    public void dadosConta(){

        String status = (isStatus())?"Ativa":"Inativa";

        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo Conta: " + getTipoConta());
        System.out.println("Dono da Conta: " + getDonoConta());
        System.out.println("Saldo da Conta: " + getSaldo());
        System.out.println("Status da Conta: " + status);
    }

    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Conta possui dinheiro. Não é possível fechar!");
        }else if(getSaldo() < 0){
            System.out.println("Conta com saldo negativo. Não é possível fechar!");
        }else{
            System.out.println("Conta fechada com sucesso!");
            setStatus(false);
        }
    }

    public void depositar(float valor){
        if(isStatus()){
            setSaldo(valor + getSaldo());
        }else{
            System.out.println("Você não tem conta aberta. Impossível depositar!");
        }
    }

    public void sacar(float valor){
        if(isStatus()){
            if(getSaldo() > 0){
                setSaldo(getSaldo() - valor);
            }else{
                System.out.println("Você não tem saldo suficiente!");
            }
        }else{
            System.out.println("Sua conta não está aberta!");
        }
    }

    public void pagarMensalidade(){
        float valor = 0;
        if(getTipoConta() == 'C'){
            valor = 12;
        }else if(getTipoConta() == 'P'){
            valor = 20;
        }

        if(isStatus()){
            setSaldo(getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso. Saldo bancário: " + getSaldo());
        }else{
            System.out.println("Conta está fechada. Impossível pagar mensalidade!");
        }
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumConta(){
        return this.numConta;
    }

    private void setTipoConta(char tipoConta){
        this.tipoConta = tipoConta;
    }

    public char getTipoConta(){
        return this.tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

}
