package com.arnav.mathplayroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void buttonClicked(View view) {

        if (view.getId() == R.id.additionButton) {

            Intent adittionIntent = new Intent(this, AdditionActivity.class);
            startActivity(adittionIntent);

        } else if (view.getId() == R.id.subtractionButton) {

            Intent subtractionIntent = new Intent(this, SubtractionActivity.class);
            startActivity(subtractionIntent);

        } else if (view.getId() == R.id.multiplicationButton) {

            Intent multiplicationIntent = new Intent(this, MultiplicationActivity.class);
            startActivity(multiplicationIntent);

        } else { // division

            Intent divisionIntent = new Intent(this, DivisionActivity.class);
            startActivity(divisionIntent);

        }
    }
}
