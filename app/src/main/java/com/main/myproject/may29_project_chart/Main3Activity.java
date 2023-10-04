package com.main.myproject.may29_project_chart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        PieChart pieChart = findViewById(R.id.pie_chart);

        ArrayList<PieEntry> pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(15,"Cake"));
        pieEntries.add(new PieEntry(35,"Chocolate"));
        pieEntries.add(new PieEntry(45,"Ice Cream"));
        pieEntries.add(new PieEntry(5,"Other"));

        PieDataSet pieDataSet = new PieDataSet(pieEntries,"Foods");
        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);

        ArrayList<Integer> colorList = new ArrayList<>();

        colorList.add(getApplication().getResources().getColor(R.color.color1)); // API LEVEL > 22 getColor
        colorList.add(getApplication().getResources().getColor(R.color.color2));
        colorList.add(getApplication().getResources().getColor(R.color.color3));
        colorList.add(getApplication().getResources().getColor(R.color.color4));

        pieDataSet.setColors(colorList);
        pieChart.animateY(3000,Easing.EaseInOutElastic);
        // pieChart.getLegend().setEnabled(false);
        pieChart.setCenterText("Favourite Food");
        pieChart.setCenterTextColor(getResources().getColor(R.color.colorPrimaryDark));
        // pieChart.setZ(200);
        pieChart.setCenterTextSize(20);


        pieChart.invalidate();
    }
}
