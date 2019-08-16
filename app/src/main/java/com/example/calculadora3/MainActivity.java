package com.example.calculadora3;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValor1;
    private EditText editValor2;
    private TextView txtResultadoOperacao;
    private Button buttonMais, buttonMenos, buttonDivisao, buttonMultiplicacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor1 = findViewById(R.id.editValor1);
        editValor2 = findViewById(R.id.editValor2);
        txtResultadoOperacao = findViewById(R.id.txtResultadoOperacao);
        buttonMais = findViewById(R.id.buttonMais);
        buttonMenos = findViewById(R.id.buttonMenos);
        buttonDivisao = findViewById(R.id.buttonDivisao);
        buttonMultiplicacao = findViewById(R.id.buttonMultiplicacao);

        buttonMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = editValor1.getText().toString();
                String v2 = editValor2.getText().toString();

                if(v1.isEmpty() || v2.isEmpty()){
                    AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
                    dig.setMessage("Falta valores");
                    dig.setNeutralButton("OK", null);
                    dig.show();
                }else {
                    Double v1Double = Double.parseDouble(v1);
                    Double v2Double = Double.parseDouble(v2);
                    Double result = v1Double + v2Double;
                    txtResultadoOperacao.setText(Double.toString(result));
                }

            }
        });

        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = editValor1.getText().toString();
                String v2 = editValor2.getText().toString();

                Double v1Double = Double.parseDouble(v1);
                Double v2Double = Double.parseDouble(v2);

                Double result = v1Double - v2Double;

                txtResultadoOperacao.setText(Double.toString(result));
            }
        });

        buttonMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = editValor1.getText().toString();
                String v2 = editValor2.getText().toString();

                Double v1Double = Double.parseDouble(v1);
                Double v2Double = Double.parseDouble(v2);

                Double result = v1Double * v2Double;

                txtResultadoOperacao.setText(Double.toString(result));
            }
        });

    }
}
