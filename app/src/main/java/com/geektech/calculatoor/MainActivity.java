package com.geektech.calculatoor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnadd, btnsub, btnmul, btndiv;
    TextView Result;
    EditText fir, sec;
    int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = findViewById(R.id.badd);
        btnsub = findViewById(R.id.bsub);
        btnmul = findViewById(R.id.bmul);
        btndiv = findViewById(R.id.bdiv);
        Result = findViewById(R.id.result);
        fir = findViewById(R.id.fir);
        sec = findViewById(R.id.sec);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer first = Integer.parseInt(fir.getText().toString());
                Integer second = Integer.parseInt(sec.getText().toString());
                Result.setText(first+second);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer first = Integer.parseInt(fir.getText().toString());
                Integer second = Integer.parseInt(sec.getText().toString());
                Result.setText(first-second);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer first = Integer.parseInt(fir.getText().toString());
                Integer second = Integer.parseInt(sec.getText().toString());
                Result.setText(first*second);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer first = Integer.parseInt(fir.getText().toString());
                Integer second = Integer.parseInt(sec.getText().toString());
                Result.setText(Double.toString(first/second));
            }
        });
    }
}
