package com.arnav.mathplayroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
    }

    public void backButtonClickedForAddition(View view) {
        finish();
    }

    public void continueButtonClicked(View view) {

        Spinner levelSpinner = findViewById(R.id.levelSpinner);

        Intent intent = new Intent(this, MainAdditionGameActivity.class);
        intent.putExtra("Level", (String) levelSpinner.getSelectedItem());
        startActivity(intent);
    }
}
