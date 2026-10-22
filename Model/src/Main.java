import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        List<Produtos> produtos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("CADASTRO DE PRODUTOS");
        System.out.println("DIGITE O ID DO PRODUTO");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("DIGITE O NOME DO PRODUTO!");
        String descricao = scanner.nextLine();

        System.out.println("DIGITE O PREÇO!");
        double precoVenda = scanner.nextDouble();

        Produtos produtos1 = new Produtos(id,descricao,precoVenda);
        System.out.println("PRODUTO CADASTRADO!" + produtos1);

    }
}
