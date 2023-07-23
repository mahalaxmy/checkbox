package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

CheckBox c1,c2,c3;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="";

                // Concatenation of the checked options in if

                // isChecked() is used to check whether
                // the CheckBox is in true state or not.

                if (c1.isChecked())

                    msg = msg + "khokho";
                if (c2.isChecked())
                    msg = msg + "football";
                if (c3.isChecked())
                    msg = msg + "cricket";
                Toast.makeText(MainActivity.this, msg,
                        Toast.LENGTH_LONG).show();

            }
        });
    }
    }





        // Toast is created to display the
        // message using show() method.



