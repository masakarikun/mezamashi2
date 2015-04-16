package com.example.masayuki.mezamashi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        ((Button) findViewById(R.id.back))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
    }
}