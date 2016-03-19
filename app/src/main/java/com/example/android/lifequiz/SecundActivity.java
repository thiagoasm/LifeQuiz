package com.example.android.lifequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecundActivity extends AppCompatActivity {
    String nome;
    int pontuacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secund);

        Intent intent = getIntent();
        this.nome = intent.getStringExtra("nome");
        pontuacao = intent.getIntExtra("pontuacao", 0);


    }


    public void proximaAtivity() {
        Intent nextActivity = new Intent(this, ThirdActivity.class);

        nextActivity.putExtra("nome", nome);
        nextActivity.putExtra("pontuacao", pontuacao);
        startActivity(nextActivity);
    }

    public void opcaoA(View view) {


        proximaAtivity();

    }

    public void opcaoC(View view) {

        proximaAtivity();


    }

    public void opcaoB(View view) {
        pontuacao = pontuacao + 25;
        proximaAtivity();

    }

    public void opcaoD(View view) {

        proximaAtivity();


    }


}
