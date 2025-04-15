package com.example.testrun;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button blackbutton, redbutton, transparentbutton, yellowbutton, greenbutton, bluebutton, graybutton, magentabutton, continueButton;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackbutton = findViewById(R.id.blackbutton10);
        redbutton = findViewById(R.id.redbutton11);
        transparentbutton = findViewById(R.id.transparentbutton15);
        yellowbutton = findViewById(R.id.yellowbutton13);
        greenbutton = findViewById(R.id.greenbutton12);
        bluebutton = findViewById(R.id.bluebutton16);
        graybutton = findViewById(R.id.graybutton17);
        magentabutton = findViewById(R.id.magentabutton14);
        layout = findViewById(R.id.main); // Use the correct ID for the LinearLayout

        blackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.BLACK);
            }
        });

        redbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.RED);
            }
        });

        transparentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        yellowbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.YELLOW);
            }
        });

        greenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.GREEN);
            }
        });

        bluebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.BLUE);
            }
        });

        graybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.GRAY);
            }
        });

        magentabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.MAGENTA);
            }
        });
    }

    public void disable(View v) {
        v.setEnabled(true);
    }
}