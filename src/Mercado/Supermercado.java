package Mercado;

public class Supermercado {
    ProdutoAlimenticio batata = new ProdutoAlimenticio("Batata");
    ProdutoAlimenticio cenoura = new ProdutoAlimenticio("Cenoura");

    public void cadastrarPreco(Produto produto, float preco) {
        produto.setPreco(preco);
    }

    public void cadastrarQtde(Produto produto, int qtde) {
        produto.setQtdeEmEstoque(qtde);
    }

    public float processarPedido(Pedido pedido) {
        // implementar
        System.out.println("Processando pedido");
        return 0.0f;
    }
}
