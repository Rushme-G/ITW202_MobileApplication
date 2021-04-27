package edu.gcit.todo_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText value1, value2;
    private TextView result;
    private Calculator mCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.val1txt);
        value2 = findViewById(R.id.val2txt);
        result = findViewById(R.id.reltxt);

        mCalculate = new Calculator();
    }

    public void adding(View view) {
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        double mResult = mCalculate.add(Double.valueOf(v1),Double.valueOf(v2));
        result.setText(String.valueOf(mResult));

        Log.d("Debugging","Hello Debugging");
    }

    public void substracting(View view) {
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        double mResult = mCalculate.sub(Double.valueOf(v1),Double.valueOf(v2));
        result.setText(String.valueOf(mResult));

        Log.d("Debugging","Hello Debugging");
    }

    public void multiplying(View view) {
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        double mResult = mCalculate.mul(Double.valueOf(v1),Double.valueOf(v2));
        result.setText(String.valueOf(mResult));

        Log.d("Debugging","Hello Debugging");
    }

    public void dividing(View view) {
        String v1 = value1.getText().toString();
        String v2 = value2.getText().toString();

        double mResult = mCalculate.div(Double.valueOf(v1),Double.valueOf(v2));
        result.setText(String.valueOf(mResult));

        Log.d("Debugging","Hello Debugging");
    }
}