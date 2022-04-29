package com.example.f1news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener  {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                openHomeActivity();
                break;

            case R.id.button2:
                openMediaActivity();
                break;

            case R.id.button3:
                openPressActivity();
                break;
        }
    }

    private void openPressActivity() {
        Intent intent = new Intent(this, PressActivity.class);
            startActivity(intent);
    }

    private void openMediaActivity() {
        Intent intent = new Intent(this, MediaActivity.class);
            startActivity(intent);
    }

    private void openHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
    }
}