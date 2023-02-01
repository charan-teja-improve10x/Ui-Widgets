package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class UiWidgetsActivity extends AppCompatActivity {
    Button seekbarBtn;
    Button ratingberBtn;
    SeekBar musicSb;
    RatingBar ratingbarRb;
    Button submitBtn;
    TextView progressTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_widgets);
        initViews();
        handleSeekbarBtn();
        handleSubmitBtn();
        handleRatingBarBtn();
    }

    private void initViews() {
        seekbarBtn = findViewById(R.id.seekbar_btn);
        musicSb = findViewById(R.id.music_sb);
        submitBtn = findViewById(R.id.submit_btn);
        progressTxt = findViewById(R.id.progress_txt);
        ratingbarRb = findViewById(R.id.ratingbar_rb);
        ratingberBtn = findViewById(R.id.ratingbar_btn);
    }

    public void handleSeekbarBtn() {
        seekbarBtn.setOnClickListener(v -> {
            ratingbarRb.setVisibility(View.GONE);
            musicSb.setVisibility(View.VISIBLE);
        });
    }

    public void handleRatingBarBtn(){
        ratingberBtn.setOnClickListener(v -> {
            musicSb.setVisibility(View.GONE);
            ratingbarRb.setVisibility(View.VISIBLE);
        });
    }

    public void handleSubmitBtn() {
        submitBtn.setOnClickListener(v -> {
            int progress = musicSb.getProgress();
            progressTxt.setText(progress + " ");
            String rating = String.valueOf(ratingbarRb.getRating());
            progressTxt.setText(rating );
        });
    }
}