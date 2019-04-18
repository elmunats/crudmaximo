package com.elmunats.crudmaximo.utils;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Reja on 07,February,2019
 * Jakarta, Indonesia.
 */
public class ThreadUtils extends AppCompatActivity {

    public void updateTextView(final TextView textView, final String value){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textView.setText(value);
            }
        });
    }

}
