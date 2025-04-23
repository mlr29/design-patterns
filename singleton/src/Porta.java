class Porta{
    private String nome;

    public Porta(String nome){
        this.nome = nome;   
    }

    public void abrirPorta(ChaveSingleton chave){
        System.out.println("Porta " + this.nome + " aberta com chave: " + chave.pegarNomeChave());
    }
} 