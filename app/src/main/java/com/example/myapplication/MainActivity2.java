package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {
    private TextInputEditText textTrans;
    private ImageView mic;
    private Button tranB;
    private TextView trans;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textTrans = findViewById(R.id.textTrans);
        mic = findViewById(R.id.mic);
        tranB = findViewById(R.id.tranB);
        trans = findViewById(R.id.trans);

    }
}