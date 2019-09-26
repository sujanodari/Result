package com.sujan.result;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etName, etAndroid, etIOT,etWeb;
    Button btnCalculate;
    TextView tvResult;

    String name;
    int android, iot, web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        etAndroid=findViewById(R.id.etAndroid);
        etIOT=findViewById(R.id.etIOT);
        etWeb=findViewById(R.id.etWeb);
        tvResult=findViewById(R.id.tvResult);
        btnCalculate=findViewById(R.id.btnCalculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etName.getText().toString())){
                    etName.setError("Enter  Name");
                    return;
                }
                else if(TextUtils.isEmpty(etAndroid.getText().toString())){
                    etAndroid.setError("Enter  Marks");
                    return;
                }
                else if(TextUtils.isEmpty(etIOT.getText().toString())){
                    etIOT.setError("Enter Marks");
                    return;
                }
                else if(TextUtils.isEmpty(etWeb.getText().toString())){
                    etWeb.setError("Enter Marks");
                    return;
                }


                name=etName.getText().toString();
                android=Integer.parseInt(etAndroid.getText().toString());
                iot=Integer.parseInt(etIOT.getText().toString());
                web=Integer.parseInt(etWeb.getText().toString());

                tvResult.append(System.lineSeparator());
                tvResult.append("Name : "+name +" Android : "+android +"%"+ " IOT : "+ iot+"%"+ " Web : "+web+"%");


                etName.setText("");
                etAndroid.setText("");
                etIOT.setText("");
                etWeb.setText("");
    }
});




        }
}
