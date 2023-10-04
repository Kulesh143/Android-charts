package com.main.myproject.may29_project_chart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LineChart lineChart = findViewById(R.id.line_chart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(10,100));
        entries.add(new Entry(20,165));
        entries.add(new Entry(30,80));
        entries.add(new Entry(40,60));
        entries.add(new Entry(50,100));
        entries.add(new Entry(60,50));
        entries.add(new Entry(70,85));

        LineDataSet lineDataSet = new LineDataSet(entries,"Weekly Selling");
        LineData lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);

        ArrayList<Integer> colorList = new ArrayList<>();

        colorList.add(getApplication().getResources().getColor(R.color.color1)); // API LEVEL > 22 getColor
        colorList.add(getApplication().getResources().getColor(R.color.color2));
        colorList.add(getApplication().getResources().getColor(R.color.color3));
        colorList.add(getApplication().getResources().getColor(R.color.color4));
        colorList.add(getApplication().getResources().getColor(R.color.color5));
        colorList.add(getApplication().getResources().getColor(R.color.color6));
        colorList.add(getApplication().getResources().getColor(R.color.color7));
        lineDataSet.setColors(colorList);

        lineChart.setPinchZoom(false);
        lineChart.setScaleYEnabled(false);

        lineChart.setDescription(null);
        lineChart.animateY(3000,Easing.EaseInOutElastic);

        ArrayList<LegendEntry> legendEntries = new ArrayList<>();
        legendEntries.add(new LegendEntry("Monday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color1)));
        legendEntries.add(new LegendEntry("Tuesday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color2)));
        legendEntries.add(new LegendEntry("Wednesday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color3)));
        legendEntries.add(new LegendEntry("Thursday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color4)));
        legendEntries.add(new LegendEntry("Friday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color5)));
        legendEntries.add(new LegendEntry("Saturday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color6)));
        legendEntries.add(new LegendEntry("Sunday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color7)));

        lineChart.getLegend().setCustom(legendEntries);
        lineChart.getLegend().setWordWrapEnabled(true);
        lineChart.getLegend().setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);

        lineChart.invalidate();

    }
}
