package com.depauw.attributetypes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;


import com.depauw.attributetypes.databinding.ActivityAttributeTypesBinding;

public class AttributeTypes extends AppCompatActivity{

    public static final int CHECKBOX_DP = 250;

    private ActivityAttributeTypesBinding binding;

    public void task1() {
        ColorStateList colorValue = ColorStateList.valueOf(getResources().getColor(R.color.MetroRed));
        binding.ratingbarView4.setProgressTintList(colorValue);
    }

    public void task2(){
        String viewText = binding.edittextView2.getText().toString();
        String[] viewWords = viewText.split(" ");
        binding.toggleView7.setTextOn(viewWords[1]);
        binding.toggleView7.setTextOff(viewWords[0]);
    }

    public void task3(){
        binding.linearlayoutView6.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
    }

    public void task4(){
        binding.textviewView1.setAllCaps(true);
    }

    public void task5(){
        binding.seekbarView3.setThumb(getResources().getDrawable(R.drawable.tiger));
    }

    public void task6(){
        binding.edittextView2.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
    }

    public void task7(){
        int numPixels = (int) (CHECKBOX_DP * getResources().getDisplayMetrics().density);
        binding.checkboxView8.setHeight(numPixels);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAttributeTypesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
}