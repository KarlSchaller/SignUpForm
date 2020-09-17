package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email = findViewById(R.id.emailEditText);
                EditText password = findViewById(R.id.passwordEditText);
                EditText confirm = findViewById(R.id.confirmEditText);
                if (email.getText().toString().matches("") ||
                        password.getText().toString().matches("") ||
                        confirm.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Enter all information",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}