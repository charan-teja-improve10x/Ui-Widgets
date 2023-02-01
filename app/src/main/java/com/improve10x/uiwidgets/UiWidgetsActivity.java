package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class UiWidgetsActivity extends AppCompatActivity {
    Button seekbarBtn;
    SeekBar musicSb;
    Button submitBtn;
    TextView progressTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_widgets);
        initViews();
        handleSeekbarBtn();
        handleSubmitBtn();
    }



    private void initViews() {
        seekbarBtn = findViewById(R.id.seekbar_btn);
        musicSb = findViewById(R.id.music_sb);
        submitBtn = findViewById(R.id.submit_btn);
        progressTxt = findViewById(R.id.progress_txt);
    }
    public void handleSeekbarBtn(){
        seekbarBtn.setOnClickListener(v -> {
            musicSb.setVisibility(View.VISIBLE);
        });
    }

    public void handleSubmitBtn(){
        submitBtn.setOnClickListener(v -> {
            int progress = musicSb.getProgress();
            progressTxt.setText(progress + " ");
        });
    }
}