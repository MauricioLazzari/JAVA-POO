import java.sql.SQLOutput;

public class ControleRemoto implements Controlador{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    private int getVolume(){
        return this.volume;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    @Override
    public void ligar() {
        if(isLigado()){
            System.out.println("Já está ligado!");
        }else{
            System.out.println("Você ligou o aparelho!");
            setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if(!isLigado()){
            System.out.println("Já está desligado!");
        }else{
            System.out.println("Você desligou o aparelho!");
            setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        String ligado = (isLigado())?"Sim":"Não";
        String tocando = (isTocando())?"Sim":"Não";
        System.out.println("--------- MENU ---------");
        System.out.println("Está ligado? " + ligado);
        System.out.println("Está tocando? " + tocando);
        System.out.println("Volume: " + getVolume());
        int i;
        for(i = 0; i < getVolume(); i=i+10){
            System.out.print("|");
        }
        if(getVolume() == 100){
            System.out.println("");
            System.out.println("Está no volume máximo!");
        }else if(getVolume() == 0){
            System.out.println("Está no volume mínimo!");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("--------- MENU FECHADO ---------");
    }

    @Override
    public void maisVolume() {
        if(getVolume() < 100){
            setVolume(getVolume() + 10);
        }else{
            setVolume(getVolume());
        }
    }

    @Override
    public void menosVolume() {
        if(getVolume() > 0){
            setVolume(getVolume() - 10);
        }else{
            setVolume(getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        setVolume(0);
    }

    @Override
    public void desligarMudo() {
        setVolume(50);
    }

    @Override
    public void play() {
        if(isLigado() && !isTocando()){
            System.out.println("Você deu play!");
            setTocando(true);
        }else{
            System.out.println("Não está tocando. Impossível dar play!");
        }
    }

    @Override
    public void pause() {
        if(isTocando()){
            System.out.println("Você pausou!");
            setTocando(false);
        }else{
            System.out.println("Já está pausado!");
        }
    }
}
