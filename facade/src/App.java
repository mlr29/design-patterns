/*
 * Implementação bem simples da utilização do padrão Façade para simplificar a interface do sistema. 
 * A classe EstoqueFacade possui todos os estoques dos fornecedores e unifica a interface de acesso a eles.
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        EstoqueFacade estoque = new EstoqueFacade();
        System.out.println(estoque.buscarEstoque());
    }
}
