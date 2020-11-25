package Mercado;

abstract class Produto {
    private String nome;
    private int qtdeEmEstoque;
    private float preco;
    private String codigoDeBarras;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdeEmEstoque() {
        return qtdeEmEstoque;
    }
    public void setQtdeEmEstoque(int qtde) {
        this.qtdeEmEstoque = qtde;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}
