package com.example.controtrainingtime;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterSuccess extends AppCompatActivity {
    private Button logout;
    private Button userbutton;
    private TextView text;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_success);

        userbutton = (Button) findViewById(R.id.UserButton);
        logout = (Button) findViewById(R.id.LogOut);
        text = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        final String UserName = intent.getStringExtra(RegisterComfirm.USERNAME);// 前のページから登録した名前をこのページに呼び出す
        userbutton.setText(UserName); // ボタンに名前を表示する

    }
}
