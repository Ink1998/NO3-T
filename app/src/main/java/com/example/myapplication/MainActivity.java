package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText FeditText;
EditText CeditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FeditText =(EditText)findViewById(R.id.FahNumber);
        CeditText=findViewById(R.id.CelsiusNumber);

        final Button button = (Button) findViewById(R.id.Conversion);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double T;
                if(FeditText.getText().toString().matches("") && CeditText.getText().toString().matches("")) {
                    Toast toast = Toast.makeText(MainActivity.this, "欄位不能是空白!!", Toast.LENGTH_LONG);
                    toast.show();
                }
                else if(!FeditText.getText().toString().matches("") && CeditText.getText().toString().matches("")) {
                    double FTI = Double.parseDouble(FeditText.getText().toString());
                    T = (FTI - 32) * 5 / 9;
                    CeditText.setText(String.valueOf(T));
                }
                else if(FeditText.getText().toString().matches("") && !CeditText.getText().toString().matches(""))
                {
                    double CTI = Double.parseDouble(FeditText.getText().toString());
                    T = CTI * 9 / 5 + 32;
                    FeditText.setText(String.valueOf(T));
                }

            }
        });



    }


}
