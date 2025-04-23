public class ChaveSingleton {
    private static ChaveSingleton c;
    private final String NOME_CHAVE;
    
    private ChaveSingleton(String nome){
        this.NOME_CHAVE = nome;
    };

    public static ChaveSingleton pegarChave(){
        if(c == null){
            ChaveSingleton.c = new ChaveSingleton("CHV1");
        }
            
        return ChaveSingleton.c;
    }

    public String pegarNomeChave(){
        return NOME_CHAVE;
    }
}
