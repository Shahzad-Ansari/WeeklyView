package com.example.shahz.weeklyview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class WeeklyView extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_view);

        Calendar  weekInfo = Calendar.getInstance();

        int year = weekInfo.get(Calendar.YEAR);
        int month = weekInfo.get(Calendar.MONTH);
        int day = weekInfo.get(Calendar.DAY_OF_MONTH);
        

        ListView list = (ListView)findViewById(R.id.WeekList);

        ArrayList<String> weekNames = new ArrayList<>();
        weekNames.add("Monday");
        weekNames.add("Tuesday");
        weekNames.add("Wednesday");
        weekNames.add("Thursday");
        weekNames.add("Friday");
        weekNames.add("Saturday");
        weekNames.add("Sunday");

        ArrayAdapter adapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1, weekNames);
        list.setAdapter(adapter);










    }
}
