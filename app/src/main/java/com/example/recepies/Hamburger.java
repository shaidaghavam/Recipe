package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hamburger extends FastFood{

    Button hamburgerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hamburger);


        hamburgerLink = findViewById(R.id.buttonHamburgerLink);

        hamburgerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwj16bzbvY_9AhV7xAIHHQmGDOEQFnoECBYQAQ&url=https%3A%2F%2Fwww.aspicyperspective.com%2Fbest-hamburger-patty-recipe%2F&usg=AOvVaw2598FbFFHt_Y7CuTYbnnoh"));
                startActivity(browserIntent);

            }
        });


    }
}
