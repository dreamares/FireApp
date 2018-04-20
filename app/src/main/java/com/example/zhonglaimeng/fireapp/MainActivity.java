package com.example.zhonglaimeng.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button myApplyBt;
    String myStringData;
    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myApplyBt = (Button)findViewById(R.id.button);
        myEditText = (EditText)findViewById(R.id.editText);
        myStringData = myEditText.getText().toString();

    }
}
