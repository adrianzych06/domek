package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textView2;
    private Button polub;
    private Button usun;
    private int lajki = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        polub = findViewById(R.id.button2);
        usun = findViewById(R.id.button3);

        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lajki++;
                textView2.setText(lajki +" polubien");
            }
        });
        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lajki>0) {
                    lajki--;
                    textView2.setText(lajki + " polubien");
                }
            }
        });
    }


}