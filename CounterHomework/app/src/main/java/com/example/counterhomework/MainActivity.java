package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    TextView mShowcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowcount = (TextView) findViewById(R.id.text_count);

        if (savedInstanceState != null) {
            String count = savedInstanceState.getString("count_text");
            mCount = Integer.parseInt(count);
            mShowcount.setText(count);
        }
    }

    public void incrementCounter(View view) {
        mCount++;
        if (mShowcount != null) {
            mShowcount.setText(Integer.toString(mCount));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count_text", mShowcount.getText().toString());
    }
}