package edu.gcit.todo_18;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<Sport> mSportData;
    private SportsAdaptor mAdapter;
    private ImageView mSportImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mSportData = new ArrayList<>();
        //get the resources from the xml file
        mAdapter = new SportsAdaptor(mSportData,this);
        mRecyclerView.setAdapter(mAdapter);

        initializeData();
    }

    private void initializeData(){
        TypedArray sportImageResources = getResources().obtainTypedArray(R.array.sport_images);
        String[] sportsList = getResources().getStringArray(R.array.sports_title);
        String[] sportsInfo = getResources().getStringArray(R.array.sports_info);

        //clear the existing data (to avoid duplication)
        mSportData.clear();

        for (int i=0; i<sportsList.length; i++){
            mSportData.add(new Sport(sportsList[i],sportsInfo[i],sportImageResources.getResourceId(i,0)));
        }

        //notify the adaptor of the change
        mAdapter.notifyDataSetChanged();
    }
}