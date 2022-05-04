package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnRecipe);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent activity = new Intent(this, RecipeGuide.class);
        startActivity(activity);
    }
}