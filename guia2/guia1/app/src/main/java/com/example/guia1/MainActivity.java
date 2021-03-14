package com.example.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //creando el metodo que se ejecutara al presionar el boton
    public void sumar(View vista) {
        int n1, n2, suma;
        et1 = (EditText)findViewById(R.id.et_val1);
        et2 = (EditText)findViewById(R.id.et_val2);
        tv_result = (TextView)findViewById(R.id.tv_resultado);
        n1 = Integer.parseInt(et1.getText().toString());
        n2 = Integer.parseInt(et2.getText().toString());
        suma = n1 + n2;
        tv_result.setText("Resultado: " + suma);
    }
}