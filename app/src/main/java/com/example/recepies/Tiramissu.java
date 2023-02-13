package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tiramissu extends Dessert{

    Button tiramissuLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tiramissu);


        tiramissuLink = findViewById(R.id.buttonTiramissuLink);

        tiramissuLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwix1LHswI_9AhXM2KQKHTX8BNcQFnoECFEQAQ&url=https%3A%2F%2Fcooking.nytimes.com%2Frecipes%2F1018684-classic-tiramisu&usg=AOvVaw18C6yUriVK8gzMEVaUCyp4"));
                startActivity(browserIntent);

            }
        });


    }
}
