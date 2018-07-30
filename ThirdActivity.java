package com.example.taymaz.hokm3;
/*
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.taymaz.hokm3.R;
import com.example.taymaz.hokm3.SecondActivity;

public class ThirdActivity extends AppCompatActivity {

    CardView mPlayerEditNameCardView;
    EditText editText;
    Intent intent3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mPlayerEditNameCardView = (CardView) findViewById(R.id.mPlayerEditNameCardView);
        editText = (EditText) findViewById(R.id.editText1);
        editText.setOnEditorActionListener((TextView v, int actionId, KeyEvent event) -> {
            boolean handled = false;
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                intent3 = new Intent(getApplicationContext(),SecondActivity.class);
                intent3.putExtra("", editText.getText().toString());
                startActivity(intent3);
                handled = true;
            }
            return handled;
        });
    }
}
*/