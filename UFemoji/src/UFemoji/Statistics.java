package UFemoji;

import java.awt.Dimension;

import javax.swing.JFrame;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.data.category.DefaultCategoryDataset;

public class Statistics {

    private DefaultCategoryDataset dataset;
    private JFreeChart chart;
    private ChartPanel panel;

    public Statistics(Lutador lutador) {

        // Criamos o conjunto de dados
        dataset = new DefaultCategoryDataset();

        // Adicionamos os atributos do lutador
        dataset.addValue(lutador.getforca(), "Lutador", "Força");
        dataset.addValue(lutador.getVelocidade(), "Lutador", "Velocidade");
        dataset.addValue(lutador.getTecnica(), "Lutador", "Técnica");
        dataset.addValue(lutador.getExperiencia(), "Lutador", "Experiência");

        // Criamos o gráfico radar
        SpiderWebPlot plot = new SpiderWebPlot(dataset);

        chart = new JFreeChart(
                "Estatísticas de " + lutador.getNome(),
                JFreeChart.DEFAULT_TITLE_FONT,
                plot,
                true
        );

        // Criamos o painel
        panel = new ChartPanel(chart);

        panel.setPreferredSize(new Dimension(600, 500));

        // Criamos a janela
        JFrame janela = new JFrame("Estatísticas do Lutador");

        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        janela.add(panel);

        janela.pack();

        janela.setLocationRelativeTo(null);

        janela.setVisible(true);
    }
}