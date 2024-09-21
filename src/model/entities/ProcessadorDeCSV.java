package model.entities;

import java.io.*;

public class ProcessadorDeCSV {
    private String caminhoArquivo;

    public ProcessadorDeCSV() {
    }

    public ProcessadorDeCSV(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void processarProdutos(String caminhoParaSerSalvo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoParaSerSalvo))) {

            String line;
            while ((line = br.readLine()) != null) {
                calcularEEscreverTotais(line, bw);
            }
        }
    }

    private void calcularEEscreverTotais(String linha, BufferedWriter bw) throws IOException {
        String[] vects = linha.split(",");

        if (vects.length == 3) {
            String nomeDoProduto = vects[0].trim();
            double preco = Double.parseDouble(vects[1].trim());
            int quantidade = Integer.parseInt(vects[2].trim());
            double precoTotal = preco * quantidade;


            bw.write(nomeDoProduto + "," + precoTotal);
            bw.newLine();
        }
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public String toString() {
        return "ProcessadorDeCSV{" + "caminhoArquivo='" + caminhoArquivo + '\'' + '}';
    }
}
