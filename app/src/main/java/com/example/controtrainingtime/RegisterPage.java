package com.example.controtrainingtime;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterPage extends AppCompatActivity {
    EditText Username, Password;
    TextView EditText;
    Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        Username = (EditText)findViewById(R.id.Username);
        Password = (EditText)findViewById(R.id.Password);
        EditText = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.ButtLogin);



//        Login.setOnClickListener(new View.OnClickListener(){
//            @Override
////            public void onClick(View view){
//////                validate(Username.getText().toString(), Password.getText().toString());
//////                String username = Username.getText().toString();
//////                String userpassword =  Password.getText().toString();
////                  String username = Username.getText().toString();
////                  String password =  Password.getText().toString();
////                   String type = "login";
////                BackgroundWorker backgroundWorker = new BackgroundWorker(this);
////                backgroundWorker.execute(type, username, password);
////                Intent intent = new Intent(RegisterPage.this, Login.class);
////                startActivity(intent);
////
//////            }
//////        });
    }

//    private void validate(String UserName, String UserPassword){
//        if((UserName.equals("Admin")) && (UserPassword.equals( "1234"))){
//            Intent intent = new Intent(RegisterPage.this, Login.class);
//            startActivity(intent);
//            Info.setText("");
//
//        }else{
//            Info.setText("不正なログインです、再度ログインしてください。 ");
//        }

    //}
public void onLogin(View view){
    String user_name = Username.getText().toString();
    String password =  Password.getText().toString();
    String type = "login";
    BackgroundWorker backgroundWorker = new BackgroundWorker(this);
    backgroundWorker.execute(type, user_name, password);

}
}
