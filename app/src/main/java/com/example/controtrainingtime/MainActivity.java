package com.example.controtrainingtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button Butt1;
    public Button Butt2;
    public Button Butt3;


    public void init(){
        Butt1 = (Button)findViewById(R.id.Butt1);
        Butt2 = (Button)findViewById(R.id.but2);
        Butt3 = (Button)findViewById(R.id.Butt3);

       Butt1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainRegisterPage.class);
                startActivity(intent);



            }
        });


        Butt2.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                Intent toy = new Intent(MainActivity.this,RegisterPage.class);
                startActivity(toy);



            }
        });

        Butt3.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this,ExplainPage.class);
                startActivity(toy);



            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
