package com.liumeng.materiallibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.liumeng.materiallibrary.view.button.FlatButton;

public class MainActivity extends AppCompatActivity {

    private FlatButton flatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flatButton = (FlatButton) findViewById(R.id.flat_button);
        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("你点我了 flat button");
            }
        });
        flatButton.setClickAfterRipple(false);
    }
}
