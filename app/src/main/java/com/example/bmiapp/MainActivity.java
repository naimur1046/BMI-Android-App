package com.example.bmiapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editWeight;
    EditText editHegihtinFt;
    EditText editHeightInc;
    TextView resultShow;
    Button calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editHegihtinFt=findViewById(R.id.editHeightFt);
        editHeightInc=findViewById(R.id.editHeightIn);
        editWeight = findViewById(R.id.editWeight);
        resultShow=findViewById(R.id.resultShow);
        calculate=findViewById(R.id.btnCalculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int heightInFt= Integer.parseInt(editHegihtinFt.getText().toString());
                int weight = Integer.parseInt(editWeight.getText().toString());
                int heightInInc=Integer.parseInt(editHeightInc.getText().toString());
                int height=12*heightInFt+heightInInc;

                double totalcm=height*2.53;
                double totalM=totalcm/100;
                double bmi=(weight)/(totalM*totalM);

                resultShow.setText("BMI is "+bmi);


            }
        });

    }
}