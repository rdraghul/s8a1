package com.example.raghul.assdeclist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lv = (ListView) findViewById(R.id.list);

        final String[] months = new String[] {
                "Jan",
                "Feb", "March", "April", "May", "June", "July"
        };
        final int n=7;

        final List<String> ml = new ArrayList<String>(Arrays.asList(months));

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, ml);

        lv.setAdapter(arrayAdapter);

        Button as = (Button)findViewById(R.id.asc);
        Button de = (Button)findViewById(R.id.dec);

        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < n; i++)

                {

                    for (int j = i + 1; j < n; j++)

                    {
                        String temp;
                        if (months[i].compareTo(months[j])>0)

                        {

                            temp = months[i];

                            months[i] = months[j];

                            months[j] = temp;

                        }

                    }

                }
                final List<String> ml = new ArrayList<String>(Arrays.asList(months));

                final ArrayAdapter<String> arrayAdapters = new ArrayAdapter<String>
                        (MainActivity.this, android.R.layout.simple_list_item_1, ml);
                lv.setAdapter(arrayAdapters);
            }
        });

        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < n; i++)

                {

                    for (int j = i + 1; j < n; j++)

                    {
                        String temp;
                        if (months[i].compareTo(months[j])<0)

                        {

                            temp = months[i];

                            months[i] = months[j];

                            months[j] = temp;

                        }

                    }

                }
                final List<String> ml = new ArrayList<String>(Arrays.asList(months));

                final ArrayAdapter<String> arrayAdapters = new ArrayAdapter<String>
                        (MainActivity.this, android.R.layout.simple_list_item_1, ml);
                lv.setAdapter(arrayAdapters);
            }
        });
    }
}
