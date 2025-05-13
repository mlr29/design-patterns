public class ComandosPostgreSql extends ComandosSqlTemplateMethod{
    @Override
    protected void efetuarConsulta(String table, Integer id){
        System.out.println("Comando PostgreSQL de consulta do registro " + id + " na tabela " + table + "...");
    }
}
