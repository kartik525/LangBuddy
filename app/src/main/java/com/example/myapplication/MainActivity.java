package com.example.myapplication;


import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.ml.naturallanguage.translate.FirebaseTranslateLanguage;


public class MainActivity extends AppCompatActivity {




    public Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);






        button=(findViewById(R.id.ok));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                startActivity(intent);
            }
        });


    }
}