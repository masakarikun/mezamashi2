package com.example.masayuki.mezamashi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            ((Button) findViewById(R.id.button1))
                    .setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            //
                            Intent varIntent = new Intent(MainActivity.this, Activity1.class);
                            //
                            startActivity(varIntent);
                        }
                    });

            ((Button) findViewById(R.id.button2))
                    .setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Intent varIntent = new Intent(MainActivity.this, Activity2.class);
                            startActivity(varIntent);
                        }
                    });

            ((Button) findViewById(R.id.button3))
                    .setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Intent varIntent = new Intent(MainActivity.this, Activity3.class);
                            startActivity(varIntent);
                        }
                    });


            ((Button) findViewById(R.id.mybutton2))
            .setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Alert Dialog OK")

                                        // メッセージを設定
                                .setMessage("OKボタンをクリックしてください。")

                                        // アイコンを設定
                                .setIcon( R.mipmap.ic_launcher)

                                        // Positiveボタン、リスナを設定
                                .setPositiveButton(
                                        "OK",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                // OKボタンが押されたときの処理
                                                ((TextView) findViewById(R.id.textView2))
                                                        .setText("OKボタンがクリックされました。");
                                            }
                                        })
                                .show();
                    }
                });
    }




 public void getOmikuji(View view){
     TextView tv = (TextView) findViewById(R.id.myText);
     Random randomGenerator = new Random();
     String[] results ={
            "晴れ!!!",
                "曇り.",
                    "雨......."
     };
     int num = randomGenerator.nextInt(results.length);
     if (num==0){
         tv.setTextColor(Color.RED);
     } else tv.setTextColor(Color.BLACK);
     String result = Integer.toString(num);
     tv.setText(results[num]);
 }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
