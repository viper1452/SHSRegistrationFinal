package com.antonio.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView tvAcademicProgram, FullN, Gender, CBox;

    String academicProgram, ln, fn, mn, gender, requirements, full_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvAcademicProgram = findViewById(R.id.tvAcademicProgram);
        FullN = findViewById(R.id.tvFullName);
        Gender = findViewById(R.id.tvGender);
        CBox = findViewById(R.id.tvRequirements);


        Intent intent = getIntent();
        academicProgram = intent.getStringExtra("academicProgram");
        ln = intent.getStringExtra("lastname");
        fn = intent.getStringExtra("firstname");
        mn = intent.getStringExtra("middlename");
        gender = intent.getStringExtra("gender");
        requirements = intent.getStringExtra("requirements");

        full_name = fn + " " + mn + " " + ln;


        tvAcademicProgram.setText(academicProgram);
        FullN.setText(full_name);
        Gender.setText(gender);
        CBox.setText(requirements);
    }
}
