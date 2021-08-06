package com.flashcardnamechange.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class startingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_page);


        findViewById(R.id.startButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(startingPage.this, MainActivity.class);
                startingPage.this.startActivityForResult(intent, 100);
            }
        });

        findViewById(R.id.LogSignButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(startingPage.this, LogOrSign.class);
                startingPage.this.startActivityForResult(intent, 100);
            }
        });






    }
}