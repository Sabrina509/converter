package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton;
        final EditText fText;
        final TextView sText;

        mybutton= (Button) findViewById(R.id.button);
        fText=(EditText) findViewById(R.id.editText);
        sText=(TextView) findViewById(R.id.textView);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(fText.getText().toString());
                sText.setText(String.valueOf(convert*100));
                sText.setTextColor(Color.RED);
            }
        });
    }
}