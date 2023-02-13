package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ghorme extends Traditional{

    Button ghormeLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ghorme);


        ghormeLink = findViewById(R.id.buttonGhormeLink);

        ghormeLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiwiKHLvY_9AhWDDewKHVn1AhkQFnoECEkQAQ&url=https%3A%2F%2Fcooking.nytimes.com%2Frecipes%2F1020209-khoresh-e-ghormeh-sabzi-persian-herb-bean-and-lamb-stew&usg=AOvVaw0RWBNdH4UMz4z813lO7RoM"));
                startActivity(browserIntent);

            }
        });


    }
}
