public class Professor extends  Pessoa{

    private String especialidade;
    private float salario;

    public Professor(){

    }

    public void receberAum(float aumento){
        setSalario(getSalario() + aumento);
        System.out.println("Aumento de: " + aumento);
        System.out.println("Seu salário atual: " + getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
