package com.fati.tablademultliplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Creación de objetos
    EditText txtnum;

    Button btnMulti, btnSalir;

    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum = findViewById(R.id.numeroMul);

        btnMulti = findViewById(R.id.buttonMultiplicar);
        btnSalir = findViewById(R.id.buttonSalir);

        resultado = findViewById(R.id.txtRes);

        btnMulti.setOnClickListener(V->{

            int num = Integer.parseInt(txtnum.getText().toString());
            String mul = "";

            for ( int i = 1; i <= 10; i++) {

                mul += num + " x " + i + "  =  " + i * num + "\n";
                resultado.setText(mul);

            }
        });

        btnSalir.setOnClickListener(V->finish());

    }
}