package com.example.submission;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class MoveWithDataActivity extends AppCompatActivity {
    private ArrayList<Android> listAndroid;
    public static final String EXTRA_NAME = "extra_age";
    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_DETAIL = "extra_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        TextView name = findViewById(R.id.name_received);
        ImageView drb = findViewById(R.id.img_received);
        TextView detail = findViewById(R.id.detail_received);

        String Name = getIntent().getStringExtra(EXTRA_NAME);
        int img = getIntent().getIntExtra(EXTRA_IMAGE, 0);
        String Detail = getIntent().getStringExtra(EXTRA_DETAIL);

        name.setText(Name);
        drb.setImageResource(img);
        detail.setText(Detail);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {

        }
    }
}