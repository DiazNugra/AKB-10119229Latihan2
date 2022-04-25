package com.example.a10119229latihan2;
//Nim                   : 10119229
//Nama                  : Diaz Maulidzan N
//Kelas                 : IF6
//Tanggal Pengerjaan    : 25 april 2022
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View registrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrasi=findViewById(R.id.register);
        registrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, registerActivity.class);
                startActivity(intent);
            }
        });


    }
}