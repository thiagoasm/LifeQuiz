package com.example.android.lifequiz;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {
    int pontuacao = 0;
    String nome = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent intent = getIntent();
        this.nome = intent.getStringExtra("nome");



    }

    public void proximaAtivity() {
        Intent nextActivity = new Intent(this, SecundActivity.class);

        nextActivity.putExtra("nome", nome);
        nextActivity.putExtra("pontuacao", pontuacao);

        startActivity(nextActivity);
    }

    public void opcaoA(View view) {

        pontuacao = pontuacao + 25;

        proximaAtivity();

    }

    public void opcaoC(View view) {

        proximaAtivity();


    }

    public void opcaoB(View view) {

        proximaAtivity();

    }

    public void opcaoD(View view) {

        proximaAtivity();


    }


}