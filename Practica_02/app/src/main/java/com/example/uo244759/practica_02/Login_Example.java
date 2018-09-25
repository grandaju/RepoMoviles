package com.example.uo244759.practica_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Example extends AppCompatActivity {
    private EditText mPassword;
    private EditText mPasswordConfirm;
    private Button btn_aceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout_example);
        mPassword = (EditText) findViewById(R.id.password_text);
        mPasswordConfirm = (EditText) findViewById(R.id.confirm_password_text);
    }

    public void checkPassword(View view){
        String myPassword = mPassword.getText().toString();
        String myPasswordConfirm = mPasswordConfirm.getText().toString();

        if(myPassword != null && myPasswordConfirm != null ){
            if(myPassword.equals(myPasswordConfirm))
                Toast.makeText(getApplicationContext(),getString(R.string.success_password),Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(),getString(R.string.error_password),Toast.LENGTH_SHORT).show();

        }
        else
            Toast.makeText(getApplicationContext(),getString(R.string.non_password),Toast.LENGTH_SHORT).show();
    }
}
