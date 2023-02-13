package com.example.recepies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrenchFries extends FastFood {

    Button frenchLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frenchfries);


        frenchLink = findViewById(R.id.buttonFrenchLink);

        frenchLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjezdDCvI_9AhUHHewKHWfXCFYQFnoECFkQAQ&url=https%3A%2F%2Fthecozycook.com%2Fhomemade-french-fries%2F&usg=AOvVaw3q9lLOZtEEMb0m633q9wa3"));
                startActivity(browserIntent);

            }
        });


    }
}
