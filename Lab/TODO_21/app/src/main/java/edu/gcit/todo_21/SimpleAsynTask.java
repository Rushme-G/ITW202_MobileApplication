package edu.gcit.todo_21;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SimpleAsynTask extends AsyncTask<Void,Void, String> {
    private WeakReference<TextView> mTextView;

    public SimpleAsynTask(TextView tv) {
        mTextView = new WeakReference<>(tv);
    }

    @Override
    protected String doInBackground(Void... voids) {
        Random r = new Random();
        int n = r.nextInt(11);
        int s = n * 200;

        try{
            Thread.sleep(s);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Awake at last after sleeping for" + s + "milliseconds!";//doinbackgroung takes the string datatype
    }
    @Override
    protected  void onPostExecute(String s){
        mTextView.get().setText(s);
    }
}
