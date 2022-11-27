import java.util.Random;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovada;
    private int rounds;
    private String x;


    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1.getNome() != l2.getNome()) {
            System.out.println("Luta marcada!");
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("Luta não marcada. Categorias diferentes!");
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar(Lutador l1, Lutador l2) {
        if (isAprovado()) {
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("###### Empatou ######");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("###### Desafiante ganhou a luta! ######");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("###### Desafiado ganhou a luta! ######");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

            }
            System.out.println("######### DESAFIADO #########");
            desafiado.apresentar();
            System.out.println("######### DESAFIANTE #########");
            desafiante.apresentar();
        }else{
        System.out.println("Não é possível lutar. A luta não foi aprovada!");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovado() {
        return aprovada;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovada = aprovado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
