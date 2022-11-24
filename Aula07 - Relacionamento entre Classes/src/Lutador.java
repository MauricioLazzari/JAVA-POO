import java.security.spec.RSAOtherPrimeInfo;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }

    public void apresentar(){
        System.out.println("-----------------------------------");
        System.out.println("-------- Dados do Lutador ---------");
        System.out.println("Peso: " + getNacionalidade());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Vitórias: " + getVitoria());
        System.out.println("Derrotas: " + getDerrota());
        System.out.println("Empates: " + getEmpate());
    }

    public void status(){
        System.out.println("Seu peso é: " + getCategoria());
        System.out.println("Ganhou: " + getVitoria() + " vezes!");
        System.out.println("Perdeu: " + getDerrota() + " vezes!");
        System.out.println("Empatou: " + getEmpate() + " vezes!");
    }

    public void ganharLuta(){
        setVitoria(getVitoria() + 1);
    }

    public void perderLuta(){
        setDerrota(getDerrota() + 1);
    }

    public void empatarLuta(){
        setEmpate(getEmpate() + 1);
    }


    //---------------------------------------------------------------------

    public String getNome(){
        return this.nome;
    }

    private void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        if(peso < 52.2){
            this.categoria = "Inválido";
        }else if(peso <= 70.3){
            this.categoria = "Leve";
        }else if(peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}
