package edu.gcit.todo_12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "edu.gcit.todo4";
    String popupMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void donut(View view) {
        popupMsg = getString(R.string.donut_Text);
        displayPopupMsg(popupMsg);
    }

    public void icecream(View view) {
        popupMsg = getString(R.string.ice_Text);
        displayPopupMsg(popupMsg);
    }

    public void froyo(View view) {
        popupMsg = getString(R.string.froyo_Text);
        displayPopupMsg(popupMsg);
    }
    private void displayPopupMsg(String popUpMsg) {
        Toast.makeText(getApplicationContext(), popUpMsg, Toast.LENGTH_LONG).show();
    }

    public void shop(View view) {
        Intent intent = new Intent(MainActivity.this, shopActivity.class);
        intent.putExtra(EXTRA_MESSAGE, popupMsg);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_shop:
                Intent intent = new Intent(MainActivity.this,shopActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_contact:
                displayPopupMsg("Contact");
                return true;
            case R.id.action_order:
                displayPopupMsg("Order");
                return true;
            case R.id.action_settings:
                displayPopupMsg("settings");
                return true;
            case R.id.action_search:
                displayPopupMsg("search");
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}