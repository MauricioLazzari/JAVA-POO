//Esta classe herdará todos atributos e métodos de Pessoa.
//Ela possui atributos e métodos próprios.
public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(){

    }

    //Se este método for "public final void", significa que ele não pode ser sobrescrito.
    //Neste caso, ele é sobrescrito pela classe Bolsista.
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
