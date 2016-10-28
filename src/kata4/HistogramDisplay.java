package kata4;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame {
        
    private final Histogram<String> histogram;
    
    public HistogramDisplay(Histogram<String> histogram) {
        super("HISTOGRAMA DE PRUEBA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    

    public void execute(){
        setVisible(true);
    }
    
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    } 
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet ){
        JFreeChart chart = ChartFactory.createBarChart("JFreeChart Histogram", // title
                                                       "Dominios email", //categoryAxisLabel,
                                                       "Nº de emails", //valueAxisLabel,
                                                       dataSet,
                                                       PlotOrientation.VERTICAL, //orientacion 
                                                       false,
                                                       rootPaneCheckingEnabled,
                                                       rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (String key : histogram.KeySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }
        return dataSet;
    }
    
}