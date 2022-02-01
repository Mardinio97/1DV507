package km222pw_assign3;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PieBarChart {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        PieChart pie_chart = new PieChartBuilder().width(800).height(600).title("Integer Pie Chart").build();
        CategoryChart categoryChart =   new CategoryChartBuilder().width(800).height(600).title("Integer Bar Chart").xAxisTitle("Intervals").yAxisTitle("Count").build();
        File file = new File("C:\\Users\\Mardi\\Desktop\\1DV507\\src\\km222pw_assign3\\integers.dat");
        Scanner scan = new Scanner(file);
        int less_10 = 0;
        int less_20 = 0;
        int less_30 = 0;
        int less_40 = 0;
        int less_50 = 0;
        int less_60 = 0;
        int less_70 = 0;
        int less_80 = 0;
        int less_90 = 0;
        int less_100 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (scan.hasNext()) {
            list.add(scan.nextInt());
        }
        scan.close();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < 10)
                less_10++;
            else if (list.get(i) < 20)
                less_20++;
            else if (list.get(i) < 30)
                less_30++;
            else if (list.get(i) < 40)
                less_40++;
            else if (list.get(i) < 50)
                less_50++;
            else if (list.get(i) < 60)
                less_60++;
            else if (list.get(i) < 70)
                less_70++;
            else if (list.get(i) < 80)
                less_80++;
            else if (list.get(i) < 90)
                less_90++;
            else if (list.get(i) < 100)
                less_100++;
        }

        categoryChart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        categoryChart.getStyler().setAvailableSpaceFill(.75);
        categoryChart.getStyler().setHasAnnotations(true);
        categoryChart.addSeries("Integer Value",
                Arrays.asList("<10", "<20", "<30", "<40", "<50", "<60",
                        "<70", "<80", "<90", "<100"),
                Arrays.asList(less_10, less_20, less_30
                        , less_40, less_50, less_60,
                        less_70, less_80, less_90, less_100));



        pie_chart.getStyler().setLegendVisible(true);
        pie_chart.getStyler().setPlotContentSize(.8);
        pie_chart.getStyler().setStartAngleInDegrees(90);
        pie_chart.addSeries("<10", less_10);
        pie_chart.addSeries("<20", less_20);
        pie_chart.addSeries("<30", less_30);
        pie_chart.addSeries("<40", less_40);
        pie_chart.addSeries("<50", less_50);
        pie_chart.addSeries("<60", less_60);
        pie_chart.addSeries("<70", less_70);
        pie_chart.addSeries("<80", less_80);
        pie_chart.addSeries("<90", less_90);
        pie_chart.addSeries("<100", less_100);
        new SwingWrapper<>(pie_chart).displayChart();
        new SwingWrapper<>(categoryChart).displayChart();
    }
}
