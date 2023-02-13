package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pizza extends FastFood {

        Button pizzaLink;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.pizza);


            pizzaLink = findViewById(R.id.buttonPizzaLink);

            pizzaLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiszoHTvo_9AhXS-aQKHahDDPwQFnoECFEQAQ&url=https%3A%2F%2Ftasty.co%2Frecipe%2Fpizza-dough&usg=AOvVaw2iw2J0SyhiLb3V7SI2AbVq"));
                    startActivity(browserIntent);

                }
            });


        }
    }

