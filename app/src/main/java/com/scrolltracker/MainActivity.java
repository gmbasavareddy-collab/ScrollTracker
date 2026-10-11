package com.scrolltracker;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.rgb(18, 18, 28));

        TextView title = new TextView(this);
        title.setText("ScrollTracker");
        title.setTextSize(30);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your daily scrolling tracker");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        TextView status = new TextView(this);
        status.setText("\nInstagram Reels: 0\n\nYouTube Shorts: 0\n\nAutomatic tracking setup comes next.");
        status.setTextSize(20);
        status.setTextColor(Color.WHITE);
        status.setGravity(Gravity.CENTER);
        layout.addView(status);

        setContentView(layout);
    }
}
