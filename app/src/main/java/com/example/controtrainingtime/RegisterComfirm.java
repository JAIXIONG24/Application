package com.example.controtrainingtime;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterComfirm extends AppCompatActivity {
    public static final String USERNAME = "com.ControTrainingTime.application.ControTrainingTime.EXTRA_TEXT";
    TextView etName;
    TextView etId;
    TextView etPassword;
    Button Register1;
    TextView result;
    RequestQueue requestQueue;
    String insertUrl ="http://52.156.45.138/~db2019/i18102/inserUser.php";
    String showUrl ="http://52.156.45.138/~db2019/i18102/Show.php";

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_comfirm);


        Intent intent = getIntent();
        final String UserName = intent.getStringExtra(MainRegisterPage.EXTRA_TEXT);
        final String Id = intent.getStringExtra(MainRegisterPage.EXTRA_ID);
        final String Password = intent.getStringExtra(MainRegisterPage.EXTRA_PASSWORD);

        etName = findViewById(R.id.Text2);
        etId = findViewById(R.id.Text3);
        etPassword = findViewById(R.id.Text4);
        Register1 = findViewById(R.id.ButtComfirm);
        result = findViewById(R.id.textView);



        //　show the textView in the box
        etName.setText("名前： " + UserName);
        etId.setText("ID : " + Id);
        etPassword.setText("パスワード : " + Password);

        requestQueue = Volley.newRequestQueue(getApplicationContext());



        Register1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
/*
                Intent intent = new Intent(RegisterComfirm.this, RegisterSuccess.class);
                intent.putExtra(USERNAME, UserName);
                startActivity(intent);
*/
                StringRequest request = new StringRequest(Request.Method.POST, insertUrl, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> parameters  = new HashMap<String, String>();
                        parameters.put("username",UserName);
                        parameters.put("email",Id);
                        parameters.put("password",Password);

                        return parameters;
                    }
                };

                requestQueue.add(request);
            }

        });


    }

}

