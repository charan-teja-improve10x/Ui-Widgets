package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {
    TimePicker clockTp;
    TextView timeTxt;
    Button changeTimeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        clockTp = findViewById(R.id.clock_tp);
        timeTxt = findViewById(R.id.time_txt);
        changeTimeBtn = findViewById(R.id.change_time_btn);
        clockTp.setIs24HourView(true);
        handleChangeTimeBtn();
        showCurrentTime();
    }

    private void showCurrentTime() {
        String selectedTime = getSelectedTime();
        timeTxt.setText("Current Time : " + selectedTime);
    }

    private void handleChangeTimeBtn() {
        changeTimeBtn.setOnClickListener(v -> {
            String selectedTime = getSelectedTime();
            timeTxt.setText("Changed Time :" + selectedTime);
        });
    }
    public String getSelectedTime(){
        int hours = clockTp.getCurrentHour();
        int minuts = clockTp.getCurrentMinute();
        String selectedTime = getTime(hours, minuts);
        return selectedTime;
    }

    private String getTime(int hours, int minuts) {
        return getString(hours, minuts);
    }

    private String getString(int hours, int minuts) {
        return hours + " : " + minuts;
    }

}