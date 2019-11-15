package com.example.scaling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnGallery;
    private Button mBtnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBtnGallery = findViewById(R.id.btn_gallery);
        mBtnCamera = findViewById(R.id.btn_camera);

        String gallery = "gallery";
        String camera = "camera";

        mBtnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScalingImg.class);
                intent.putExtra("photo", 1);
                startActivity(intent);
            }
        });
        mBtnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScalingImg.class);
                intent.putExtra("photo", 2);
                startActivity(intent);
            }
        });
    }

}
