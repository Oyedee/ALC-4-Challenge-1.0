package com.example.abdulhamid.alcapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfilePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView photo = (ImageView) findViewById(R.id.imageView_photo);
        photo.setImageResource(R.drawable.photo);

        TextView textName = (TextView) findViewById(R.id.text_name);
        TextView textTrack = (TextView) findViewById(R.id.text_track);
        TextView textCountry = (TextView) findViewById(R.id.text_country);
        TextView textEmail = (TextView) findViewById(R.id.text_email);
        TextView textPhone = (TextView) findViewById(R.id.text_phone);
        TextView textSlack = (TextView) findViewById(R.id.text_slack);
    }

}
