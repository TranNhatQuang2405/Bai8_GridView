package com.example.bai8_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Image> listImage;
    ImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ánh Xạ
        gridView = (GridView) findViewById(R.id.gridViewHinh);
        listImage = new ArrayList<>();
        listImage.add(new Image(R.drawable.logo1,"logo 1"));
        listImage.add(new Image(R.drawable.logo2,"logo 2"));
        listImage.add(new Image(R.drawable.logo3,"logo 3"));
        listImage.add(new Image(R.drawable.logo4,"logo 4"));
        listImage.add(new Image(R.drawable.logo5,"logo 5"));
        listImage.add(new Image(R.drawable.logo6,"logo 6"));
        listImage.add(new Image(R.drawable.logo7,"logo 7"));
        listImage.add(new Image(R.drawable.logo8,"logo 8"));

        adapter = new ImageAdapter(listImage, this, R.layout.line_grid);

        gridView.setAdapter(adapter);
        gridView.setNumColumns(3);
        gridView.setVerticalSpacing(10);
        gridView.setHorizontalSpacing(10);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, listImage.get(i).getName(), Toast.LENGTH_LONG).show();

            }
        });




    }
}