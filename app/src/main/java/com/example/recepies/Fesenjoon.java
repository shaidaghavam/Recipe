package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fesenjoon extends Traditional {

    Button fesenLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fesenjoon);


        fesenLink=findViewById(R.id.buttonFesenlink);

        fesenLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjW87Tquo_9AhVlMOwKHQWxD2QQFnoECBoQAQ&url=https%3A%2F%2Fwww.simplyrecipes.com%2Frecipes%2Ffesenjan_persian_chicken_stew_with_walnut_and_pomegranate_sauce%2F&usg=AOvVaw1cTEr2kAavIrC4eukB3Jiv"));
                startActivity(browserIntent);

            }
        });

    }
}
