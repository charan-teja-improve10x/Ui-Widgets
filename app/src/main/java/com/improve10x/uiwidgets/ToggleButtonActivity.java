package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        handleSubmitButton();
    }

    private void handleSubmitButton() {
        ToggleButton toggleBtn1 = findViewById(R.id.toggle_btn1);
        ToggleButton toggleBtn2 = findViewById(R.id.toggle_btn2);
        Button submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(v -> {
            String toggleOne = toggleBtn1.getText().toString();
            String toggleTwo = toggleBtn2.getText().toString();
            String statusOfTogglessBtns = getStatusOfToggles(toggleOne,toggleTwo);
            Toast.makeText(this, statusOfTogglessBtns, Toast.LENGTH_SHORT).show();
        });
    }
    public String getStatusOfToggles(String toggleBtn1, String toggleBtn2) {
        StringBuilder result = new StringBuilder();
        result.append("Toggle1 Status : ").append(toggleBtn1);
        result.append("\n Toggle2 Status : ").append(toggleBtn2);
        return String.valueOf(result);
    }
}

