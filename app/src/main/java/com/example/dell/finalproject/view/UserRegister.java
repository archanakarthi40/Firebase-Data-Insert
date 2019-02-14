package com.example.dell.finalproject.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dell.finalproject.R;
import com.example.dell.finalproject.model.AdminModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserRegister extends AppCompatActivity {

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mMessageDatabaseReference;
    Button submit;
    EditText name;
    EditText id;
    EditText phonenumber;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_register_activity);
        mFirebaseDatabase= FirebaseDatabase.getInstance();
        mMessageDatabaseReference=  mFirebaseDatabase.getReference("Users");
       // mMessageDatabaseReference.child("Users").setValue("Hello, World!");
        submit = (Button) findViewById(R.id.button1);
        name = (EditText) findViewById(R.id.editText1);
        id = (EditText) findViewById(R.id.editText2);
        phonenumber = (EditText) findViewById(R.id.editText3);
        password = (EditText) findViewById(R.id.editText4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminModel registerData = new AdminModel(name.getText().toString(),id.getText().toString(),phonenumber.getText().toString(),password.getText().toString());

                mMessageDatabaseReference.push().setValue(registerData);

                // Clear input box
                name.setText("");
                id.setText("");
                password.setText("");
                phonenumber.setText("");
                Intent intent=new Intent(UserRegister.this,VotingType.class);
                startActivity(intent);

            }
        });
    }

}
