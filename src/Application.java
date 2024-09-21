import model.entities.ProcessadorDeCSV;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        try {
            ProcessadorDeCSV leitor = new ProcessadorDeCSV("produtos.csv");
            leitor.processarProdutos("produtosTotais.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
