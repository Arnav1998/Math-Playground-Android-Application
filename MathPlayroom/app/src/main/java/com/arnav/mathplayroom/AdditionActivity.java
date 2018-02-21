package com.arnav.mathplayroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
    }

    public void backButtonClickedForAddition(View view) {
        finish();
    }
}
