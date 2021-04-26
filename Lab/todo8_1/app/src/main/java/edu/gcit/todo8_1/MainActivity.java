package edu.gcit.todo8_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText webText, locText, shareText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webText = findViewById(R.id.webTxt);
        locText = findViewById(R.id.locTxt);
        shareText = findViewById(R.id.shareTxt);


    }

    public void web(View view) {
        String txt = webText.getText().toString();
        Uri uri = Uri.parse(txt);
        Intent obj = new Intent(Intent.ACTION_VIEW,uri);

        if (obj.resolveActivity(getPackageManager()) != null){
            startActivity(obj);
        }
        else{
            Log.d("Implicit intent","Error in opening intent");
        }

    }

    public void location(View view) {
        String text = locText.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q="+text);
        Intent obj1 = new Intent(Intent.ACTION_VIEW,uri);

        if (obj1.resolveActivity(getPackageManager()) != null){
            startActivity(obj1);
        }
        else{
            Log.d("Implicit intent","Error in opening intent");
        }

    }

    public void share(View view) {
        String msg = shareText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with : ")
                .setText(msg)
                .startChooser();
    }
}