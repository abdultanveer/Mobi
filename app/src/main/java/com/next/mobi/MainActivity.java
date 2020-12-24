package com.next.mobi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
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
               /* Toast.makeText(this, "weldome to android", Toast.LENGTH_LONG).show();
                Intent hIntent = new Intent(MainActivity.this,HomeActivity.class);
                hIntent.putExtra("mkey","bmwcar");
                startActivity(hIntent);*/
                createAlarm("disturb vijay",12,30);
               break;
            case R.id.button_cancel:
               /* Toast.makeText(this, "rescheduling class", Toast.LENGTH_SHORT).show();
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"));
                startActivity(dialIntent);
*/
                startTimer("my daily walk",60);
                break;
            case R.id.buttonMilk:
                startTimer("milk is overflowing",3);

                break;
            case R.id.buttonMotor:
                startTimer("water overflowing",5);
                break;
        }

    }


    public void createAlarm(String message, int hour, int minutes) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }



    public void startTimer(String message, int seconds) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_LENGTH, seconds)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}