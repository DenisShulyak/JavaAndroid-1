package com.example.helloworld2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.helloworld2.R.color.design_default_color_error;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        LinearLayout l = findViewById(R.id.layout);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.second);
        Button three = findViewById(R.id.third);

        one.setOnClickListener(this);
        three.setOnClickListener(this);
        two.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            LinearLayout l = findViewById(R.id.layout);
        if(v.getId() == R.id.one){
            l.setBackground(v.getBackground());
        }
        else if(v.getId() == R.id.second){
            l.setBackground(v.getBackground());
        }
        else if(v.getId() == R.id.third){
            l.setBackground(v.getBackground());
        }

    }
}
