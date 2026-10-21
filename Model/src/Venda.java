import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<ItemVenda> itens = new ArrayList<>();
    private double desconto;

    public Venda() {
        this.itens new ArrayList<>();
        this.desconto = 0.0;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
