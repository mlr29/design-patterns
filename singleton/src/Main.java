public class Main {
    public static void main(String[] args) throws Exception {
        Porta p1 = new Porta("p1");
        Porta p2 = new Porta("p2");
        Porta p3 = new Porta("p3");

        p1.abrirPorta(ChaveSingleton.pegarChave());
        p2.abrirPorta(ChaveSingleton.pegarChave());
        p3.abrirPorta(ChaveSingleton.pegarChave());

    }
}
