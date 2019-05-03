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
import static com.example.quizapp.R.id.coursenameID;
import static com.example.quizapp.R.id.parent;

public class QuizBankActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_bank);

        listView = (ListView) findViewById(ListViewID);
        final String[] coursenames = getResources().getStringArray(R.array.Course_names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( QuizBankActivity.this,R.layout.quizbank_sampleview,R.id.textViewID,coursenames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = coursenames[position];
                Toast.makeText(QuizBankActivity.this, value, Toast.LENGTH_SHORT).show();

                if (position==0) {
                    Intent myintent = new Intent(view.getContext(),ComputerProgrammingQBActivity.class);
                    startActivityForResult(myintent,0);

                }
                if (position==1) {
                    Intent myintent = new Intent(view.getContext(),ObjectOrientedProgrammingQBActivity.class);
                    startActivityForResult(myintent,1);

                }
                if (position==2) {
                    Intent myintent = new Intent(view.getContext(),DataStructureAndAlgoQBActivity.class);
                    startActivityForResult(myintent,2);

                }
                if (position==3) {
                    Intent myintent = new Intent(view.getContext(),DataBaseSystemsQBActivity.class);
                    startActivityForResult(myintent,3);

                }
            }

        });
    }
}
