package com.example.myapplicationejerciciotablamultiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    private EditText et_numero, et_tabla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numero = (EditText) findViewById(R.id.et_numero);
        et_tabla = (EditText) findViewById(R.id.et_tabla);
    }

    public void Mostrar(View view) {
        String numero_String = et_numero.getText().toString();

        String resultado = "Esta es la tabla del " + numero_String + "\n";
        int numero_int = Integer.parseInt(numero_String);
        int calculo;



            for (int i = 1; i < 11; i++) {
                calculo = numero_int * i;
                resultado = resultado + numero_int + " x " + i + " = " + calculo + "\n";

            }
            et_tabla.setText(resultado);

        }

// Botón Ir a Archivo //

    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, MainActivity2.class);
        startActivity(siguiente);
    }

}
