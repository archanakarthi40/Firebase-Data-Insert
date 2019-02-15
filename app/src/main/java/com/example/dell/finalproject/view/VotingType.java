package com.example.dell.finalproject.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dell.finalproject.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class VotingType extends AppCompatActivity {
    CircleImageView fingerprint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_voting_type_activity);
        fingerprint=(CircleImageView)findViewById(R.id.fingerprint);

        fingerprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VotingType.this,UserFingerPrintAuth.class);
                startActivity(intent);
            }
        });
    }
}
