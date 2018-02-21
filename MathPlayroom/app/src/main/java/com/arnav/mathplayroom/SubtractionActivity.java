package com.arnav.mathplayroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubtractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);
    }

    public void backButtonClickedForSubtraction(View view) {
        finish();
    }
}
