package com.example.taymaz.hokm3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Collections;

public class FirstActivity extends AppCompatActivity{

    Button button1;
    Button button2;
    Button button3;
    /*
    ** Since Class Deck is not static, a new instance of the Class was created. This way we can use the
    ** 52 objects (Cards) here as well, without cluttering the page with corresponding codes.
    */
    RelativeLayout layout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

// RelativeLayout is limited to onCreate() and it is there to facilitate the starting screen.
        layout = (RelativeLayout) findViewById(R.id.start_layout);
// In the starting screen there will be 3 buttons.
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
// The 1st button is Resume. "Resume" will start the game where it was interrupted.
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //openSecondActOnResume();
            }

        });
// The second button is New. "New" will lunch the SecondActivity.
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
// The third button is Menu. "Menu" will offer options.
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // openThirdActivity();
            }
        });
    }

    public void openSecondActivity(){
        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);
    }
/*
    public void openThirdActivity(){
        Intent intent2 = new Intent(this, ThirdActivity.class);
        startActivity(intent2);
    }
*/

}





