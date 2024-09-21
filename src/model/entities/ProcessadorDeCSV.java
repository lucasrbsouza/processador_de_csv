package model.entities;

import java.io.*;

public class ProcessadorDeCSV {
    private String caminhoDoArquivo;

    public ProcessadorDeCSV() {
    }

    public ProcessadorDeCSV(String caminhoDoArquivo) {
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    public void processarProdutos(String caminhoParaSerSalvo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo));
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

    public String getCaminhoDoArquivo() {
        return caminhoDoArquivo;
    }

    public void setCaminhoDoArquivo(String caminhoDoArquivo) {
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    @Override
    public String toString() {
        return "ProcessadorDeCSV{" + "caminhoDoArquivo='" + caminhoDoArquivo + '\'' + '}';
    }
}
