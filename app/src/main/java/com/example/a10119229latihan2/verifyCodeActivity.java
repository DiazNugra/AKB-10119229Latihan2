package com.example.a10119229latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verifyCodeActivity extends AppCompatActivity {

    private Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        kirim=findViewById(R.id.buttonSend);
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(verifyCodeActivity.this, profileActivity.class);
                startActivity(intent);
            }
        });
    }
}