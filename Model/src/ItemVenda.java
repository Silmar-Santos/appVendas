
public class ItemVenda {
    private Produtos produto;
    private int quantidade;

    public ItemVenda(Produtos produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produtos getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubTotal() {
        return produto.getPrecoVenda() * quantidade;
    }
}
