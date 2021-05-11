package edu.gcit.todo_16;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 20; i++) {
            mWordList.addLast("Word" + i);
        }

        mRecyclerView = findViewById(R.id.recycleview);
        WordListAdaptor mAdaptor = new WordListAdaptor(this, mWordList);
        mRecyclerView.setAdapter(mAdaptor);
        LinearLayoutManager obj = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(obj);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wordlistsize = mWordList.size();
                mWordList.addLast("Word" + wordlistsize);
                mRecyclerView.getAdapter().notifyItemInserted(wordlistsize);
                mRecyclerView.smoothScrollToPosition(wordlistsize);
            }
        });
    }
}