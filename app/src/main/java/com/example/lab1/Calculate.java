package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        // inflate
        EditText etFirstNumber = findViewById(R.id.calculate_et_first_num);
        EditText etSecondNumber = findViewById(R.id.calculate_et_second_num);
        Button btnSum = findViewById(R.id.calculate_btn_sum);
        TextView tvResult = findViewById(R.id.calculate_tv_result);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String num1 = etFirstNumber.getText().toString();
               String num2 = etSecondNumber.getText().toString();
               int number1 = Integer.parseInt(num1);
               int number2 = Integer.parseInt(num2);
               int sum = number1 + number2;
                tvResult.setText("Result:"+sum);
            }
        });


    }
}