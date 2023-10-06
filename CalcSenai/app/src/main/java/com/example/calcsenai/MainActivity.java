package com.example.calcsenai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText primeiro_valor, segundo_valor;
    TextView txtResult;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        primeiro_valor = findViewById(R.id.primeiro_valor);
        segundo_valor = findViewById(R.id.segundo_valor);
        txtResult = findViewById(R.id.txtResult);

        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnLimpar = findViewById(R.id.btnLimpar);

        btnSomar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int valor1 = Integer.parseInt(primeiro_valor.getText().toString());
                int valor2 = Integer.parseInt(segundo_valor.getText().toString());
                int result = valor1 + valor2;

                txtResult.setText(String.valueOf(result));
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int valor1 = Integer.parseInt(primeiro_valor.getText().toString());
                int valor2 = Integer.parseInt(segundo_valor.getText().toString());
                int result = valor1 - valor2;

                txtResult.setText(String.valueOf(result));
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int valor1 = Integer.parseInt(primeiro_valor.getText().toString());
                int valor2 = Integer.parseInt(segundo_valor.getText().toString());
                int result = valor1 * valor2;

                txtResult.setText(String.valueOf(result));
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int valor1 = Integer.parseInt(primeiro_valor.getText().toString());
                int valor2 = Integer.parseInt(segundo_valor.getText().toString());


                if (valor1 == 0 || valor2 == 0 ) {

                    Toast.makeText(
                            getApplicationContext(),
                            "Operação Invalida!",
                            Toast.LENGTH_LONG
                    ).show();
                }else {
                    int result = valor1 / valor2;
                    txtResult.setText(String.valueOf(result));
                }

            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                txtResult.setText("");
                primeiro_valor.setText("");
                segundo_valor.setText("");
                primeiro_valor.requestFocus();
            }
        });

    }
}