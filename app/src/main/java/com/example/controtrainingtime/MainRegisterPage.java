package com.example.controtrainingtime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainRegisterPage extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.ControTrainingTime.application.ControTrainingTime.EXTRA_TEXT";
    public static final String EXTRA_ID = "com.ControTrainingTime.application.ControTrainingTime.EXTRA_ID";
    public static final String EXTRA_PASSWORD = "com.ControTrainingTime.application.ControTrainingTime.EXTRA_PASSWORD";


    private EditText Name;
    private EditText id;
    private TextView Password;
    private Button Regis1;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register_page);

        Name = (EditText)findViewById(R.id.Name);
        id = (EditText)findViewById(R.id.UserId);
        Password = (EditText)findViewById(R.id.UserPassword);
        Info = (TextView)findViewById(R.id.Info);
        Regis1 = (Button) findViewById(R.id.ButtRegister);


        Regis1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openRegisterComfirm(Name.getText().toString(),id.getText().toString(),Password.getText().toString());
            }
        });


    }

    public void openRegisterComfirm(String UserName, String UserId, String UserPassword) {

        if(!"".equals(UserName) && !"".equals(UserPassword) && !"".equals(UserId)) {

            Intent intent = new Intent(MainRegisterPage.this, RegisterComfirm.class);
            intent.putExtra(EXTRA_TEXT, UserName);
            intent.putExtra(EXTRA_ID, UserId);
            intent.putExtra(EXTRA_PASSWORD, UserPassword);
            startActivity(intent);
            Info.setText("");

        }else{

            Info.setText("全部記入してください。");


             }

        }

    }

