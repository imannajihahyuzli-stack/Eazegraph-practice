package com.example.piechartusingeazygraph;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import org.eazegraph.lib.charts.ValueLineChart;
import org.eazegraph.lib.models.ValueLinePoint;
import org.eazegraph.lib.models.ValueLineSeries;

public class MainActivity extends AppCompatActivity {
    TextView tvR, tvPython, tvCPP, tvJava;
    ValueLineChart mCubicValueLineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linechart);

        tvR = findViewById(R.id.tvR);
        tvPython = findViewById(R.id.tvPython);
        tvCPP = findViewById(R.id.tvCPP);
        tvJava = findViewById(R.id.tvJava);
        mCubicValueLineChart = findViewById(R.id.cubiclinechart);

        setData();
    }

    private void setData() {
        tvR.setText("40");
        tvPython.setText("30");
        tvCPP.setText("5");
        tvJava.setText("25");

        ValueLineSeries series = new ValueLineSeries();
        series.setColor(0xFF56B7F1);

        series.addPoint(new ValueLinePoint("Jan", 2.4f));
        series.addPoint(new ValueLinePoint("Feb", 3.4f));
        series.addPoint(new ValueLinePoint("Mar", .4f));
        series.addPoint(new ValueLinePoint("Apr", 1.2f));
        
        mCubicValueLineChart.addSeries(series);
        mCubicValueLineChart.startAnimation();
    }
}