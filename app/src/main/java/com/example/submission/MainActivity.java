package com.example.submission;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAndroid;
    private ArrayList<Android> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAndroid = findViewById(R.id.rv_android);
        rvAndroid.setHasFixedSize(true);

        list.addAll(AndroidData.getListData());
        showRecyclerList();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void showRecyclerList(){
        rvAndroid.setLayoutManager(new LinearLayoutManager(this));
        ListAndroidAdapter listAndroidAdapter = new ListAndroidAdapter(list);
        rvAndroid.setAdapter(listAndroidAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                break;
        }
    }
}