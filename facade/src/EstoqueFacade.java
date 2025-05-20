public class EstoqueFacade {
    private EstoqueFornecedorA estoqueFornecedorA;
    private EstoqueFornecedorB estoqueFornecedorB;
    private EstoqueFornecedorC estoqueFornecedorC;

    public EstoqueFacade(){
        this.estoqueFornecedorA = new EstoqueFornecedorA();
        this.estoqueFornecedorB = new EstoqueFornecedorB();
        this.estoqueFornecedorC = new EstoqueFornecedorC();
    }

    public String buscarEstoque(){
        String resultado;
        
        resultado = this.estoqueFornecedorA.buscarEstoque() + "\n";
        resultado += this.estoqueFornecedorB.buscarEstoque() + "\n";
        resultado += this.estoqueFornecedorC.buscarEstoque() + "\n";

        return resultado;
    }
}
