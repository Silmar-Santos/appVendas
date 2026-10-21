public class Main {
    public static void main(String[] args) {

        // 1. Cadastrando os produtos reais da sua revenda (Eles nascem aqui!)
        Produtos gasP13 = new Produtos(1, "Botijao GLP P13", 115.0);
        Produtos regulador = new Produtos(2, "Regulador de Gas", 45.0);

        // 2. Abrindo o balcão de vendas (O carrinho nasce vazio)
        Venda novaVenda = new Venda();

        // 3. O cliente pede 2 botijões de gás e 1 regulador
        // É AQUI que o produto real entra pela porta do método que você criou!
        novaVenda.adicionarProduto(gasP13, 2);
        novaVenda.adicionarProduto(regulador, 1);

        // 4. Vamos testar se o Java guardou tudo certo no carrinho?
        System.out.println("Produtos adicionados com sucesso no balcao de vendas!");
    }
}
