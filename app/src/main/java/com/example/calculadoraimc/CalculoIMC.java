package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculoIMC extends AppCompatActivity {
    public EditText peso,altura;
    public TextView valorIMC, mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);
    }
    public void btnCalculaIMC(View v){
        //Declaração de variáveis
       double valorPeso, valorAltura, imc;
       String msg;
       //Associação de variaveis JAVA com os elementos XML
       peso = findViewById(R.id.ctxPeso);
       altura = findViewById(R.id.ctxAltura);
       valorIMC = findViewById(R.id.txtIMC);
       mensagem = findViewById(R.id.txtMensagem);
        //Obter dados da caixa de entrada
        // Transformação do CAST de double para STRING.
        valorPeso = Double.parseDouble(peso.getText().toString());
        valorAltura = Double.parseDouble(altura.getText().toString());
        //Calcular o IMC
        imc = valorPeso/(valorAltura*valorAltura);
        valorIMC.setText("IMC: "+imc);
        //mostrar  TOAST de IMC
        Toast.makeText(CalculoIMC.this,"IMC"+imc, Toast.LENGTH_LONG).show();
        //Avaliar a condição física
        if (imc<18.5) msg = "Abaixo do peso ideal";
        else if (imc<25) msg = "Está peso ideal";
        else if (imc<30) msg = "Está acima do peso ideal";
        else if (imc<35) msg = "Obesidade grau I";
        else if (imc<40) msg = "Obesidade grau II";
        else msg = "Obesidade grau III ou Mórbida";
        //MOSTRAR A MENSAGEM
        mensagem.setText(msg);
    }
    //BOTÃO DE VOLTAR AO MENU
    public void voltarimc(View v){
        Intent it = new Intent(CalculoIMC.this,Menu.class);
        startActivity(it);
        finish();
    }


}