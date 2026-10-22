import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<ItemVenda> itens = new ArrayList<>();
    private double desconto;

    public Venda() {
        this.desconto = 0.0;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void adicionarProduto(Produtos produtos, int quantidade){
        ItemVenda novoItem = new ItemVenda (produtos,quantidade);
                this.itens.add(novoItem);
    }

    public void removerItem(ItemVenda item) {
        this.itens.remove(item);

    }

    public double getTotal(){
        double total = 0.0;

        for (ItemVenda itemVenda : itens){
            total += itemVenda.getSubTotal();
        }

        return total - desconto;
    }
}
