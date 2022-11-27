public class Principal {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[5];

        //Lutadores da categoria PESADO.
        l[0] = new Lutador("Lazzari", "Brasil", 25, 1.87f, 82, 15, 1, 3);
        l[1] = new Lutador("Spider Silva", "Brasil", 32, 1.89f, 80, 2, 5, 2);

        //Lutadores da categoria LEVE.
        l[2] = new Lutador("Bronx", "Brasil", 31, 1.79f, 70, 12, 4, 1);
        l[3] = new Lutador("MCGregor", "Holanda", 29, 1.78f, 69.5f, 15, 0, 3);

        Luta luta = new Luta();
        luta.marcarLuta(l[0], l[1]);
        luta.lutar(l[0], l[1]);
    }
}