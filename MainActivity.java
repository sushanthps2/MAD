package com.dirtybyte.lab;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView text = findViewById(R.id.on_touch);

        text.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Toast.makeText(getApplicationContext(),"On Touch Activated",Toast.LENGTH_LONG).show();
                return false;
            }
        });

        Button onclick = findViewById(R.id.button_on_click);

        onclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"On Click Activated",Toast.LENGTH_LONG).show();
            }
        });

        Button long_press = findViewById(R.id.button_long_click);

        long_press.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),"On Long Click Activated",Toast.LENGTH_LONG).show();

                return false;
            }
        });


        EditText onkey  = findViewById(R.id.on_click);

        onkey.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ((keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Toast.makeText(getApplicationContext(), "Enter Key is pressed", Toast.LENGTH_LONG).show();
                }
                return false;
            }
        });





    }
}
