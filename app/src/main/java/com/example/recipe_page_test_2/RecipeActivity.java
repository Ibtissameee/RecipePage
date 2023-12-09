package com.example.recipe_page_test_2;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recipe_page_test_2.R;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        // Dummy data (replace with actual data)
        String recipeName = "Spaghetti Bolognese";
        String author = "John Doe";
        String[] ingredients = {"200g spaghetti", "300g ground beef", "1 onion", "1 can of tomatoes","blablbalabakz","bakddkdjfh","hdjdjdfjfkf","hehfjhfjfk","hdhgdhj","hdjdhfgff","dhdgdjdej","hdjddhj"};
        String[] steps = {"Boil the spaghetti", "Cook ground beef and onion", "Add tomatoes and simmer", "Blablablabla","blablablabla","blablablanla","blablablabal"};

        // Set data to UI elements
        TextView recipeNameTextView = findViewById(R.id.recipeName);
        TextView authorTextView = findViewById(R.id.author);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        TextView ratingText = findViewById(R.id.ratingText);
        LinearLayout ingredientsLayout = findViewById(R.id.ingredientsLayout);
        LinearLayout stepsLayout = findViewById(R.id.stepsLayout);

        recipeNameTextView.setText(recipeName);
        authorTextView.setText("By: " + author);

        // Populate Ingredients
        for (String ingredient : ingredients) {
            TextView ingredientTextView = new TextView(this);
            ingredientTextView.setText("- " + ingredient);
            ingredientsLayout.addView(ingredientTextView);
        }

        // Populate Steps
        for (int i = 0; i < steps.length; i++) {
            TextView stepTextView = new TextView(this);
            stepTextView.setText((i + 1) + ". " + steps[i]);
            stepsLayout.addView(stepTextView);
        }
        // Get the average rating and number of ratings from your data
        float averageRating = 3.5f;  // Replace with your actual data
        int numberOfRatings = 100;   // Replace with your actual data

        // Set the RatingBar values
        ratingBar.setRating(averageRating);

        // Set the text for the number of ratings
        String ratingLabelText = getString(R.string.rating_label, numberOfRatings);
        ratingText.setText(ratingLabelText);
    }
}