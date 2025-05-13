public abstract class ComandosSqlTemplateMethod {
    public void consultarRegistro(String Table, Integer id){
        this.conectarBanco();
        this.efetuarConsulta(Table, id);
        this.registrarAcao();
        System.out.println("Registro consultado com sucesso.\n");
    }

    private void conectarBanco(){
        System.out.println("Conectando no banco de dados...");
    }

    private void registrarAcao(){
        System.out.println("Registrando ação no histórico...");
    }

    //Método Template a ser implementado nas classes filhas
    protected abstract void efetuarConsulta(String table, Integer id);

}
