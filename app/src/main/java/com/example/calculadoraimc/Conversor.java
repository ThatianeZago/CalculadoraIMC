package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Conversor extends AppCompatActivity {

    public EditText litro;
    public TextView valorG, valorML, valorFL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
    }

    public void btnConGAL(View v) {

        //Declaração de variáveis
        Double valorLitro, Gal;

        //Associação de variaveis JAVA com os elementos XML
        litro = findViewById(R.id.ctxLitro);
        valorG = findViewById(R.id.txtConversao);

        //Obter dados da caixa de entrada
        valorLitro = Double.parseDouble(litro.getText().toString());

        //Calcular a conversão
        Gal = valorLitro * 0.26;

        valorG.setText("Litros para Galão: " + Gal);

        //mostrar  TOAST de LITROS
        Toast.makeText(Conversor.this, "Conversão efetuada!", Toast.LENGTH_LONG).show();
    }


    public void btnConvMl (View v) {

        // declaração variaveis :
        Double valorLitro, mLit;

        //Associação de variaveis JAVA com os elementos XML
        litro = findViewById(R.id.ctxLitro);
        valorML = findViewById(R.id.txtConversao);

        //Obter dados da caixa de entrada
        valorLitro = Double.parseDouble(litro.getText().toString());

        //Calcular a conversão
        mLit = valorLitro * 1000;

        valorML.setText("Litros para Mililitros: " + mLit);

        //mostrar  TOAST de LITROS
        Toast.makeText(Conversor.this, "Conversão efetuada!", Toast.LENGTH_LONG).show();
    }

    public void btnConvFLOZ(View v) {

        //Declaração variaveis:
        Double valorLitro, Onc;

        //Associação de variaveis JAVA com os elementos XML
        litro = findViewById(R.id.ctxLitro);
        valorFL = findViewById(R.id.txtConversao);

        //Obter dados da caixa de entrada
        valorLitro = Double.parseDouble(litro.getText().toString());

        //Calcular a conversão
        Onc = valorLitro * 33.8;

        valorFL.setText("Litros para Onça Fluída: " + Onc);

        //mostrar  TOAST de LITROS
        Toast.makeText(Conversor.this, "Conversão efetuada!", Toast.LENGTH_LONG).show();
    }

    //BOTÃO DE VOLTAR AO MENU
    public void voltar(View v){
        Intent it = new Intent(Conversor.this,Menu.class);
        startActivity(it);
        finish();}
}
