package com.example.liushi;

import android.content.Intent;
import android.graphics.Color;
import android.os.BaseBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.bt1);
        final LiuShiLayout liuShiLayout = findViewById(R.id.view);
        final EditText editText = findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String trim = editText.getText().toString().trim();
//                获取下面
                TextView textView = new TextView(MainActivity.this);
                //吧输入框的值赋值给下面
                textView.setText(trim);
                ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.WRAP_CONTENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT);
                liuShiLayout.addView(textView, params);

            }
        });

    }
}

