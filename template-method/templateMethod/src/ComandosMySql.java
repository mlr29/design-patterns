public class ComandosMySql extends ComandosSqlTemplateMethod{
    @Override
    protected void efetuarConsulta(String table, Integer id){
        System.out.println("Comando MySQL de consulta do registro " + id + " na tabela " + table + "...");
    }
}
