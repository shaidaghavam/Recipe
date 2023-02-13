package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pooding extends Dessert{

    Button poodingLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pooding);


        poodingLink = findViewById(R.id.buttonPoodingLink);

        poodingLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiC9t7zv4_9AhWMzKQKHVPLALsQFnoECBQQAQ&url=https%3A%2F%2Fwww.mybakingaddiction.com%2Fhomemade-vanilla-pudding%2F&usg=AOvVaw2BJY_MCt5Y6Nmx_kAdqA3-"));
                startActivity(browserIntent);

            }
        });


    }
}
