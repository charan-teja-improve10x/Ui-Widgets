package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class SeekBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
       handleSeekBar();
    }

    private void handleSeekBar() {
       SeekBar brightnessSb = findViewById(R.id.brightness_sb);
       brightnessSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               Toast.makeText(SeekBarActivity.this, " SeekbarProgress : " + progress, Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {
               Toast.makeText(SeekBarActivity.this, "Seekbar Touch Started", Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {
               Toast.makeText(SeekBarActivity.this, "Seekbar Touch Stoped", Toast.LENGTH_SHORT).show();
           }
       });
    }
}