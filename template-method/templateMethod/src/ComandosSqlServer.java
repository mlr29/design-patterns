public class ComandosSqlServer extends ComandosSqlTemplateMethod{
    
    @Override
    protected void efetuarConsulta(String table, Integer id){
        System.out.println("Comando SQL Server de consulta do registro " + id + " na tabela " + table + "...");
    }
}
