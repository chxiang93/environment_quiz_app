package com.example.mobileproject;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class play_page extends AppCompatActivity {
    TextView tv, tv_qno;
    Button prevButton, nextButton, quitButton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String[] questions = {
            "Which of the following is not a greenhouse gas?",
            "The use of fossil fuels is responsible for the increase in the amount of which gas in the atmosphere?",
            "Climate includes ...",
            "What is the most common type of waste that litters our oceans? ",
            "Which country currently emits the most greenhouse gases?",
            "For every tonne of paper recycled, we save ...",
            "Petroleum, coal and natural gas are all ...",
            "How long does it take for carbon dioxide (CO2) in the atmosphere to disperse?",
            "Global warming is caused ...",
            "Rainforests once covered 14% of the earth's land surface; now they cover .... "
    };
    String[] answers = {"Nitrogen","Carbon dioxide","All of these","Cigarettes","China","17 trees","Fossil fuels","100 years","Both by human and natural factors.","6%"};
    String[] opt = {
            "Nitrogen","Ozone","Methane","Carbon dioxide",
            "Argon","Ozone","Carbon dioxide","Nitrogen",
            "General patterns of atmosphere conditions","Seasonal variation","Average weather of an area","All of these",
            "Food packaging","Cigarettes","Plastic bags","Glass bottles",
            "Russia","China","USA","Germany",
            "17 trees","32 trees","46 trees","59 trees",
            "Environmentally friendly","Non-polluting","Renewable","Fossil fuels",
            "500 years","100 years","50 years","10 years",
            "Only by human activity.","Only by natural factors.","Mainly by natural factors.","Both by human and natural factors.",
            "6%","8%","10%","12%"
    };

    int flag=0;
    public static int marks=0, correct=0, wrong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_page);

        final TextView score = findViewById(R.id.score_result);

        nextButton = findViewById(R.id.button_next);
        quitButton = findViewById(R.id.buttonquit);
        tv = findViewById(R.id.tvque);
        tv_qno = findViewById(R.id.tv_question_no);

        radio_g=findViewById(R.id.answersgrp);
        rb1=findViewById(R.id.radioButton1);
        rb2=findViewById(R.id.radioButton2);
        rb3=findViewById(R.id.radioButton3);
        rb4=findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);

        nextButton.setOnClickListener(v -> {

            if(radio_g.getCheckedRadioButtonId() == -1)
            {
                Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton uans = findViewById(radio_g.getCheckedRadioButtonId());

            String ansText = uans.getText().toString();

            Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();

            if(ansText.equals(answers[flag])) {
                correct++;
                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
            }
            else {
                wrong++;
                Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
            }

            flag++;

            if (score != null)
                score.setText("" + correct);

            if(flag < questions.length)
            {
                String qno = (flag + 1) + "/10";
                tv_qno.setText(qno);
                tv.setText(questions[flag]);
                rb1.setText(opt[flag*4]);
                rb2.setText(opt[flag*4 +1]);
                rb3.setText(opt[flag*4 +2]);
                rb4.setText(opt[flag*4 +3]);
            }
            else
            {
                marks=correct;
                Intent in = new Intent(getApplicationContext(), result_page.class);
                startActivity(in);
                finish();
            }

            radio_g.clearCheck();
        });

        quitButton.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), result_page.class);
            startActivity(intent);
            finish();
        });
    }

}
