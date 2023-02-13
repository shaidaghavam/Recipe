package com.example.recepies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FastFood extends MainActivity {

    Button backFast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fastfood);

        backFast=findViewById(R.id.backFastFood);


        findViewById(R.id.cardRecipeFastFood).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FastFood.this,Pizza.class);
                startActivity(intent);



            }
        });


        findViewById(R.id.cardRecipeFastFood2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FastFood.this,Hamburger.class);
                startActivity(intent);



            }
        });

        findViewById(R.id.cardRecipeFastFood3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FastFood.this,FrenchFries.class);
                startActivity(intent);


            }
        });


        backFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FastFood.this,MainActivity.class);
                startActivity(intent);




            }
        });


    }
}