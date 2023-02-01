package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {
    DatePicker calenderDp;
    TextView dateTxt;
    Button changeDateBtn;
    TextView leapYearTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        calenderDp = findViewById(R.id.calender_dp);
        dateTxt = findViewById(R.id.date_txt);
        changeDateBtn = findViewById(R.id.change_date_btn);
        leapYearTxt = findViewById(R.id.leap_year_txt);
        handelChangeDate();
        showCurrentdate();
    }

    private void showCurrentdate() {
        String selectedDate = getSelecteddatedDate();
        dateTxt.setText("Current Date : " + selectedDate);
    }

    private void handelChangeDate() {
        changeDateBtn.setOnClickListener(v -> {
            String selectedDate = getSelecteddatedDate();
            dateTxt.setText("Changed Date : " + selectedDate);
            String selectedYear = checkLeapYear(calenderDp.getYear());
            leapYearTxt.setText(selectedYear);

        });
    }

    public String getSelecteddatedDate() {
        int date = calenderDp.getDayOfMonth();
        int month = calenderDp.getMonth() + 1;
        int year = calenderDp.getYear();
        String selectedDate = createDate(date, month, year);
        return selectedDate;
    }

    private String createDate(int date, int month, int year) {
        return date + " / " + month + " / " + year;
    }
    public String checkLeapYear(int year){
        if(year % 4 == 0){
            return year + " is a LeapYear";
        } else {
            return year + " is not a LeapYear";

        }
    }

}