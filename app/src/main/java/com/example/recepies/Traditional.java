package com.example.recepies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public  class  Traditional extends MainActivity {

    Button backTradition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traditional);

        backTradition = findViewById(R.id.backTraditional);

        backTradition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Traditional.this, MainActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.cardRecipeTraditional).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Traditional.this, Ghorme.class);
                startActivity(intent);


            }
        });

        findViewById(R.id.cardRecipeTraditional2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Traditional.this, Ash.class);
                startActivity(intent);


            }
        });


        findViewById(R.id.cardRecipeTraditional3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Traditional.this, Fesenjoon.class);
                startActivity(intent);


            }
        });




    }
}