package km222pw_assign3;

import java.util.ArrayList;
import java.util.List;

import org.knowm.xchart.*;

public class SinMain {


    public static void main(String[] args) throws InterruptedException {


        XYChart chart = new XYChartBuilder().width(800).height(600).build();
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        chart.getStyler().setMarkerSize(1);
        List xData = new ArrayList();
        List yData = new ArrayList();
        CurveGenerator(xData, yData);
        chart.addSeries("Chart", xData, yData);
        new SwingWrapper<>(chart).displayChart();

    }
    private static void CurveGenerator(List a, List b) {
        for (Double i = 0.0; i <= (2 * Math.PI); i = i + 0.0001) {
            double y = (1 + i / Math.PI) * Math.cos(i) * Math.cos( 40*i);
            double x = i;
            a.add(x);
            b.add(y);
        }


    }
}
