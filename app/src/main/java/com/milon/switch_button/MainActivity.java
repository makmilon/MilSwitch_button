package com.milon.switch_button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatRadioButton leftEnglish, rightAra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftEnglish=findViewById(R.id.leftEnglish);
        rightAra=findViewById(R.id.rightAra);
    }

    public void onRadioButtonClicked (View view){

        boolean isSelected= ((AppCompatRadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.leftEnglish:
                if (isSelected){
                    leftEnglish.setTextColor(Color.WHITE);
                    rightAra.setTextColor(Color.RED);
                }
                break;
            case R.id.rightAra:
                if (isSelected){
                    rightAra.setTextColor(Color.WHITE);
                    leftEnglish.setTextColor(Color.RED);
                }
                break;
        }
    }
}