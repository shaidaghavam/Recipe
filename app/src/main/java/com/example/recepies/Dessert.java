package com.example.recepies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dessert extends MainActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deserts);




        findViewById(R.id.cardRecipeDesert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Dessert.this,Donought.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.cardRecipeDesert2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Dessert.this,Pooding.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cardRecipeDesert3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Dessert.this,Tiramissu.class);
                startActivity(intent);

            }
        });


    }



}