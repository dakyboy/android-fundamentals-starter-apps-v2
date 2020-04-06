package com.example.android.materialme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        TextView titleTextView = findViewById(R.id.textViewTitleDetail);
        ImageView imageView = findViewById(R.id.imageViewSportsImageDetail);

        titleTextView.setText(intent.getStringExtra("title"));
        Glide.with(this)
                .load(intent.getIntExtra("image_resource", 0)).into(imageView);
    }
}
