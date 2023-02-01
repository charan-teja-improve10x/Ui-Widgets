package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        playButton();
    }

    private void playButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
            EditText edit1txt = findViewById(R.id.edit1_txt);
            EditText edit2Txt = findViewById(R.id.edit2_txt);
            String num1 = edit1txt.getText().toString();
            String num2 = edit2Txt.getText().toString();
            String result = add(num1, num2);
            Toast.makeText(this, "SUM : " + result, Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int sum = a + b ;
        return String.valueOf(sum);

    }
}
/*
    private void playButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
            EditText edit1Txt = findViewById(R.id.edit1_txt);
            EditText edit2Txt = findViewById(R.id.edit2_txt);
            String num1 = edit1Txt.getText().toString();
            String num2 = edit2Txt.getText().toString();
            String result = add (num1, num2);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int sum = a + b ;
        return String.valueOf(sum);
    }

 */