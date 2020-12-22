package com.next.mobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickHandler(View view) {
        switch (view.getId()){
            case R.id.button_login:
                Toast.makeText(this, "weldome to android", Toast.LENGTH_LONG).show();
                Intent hIntent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(hIntent);
               break;
            case R.id.button_cancel:
                Toast.makeText(this, "rescheduling class", Toast.LENGTH_SHORT).show();

                break;
        }

    }
}