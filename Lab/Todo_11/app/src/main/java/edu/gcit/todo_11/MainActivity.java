package edu.gcit.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloText;

    private String[] mColorArray = {"red", "black", "white", "brown", "pink", "blue", "yellow","grey",
            "orange", "purple_500", "purple_200", "purple_700", "teal_200","teal_700","green"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelloText = findViewById(R.id.HelloText);

    }

    public void color(View view) {
    Random random = new Random();
    String colorName = mColorArray[random.nextInt(15)];

    int colorResourceName = getResources().getIdentifier(colorName,"color", getApplicationContext().getPackageName());

    int colorRes = ContextCompat.getColor(this, colorResourceName);
    mHelloText.setTextColor(colorRes);
    }
}