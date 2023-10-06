package com.example.calcsenai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText primeiro_valor, segundo_valor;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;

    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primeiro_valor = findViewById(R.id.primeiro_valor);
        segundo_valor = findViewById(R.id.segundo_valor);

        txtResultado = findViewById(R.id.txtResultado);

        btnSomar = findViewById(R.id.btnSomar);


        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int valor1 = Integer.parseInt(primeiro_valor.getText().toString());
                int valor2 = Integer.parseInt(segundo_valor.getText().toString());

                int result = valor1 + valor2;

                txtResultado.setText(String.valueOf(result));

            }
        });

    }
}