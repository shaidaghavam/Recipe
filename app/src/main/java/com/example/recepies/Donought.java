package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Donought extends Dessert{

    Button donoughtLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donought);


        donoughtLink=findViewById(R.id.buttonDonoughtLink);

        donoughtLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiFzYTfuY_9AhVOsKQKHR3cAIwQFnoECFIQAQ&url=https%3A%2F%2Fcooking.nytimes.com%2Frecipes%2F1017060-doughnuts&usg=AOvVaw0wx5co3-1Mc-mVHFj_-KOt"));
                startActivity(browserIntent);

            }
        });

    }




}
