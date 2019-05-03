package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.quizapp.R.id.ListViewID;

public class CoursesActivity extends AppCompatActivity {

  private ListView listView;
  private String coursenames[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        coursenames = getResources().getStringArray(R.array.Course_names);
        listView = (ListView) findViewById(ListViewID);
        CustomAdapter adapter = new CustomAdapter(this,coursenames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = coursenames[position];
                Toast.makeText(CoursesActivity.this, value, Toast.LENGTH_SHORT).show();

                if (position==0) {
                    Intent intent = new Intent(view.getContext(),ComputerProgrammingQZActivity.class);
                    startActivityForResult(intent,0);

                }
                if (position==1) {
                    Intent intent = new Intent(view.getContext(),ObjectOrientedProgrammingQZActivity.class);
                    startActivityForResult(intent,1);

                }
                if (position==2) {
                    Intent intent = new Intent(view.getContext(),DataStructureAndAlgoQZActivity.class);
                    startActivityForResult(intent,2);

                }
                if (position==3) {
                    Intent intent = new Intent(view.getContext(),DataBaseSystemsQZActivity.class);
                    startActivityForResult(intent,3);

                }

            }
        });

    }
}

