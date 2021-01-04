package com.next.mobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         Intent startingIntent =  getIntent(); //get the intent which started this home acgtivity
         Bundle extras = startingIntent.getExtras();
         String car = extras.getString("mkey");

        TextView homeTextView = findViewById(R.id.textViewhome);
        homeTextView.setText(car);
    }

    public void handleClick(View view) {
        Intent stationeryIntent = new Intent();
        stationeryIntent.putExtra("stationery","fevicol glue");
        setResult(RESULT_OK,stationeryIntent);
        finish();
    }
}