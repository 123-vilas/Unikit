package com.example.unikit;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Translator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translator);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, TranslateFragments.newInstance())
                    .commitNow();
        }
    }
}