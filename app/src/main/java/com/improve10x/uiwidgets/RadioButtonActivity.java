package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        handleSelectedGender();
    }

    private void handleSelectedGender() {
        Button selectedBt = findViewById(R.id.selecte_btn);
        selectedBt.setOnClickListener(v -> {
       RadioGroup genderRg = findViewById(R.id.gender_rg);
       int selectedId = genderRg.getCheckedRadioButtonId();
       RadioButton genderRb = findViewById(selectedId);
       String gender = genderRb.getText().toString();
       RadioGroup nationalityRg = findViewById(R.id.nationality_rg);
       int selectedNationId = nationalityRg.getCheckedRadioButtonId();
       RadioButton selectedRb = findViewById(selectedNationId);
       String nationality = selectedRb.getText().toString();
            Toast.makeText(this, "\tGender : " + gender + "  " +  "\tNationality :  " + nationality, Toast.LENGTH_SHORT).show();
        });
    }
}