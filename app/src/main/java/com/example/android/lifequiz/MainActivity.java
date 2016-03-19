package com.example.android.lifequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void iniciarQuiz(View view) {

        EditText nameField = (EditText) findViewById(R.id.name_field);
        nome = nameField.getText().toString();
        proximaAtivity();
    }


    public void proximaAtivity() {
        Intent nextActivity = new Intent(this, FirstActivity.class);
        nextActivity.putExtra("nome", nome);
        startActivity(nextActivity);
    }
}
