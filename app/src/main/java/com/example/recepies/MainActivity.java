package com.example.recepies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

Button tradition,fastFood,dessert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tradition=findViewById(R.id.traditionalImage);
        fastFood=findViewById(R.id.fastFoodImage);
        dessert=findViewById(R.id.desertImage);


        tradition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,Traditional.class);
                startActivity(intent);



            }
        });


        fastFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,FastFood.class);
                startActivity(intent);

            }
        });



        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,Dessert.class);
                startActivity(intent);

            }
        });



    }
}