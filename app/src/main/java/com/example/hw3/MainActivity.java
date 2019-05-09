package com.example.hw3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String text = "";
    private TextView txv;
    private TextView txvred;
    private TextView txvgreen;
    private TextView txvblue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    txv = findViewById(R.id.textView3);
    txvred = findViewById(R.id.textView4);
    txvgreen = findViewById(R.id.textView5);
    txvblue = findViewById(R.id.textView6);

    }

    public void ChangeColor(View view){

        Random x = new Random();

        int red = x.nextInt(256);
        txvred.setText("Red:"+red);
        txvred.setTextColor(Color.rgb(red,0,0));

        int green = x.nextInt(256);
        txvgreen.setText("Green:"+green);
        txvgreen.setTextColor(Color.rgb(0,green,0));

        int blue = x.nextInt(256);
        txvblue.setText("Blue:"+blue);
        txvblue.setTextColor(Color.rgb(0,0,blue));

        int upred = 255 - red ;
        int upgreen = 255 - green;
        int upblue = 255 - blue;

        text += red + " , " + green + " , " + blue + "\n";
        txv.setTextSize(32);
        txv.setText(text);
        txv.setTextColor(Color.rgb(upred,upgreen,upblue));
        txv.setMovementMethod(new ScrollingMovementMethod());
        txv.setBackgroundColor(Color.rgb(red,green,blue));
    }
}
