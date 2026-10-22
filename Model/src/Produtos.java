

public class Produtos {

    private int id;
    private String descricao;
    private double precoVenda;


    public Produtos() {
    }


    public Produtos(int id, String descricao, double precoVenda) {
        this.id = id;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "|ID|: " + id + " |DESCRICAO|: " + descricao + " |PRECO DE VENDA|: R$" + precoVenda;
    }
}