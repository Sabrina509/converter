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
        Button mybutton1;
        Button mybutton2;
        final EditText fText;
        final EditText fText1;
        final EditText fText2;
        final TextView sText;

        mybutton= (Button) findViewById(R.id.button);
        mybutton1= (Button) findViewById(R.id.button1);
        mybutton2= (Button) findViewById(R.id.button2);
        fText=(EditText) findViewById(R.id.editText);
        fText1=(EditText) findViewById(R.id.editText1);
        fText2=(EditText) findViewById(R.id.editText2);
        sText=(TextView) findViewById(R.id.textView);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fText==null && fText1==null) {
                    Double convert = Double.parseDouble(fText2.getText().toString());
                    sText.setText(String.valueOf(convert * 100));
                    sText.setTextColor(Color.RED);
                }
            }
        });
    }
}