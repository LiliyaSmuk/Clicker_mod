package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private long score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainText;
        Button mainBtn;
        Button backBtn;
        ImageButton restartBtn;

        mainText = (TextView) findViewById(R.id.mainTxt);
        mainBtn = (Button) findViewById(R.id.main_btn);
        backBtn = (Button) findViewById(R.id.back_btn);
        restartBtn = (ImageButton) findViewById(R.id.restart_btn);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                String s;

                if (score % 10 <= 4 && score % 10 >= 2 && !(score % 100 > 10 && score % 100 < 20)) {
                    s = "Кнопка нажата " + score + " раза";
                } else {
                    s = "Кнопка нажата " + score + " раз";
                }
                mainText.setText(s.toCharArray(), 0, s.length());

            }
        };
        mainBtn.setOnClickListener(clickListener);


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (score != 0) {
                    score--;
                }

                String s;

                if (score % 10 <= 4 && score % 10 >= 2 && !(score % 100 > 10 && score % 100 < 20)) {
                    s = "Кнопка нажата " + score + " раза";
                } else {
                    s = "Кнопка нажата " + score + " раз";
                }

                mainText.setText(s.toCharArray(), 0, s.length());
            }
        });

        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                String s = "Кнопка нажата " + score + " раз";
                mainText.setText(s.toCharArray(), 0, s.length());
            }
        });

    }
}