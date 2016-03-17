package com.example.android.lifequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int pontuacao = 0;
    String nome = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void proximaAtivity() {
        Intent nextActivity = new Intent(this, SecundActivity.class);

        nextActivity.putExtra("nome ", nome);
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
