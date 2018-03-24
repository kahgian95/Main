package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    TextView tv1, tv2;
    RadioButton rdbtn1, rdbtn2;
    CheckBox cb1, cb2, cb3;
    int correct;
    //this is latest update

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        rdbtn1 = (RadioButton) findViewById(R.id.rdbtn1);
        rdbtn2 = (RadioButton) findViewById(R.id.rdbtn2);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        btn1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (rdbtn1.isChecked())
            correct++;
        if (cb1.isChecked()|cb2.isChecked()|cb3.isChecked())
            correct++;
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv1.setText("Answer: 1)O 2)Bonus");
        tv2.setText("Answer: "+correct+"/2");
        Toast.makeText(getApplicationContext(),"Congratulations!!! Quiz is done!!!",Toast.LENGTH_LONG).show();
        correct=0;
    }
}
