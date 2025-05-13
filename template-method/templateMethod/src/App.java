public class App {
    public static void main(String[] args) throws Exception {
        ComandosSqlServer mssql = new ComandosSqlServer();
        mssql.consultarRegistro("Vendas", 123);
    
        ComandosMySql mysql = new ComandosMySql();
        mysql.consultarRegistro("Clientes", 999);
        
        ComandosPostgreSql psql = new ComandosPostgreSql();
        psql.consultarRegistro("Funcionários", 888);
    }
}
