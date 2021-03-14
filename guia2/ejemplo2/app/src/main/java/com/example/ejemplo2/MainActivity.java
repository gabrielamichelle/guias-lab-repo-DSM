package com.example.ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void operar(View view) {
        et1=(EditText)findViewById(R.id.et_val1);
        et2=(EditText)findViewById(R.id.et_val2);
        tv1=(TextView)findViewById(R.id.tv_resultado);
        r1=(RadioButton)findViewById(R.id.rbt_suma);
        r2=(RadioButton)findViewById(R.id.rbt_resta);

        int nro1=Integer.parseInt(et1.getText().toString());
        int nro2=Integer.parseInt(et2.getText().toString());

        if (r1.isChecked()==true) {
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tv1.setText("Resultado: " + resu);
        } else
        if (r2.isChecked()==true) {
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            tv1.setText("Resultado: " + resu);
        }
    }

}