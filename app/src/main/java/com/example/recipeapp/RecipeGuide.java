package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class RecipeGuide extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_guide);

        textView = (TextView) findViewById(R.id.txtRecipe);
//        // Apply the Scroll method
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}