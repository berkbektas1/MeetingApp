package com.example.meetingapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.meetingapp.R;
import com.google.android.material.button.MaterialButton;

public class SingUpActivity extends AppCompatActivity {

    private TextView textSingIn;
    private ImageView imageBack;
    private EditText inputFirstName, inputLastName, inputEmail, inputPassword, inputConfirmPassword;
    private MaterialButton buttonSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);


        textSingIn = findViewById(R.id.textSingIn);
        imageBack = findViewById(R.id.imageBack);

        inputFirstName = findViewById(R.id.inputFirstName);
        inputLastName = findViewById(R.id.inputLastName);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputConfirmPassword = findViewById(R.id.inputConfirmPassword);
        buttonSingUp = findViewById(R.id.buttonSingUp);

        textSingIn.setOnClickListener(v -> onBackPressed());
        imageBack.setOnClickListener(v -> onBackPressed());

        buttonSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputFirstName.getText().toString().trim().isEmpty()){
                    Toast.makeText(SingUpActivity.this, "Enter first name", Toast.LENGTH_SHORT).show();
                }else if (inputLastName.getText().toString().trim().isEmpty()){
                    Toast.makeText(SingUpActivity.this, "Enter last name", Toast.LENGTH_SHORT).show();
                }else if (inputEmail.getText().toString().trim().isEmpty()){
                    Toast.makeText(SingUpActivity.this,"Enter email", Toast.LENGTH_SHORT).show();
                }else if (!Patterns.EMAIL_ADDRESS.matcher(inputEmail.getText().toString()).matches()){
                    Toast.makeText(SingUpActivity.this, "Enter valid email", Toast.LENGTH_SHORT).show();
                }else if (inputPassword.getText().toString().trim().isEmpty()){
                    Toast.makeText(SingUpActivity.this, "Enter password", Toast.LENGTH_SHORT).show();
                }else if(inputConfirmPassword.getText().toString().trim().isEmpty()){
                    Toast.makeText(SingUpActivity.this, "Confirm your password", Toast.LENGTH_SHORT).show();
                }else if (!inputPassword.getText().toString().equals(inputConfirmPassword.getText().toString())){
                    Toast.makeText(SingUpActivity.this, "Password and Confirm Password must be same.", Toast.LENGTH_SHORT).show();
                }else {

                }
            }
        });

    }


    private void singUp(){


    }

}
