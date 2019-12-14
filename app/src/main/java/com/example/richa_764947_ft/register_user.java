package com.example.richa_764947_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.Random;

public class register_user extends AppCompatActivity {

    EditText name,email,phone;
    Button saveData;
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        saveData = findViewById(R.id.register);



        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // if(name.getText().toString() != "" || email.getText().toString() != ""|| phone.getText().toString() != ""){
                  //  Toast.makeText(register_user.this,"all field must be filled",Toast.LENGTH_SHORT).show();
//                }
//                else {
                    Random ran = new Random();
                    int nxt = ran.nextInt(20);

                    userData = new UserData(name.getText().toString(), email.getText().toString(), phone.getText().toString(),UserData.imageIcons[nxt]);
                    Intent intent = new Intent(register_user.this,verification.class);
                    intent.putExtra("userData", userData);
                    startActivity(intent);
                    finish();





               // }
            }
        });
    }
}
