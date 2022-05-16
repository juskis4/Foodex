// Generated by view binder compiler. Do not edit!
package com.example.foodex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodex.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRecipeDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonAddFavorite;

  @NonNull
  public final ImageView imageViewFood;

  @NonNull
  public final RecyclerView recyclerIngredients;

  @NonNull
  public final RecyclerView recyclerInstructions;

  @NonNull
  public final TextView textViewMealName;

  @NonNull
  public final TextView textViewMealSource;

  @NonNull
  public final TextView textViewMealSummary;

  private FragmentRecipeDetailBinding(@NonNull LinearLayout rootView,
      @NonNull Button buttonAddFavorite, @NonNull ImageView imageViewFood,
      @NonNull RecyclerView recyclerIngredients, @NonNull RecyclerView recyclerInstructions,
      @NonNull TextView textViewMealName, @NonNull TextView textViewMealSource,
      @NonNull TextView textViewMealSummary) {
    this.rootView = rootView;
    this.buttonAddFavorite = buttonAddFavorite;
    this.imageViewFood = imageViewFood;
    this.recyclerIngredients = recyclerIngredients;
    this.recyclerInstructions = recyclerInstructions;
    this.textViewMealName = textViewMealName;
    this.textViewMealSource = textViewMealSource;
    this.textViewMealSummary = textViewMealSummary;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRecipeDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRecipeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_recipe_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRecipeDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_add_favorite;
      Button buttonAddFavorite = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddFavorite == null) {
        break missingId;
      }

      id = R.id.imageView_food;
      ImageView imageViewFood = ViewBindings.findChildViewById(rootView, id);
      if (imageViewFood == null) {
        break missingId;
      }

      id = R.id.recycler_ingredients;
      RecyclerView recyclerIngredients = ViewBindings.findChildViewById(rootView, id);
      if (recyclerIngredients == null) {
        break missingId;
      }

      id = R.id.recycler_instructions;
      RecyclerView recyclerInstructions = ViewBindings.findChildViewById(rootView, id);
      if (recyclerInstructions == null) {
        break missingId;
      }

      id = R.id.textView_meal_name;
      TextView textViewMealName = ViewBindings.findChildViewById(rootView, id);
      if (textViewMealName == null) {
        break missingId;
      }

      id = R.id.textView_meal_source;
      TextView textViewMealSource = ViewBindings.findChildViewById(rootView, id);
      if (textViewMealSource == null) {
        break missingId;
      }

      id = R.id.textView_meal_summary;
      TextView textViewMealSummary = ViewBindings.findChildViewById(rootView, id);
      if (textViewMealSummary == null) {
        break missingId;
      }

      return new FragmentRecipeDetailBinding((LinearLayout) rootView, buttonAddFavorite,
          imageViewFood, recyclerIngredients, recyclerInstructions, textViewMealName,
          textViewMealSource, textViewMealSummary);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
