package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mbutton;
        Button cmbutton;
        Button kmbutton;


        mbutton = (Button) findViewById(R.id.button);
        cmbutton = (Button) findViewById(R.id.button1);
        kmbutton = (Button) findViewById(R.id.button2);


        mbutton.setOnClickListener((View.OnClickListener) this);
        cmbutton.setOnClickListener((View.OnClickListener) this);
        kmbutton.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        final EditText kmText;
        final EditText cmText;
        final EditText mText;
        final TextView sText;

        mText = (EditText) findViewById(R.id.mText);
        cmText = (EditText) findViewById(R.id.cmText);
        kmText = (EditText) findViewById(R.id.kmText);
        sText = (TextView) findViewById(R.id.textView);

        switch (v.getId()) {
            case R.id.button:
                if (kmText.getText().toString().length() == 0) {
                    Double convert = Double.parseDouble(cmText.getText().toString());
                    sText.setText(String.valueOf(convert / 100));
                    sText.setTextColor(Color.RED);
                } else if (cmText.getText().toString().length() == 0) {
                    Double convert = Double.parseDouble(kmText.getText().toString());
                    sText.setText(String.valueOf(convert * 1000));
                    sText.setTextColor(Color.RED);
                }
                break;
            case R.id.button1:
                if (kmText.getText().toString().length() == 0) {
                    Double convert = Double.parseDouble(mText.getText().toString());
                    sText.setText(String.valueOf(convert * 100));
                    sText.setTextColor(Color.RED);
                } else if (mText.getText().toString().length() == 0) {
                    Double convert = Double.parseDouble(kmText.getText().toString());
                    sText.setText(String.valueOf(convert * 1000000));
                    sText.setTextColor(Color.RED);
                }
                break;

            case R.id.button2:
                if (cmText.getText().toString().length() == 0) {
                    Double convert = Double.parseDouble(mText.getText().toString());
                    sText.setText(String.valueOf(convert / 1000));
                    sText.setTextColor(Color.RED);
                } else if (mText.getText().toString().length() == 0) {
                    Double convert = Double.parseDouble(cmText.getText().toString());
                    sText.setText(String.valueOf(convert / 1000000));
                    sText.setTextColor(Color.RED);
                }
                break;
        }
    }
}


        /*mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kmText==null) {
                    Double convert = Double.parseDouble(cmText.getText().toString());
                    sText.setText(String.valueOf(convert / 100));
                    sText.setTextColor(Color.RED);
                }
                else if(cmText==null) {
                    Double convert = Double.parseDouble(kmText.getText().toString());
                    sText.setText(String.valueOf(convert * 1000));
                    sText.setTextColor(Color.RED);
                }
            }
        });

        cmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kmText==null) {
                    Double convert = Double.parseDouble(mText.getText().toString());
                    sText.setText(String.valueOf(convert * 100));
                    sText.setTextColor(Color.RED);
                }
                else if(mText==null) {
                    Double convert = Double.parseDouble(kmText.getText().toString());
                    sText.setText(String.valueOf(convert * 1000000));
                    sText.setTextColor(Color.RED);
                }
            }
        });

        kmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cmText==null) {
                    Double convert = Double.parseDouble(mText.getText().toString());
                    sText.setText(String.valueOf(convert / 1000));
                    sText.setTextColor(Color.RED);
                }
                else if(mText==null) {
                    Double convert = Double.parseDouble(cmText.getText().toString());
                    sText.setText(String.valueOf(convert / 1000000));
                    sText.setTextColor(Color.RED);
                }
            }
        });*/



