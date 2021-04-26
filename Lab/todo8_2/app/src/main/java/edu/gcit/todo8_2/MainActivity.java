package edu.gcit.todo8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.text);

        Intent intent = getIntent();
        Uri message = intent.getData();

        if (message != null){
            String msg = message.toString();
            txt.setText(msg);
        }
    }
}