package targetSistemas;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;

public class Tecnica3 {

    public static void main(String[] args) {
        try {
            // Carregar o arquivo XML
            File inputFile = new File("faturamento.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Obter a lista de dias
            NodeList nList = doc.getElementsByTagName("dia");

            // Lista para armazenar os valores de faturamento
            ArrayList<Double> valores = new ArrayList<>();

            // Ler os valores de faturamento, ignorando dias sem faturamento
            for (int i = 0; i < nList.getLength(); i++) {
                Element dia = (Element) nList.item(i);
                double valor = Double.parseDouble(dia.getElementsByTagName("valor").item(0).getTextContent());
                if (valor > 0) { // Ignora dias sem faturamento (valor 0)
                    valores.add(valor);
                }
            }

            // Calcula o menor e o maior valor de faturamento
            double menorValor = valores.stream().min(Double::compare).orElse(0.0);
            double maiorValor = valores.stream().max(Double::compare).orElse(0.0);

            // Calcula a média mensal
            double soma = valores.stream().mapToDouble(Double::doubleValue).sum();
            double media = soma / valores.size();

            // Conta os dias com faturamento acima da média
            long diasAcimaDaMedia = valores.stream().filter(v -> v > media).count();

            // Exibe os resultados
            System.out.println("Menor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}