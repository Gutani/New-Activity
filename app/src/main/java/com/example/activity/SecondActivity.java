package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    private TextView nome, counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actitivity);
        nome = findViewById(R.id.nome);
        counter = findViewById(R.id.idade);
        //Allow you to recover the data that was sent on from the main activity
        Bundle data = getIntent().getExtras();
        String name = data.getString("nome");
        int age = data.getInt("age");
        nome.setText(name);
        counter.setText(String.valueOf(age));
    }
}