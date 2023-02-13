package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ash extends Traditional{

    Button ashLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ash);


        ashLink=findViewById(R.id.buttonAshLink);

        ashLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&ved=2ahUKEwj75t3Kt4_9AhUKzaQKHZ87AQQQFnoECFwQAQ&url=https%3A%2F%2Fcooking.nytimes.com%2Frecipes%2F1020205-ash-reshteh-persian-greens-bean-and-noodle-soup&usg=AOvVaw1TVfHUl_hpK5yStG6cHFgD "));
                startActivity(browserIntent);

            }
        });

    }

}
