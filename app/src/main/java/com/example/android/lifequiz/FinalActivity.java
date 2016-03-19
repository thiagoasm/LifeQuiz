package com.example.android.lifequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class FinalActivity extends AppCompatActivity {
    String nome;
    int pontuacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent = getIntent();
        this.nome = intent.getStringExtra("nome");
        this.pontuacao = intent.getIntExtra("pontuacao", 0);
        displayPontuacao();

    }
    public void displayPontuacao(){

        TextView pontuacaoTextView = (TextView) findViewById(R.id.pontuacao_final);
        pontuacaoTextView.setText("Jogador: "+ nome+"\nPontuação: " + String.valueOf(pontuacao)
                + "\n A os instrutores, obrigado pela força!");

    }

}
