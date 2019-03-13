package com.example.sudhakar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView number;
   Button add_one,sub_one,clear;
   int value;
   private  static final String CONSTANT="constant";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.num);
        add_one=findViewById(R.id.add);
        sub_one=findViewById(R.id.sub);
        clear=findViewById(R.id.reset);

        if (savedInstanceState!=null){
            number.setText(savedInstanceState.getString(CONSTANT));
        }

        add_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=Integer.parseInt(number.getText().toString());
                number.setText(String.valueOf(value+1));
            }
        });

        sub_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=Integer.parseInt(number.getText().toString());
                number.setText(String.valueOf(value-1));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(String.valueOf(0));
            }
        });



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(CONSTANT,number.getText().toString());
    }
}
