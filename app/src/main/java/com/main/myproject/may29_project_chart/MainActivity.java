package com.main.myproject.may29_project_chart;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BarChart barChart = findViewById(R.id.bar_chart);

        ArrayList<BarEntry> allEntries = new ArrayList<>();

        //BarEntry enrty1 = new BarEntry(0,100);
        allEntries.add(new BarEntry(10,120));
        allEntries.add(new BarEntry(20,30));
        allEntries.add(new BarEntry(30,90));
        allEntries.add(new BarEntry(40,150));
        allEntries.add(new BarEntry(50,65));
        allEntries.add(new BarEntry(60,20));
        allEntries.add(new BarEntry(70,70));

        BarDataSet barDataSet = new BarDataSet(allEntries,"Weekly Selling");
        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);
        barData.setBarWidth(8);
        barChart.setFitBars(true);

        ArrayList<Integer> colorList = new ArrayList<>();

        colorList.add(getApplication().getResources().getColor(R.color.color1)); // API LEVEL > 22 getColor
        colorList.add(getApplication().getResources().getColor(R.color.color2));
        colorList.add(getApplication().getResources().getColor(R.color.color3));
        colorList.add(getApplication().getResources().getColor(R.color.color4));
        colorList.add(getApplication().getResources().getColor(R.color.color5));
        colorList.add(getApplication().getResources().getColor(R.color.color6));
        colorList.add(getApplication().getResources().getColor(R.color.color7));

        barDataSet.setColors(colorList);

        barChart.setPinchZoom(false);
        barChart.setScaleYEnabled(false);

        barChart.setDescription(null);
        barChart.animateY(3000,Easing.EaseInOutElastic);

        ArrayList<LegendEntry> legendEntries = new ArrayList<>();
        legendEntries.add(new LegendEntry("Monday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color1)));
        legendEntries.add(new LegendEntry("Tuesday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color2)));
        legendEntries.add(new LegendEntry("Wednesday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color3)));
        legendEntries.add(new LegendEntry("Thursday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color4)));
        legendEntries.add(new LegendEntry("Friday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color5)));
        legendEntries.add(new LegendEntry("Saturday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color6)));
        legendEntries.add(new LegendEntry("Sunday",Legend.LegendForm.CIRCLE,Float.NaN,Float.NaN,null,getResources().getColor(R.color.color7)));

        barChart.getLegend().setCustom(legendEntries);
        barChart.getLegend().setWordWrapEnabled(true);
        barChart.getLegend().setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);

        barChart.invalidate();
    }
}
