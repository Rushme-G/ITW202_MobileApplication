package edu.gcit.todo7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = -1, y;
    private TextView mViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewCount = (TextView) findViewById(R.id.ShowCount);
        if(savedInstanceState != null){
            x = savedInstanceState.getInt("count");
            mViewCount.setText(toString().valueOf(x));
        }
    }

    public void CountStart(View view) {
        x++;
        mViewCount.setText(String.valueOf(x));
        y = x;
    }

    protected void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);
        bundle.putInt("count",y);
    }
}