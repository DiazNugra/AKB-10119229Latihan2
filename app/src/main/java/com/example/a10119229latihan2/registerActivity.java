package com.example.a10119229latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class registerActivity extends AppCompatActivity {

    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //dropdown blood type
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner_bloodType);

        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter.createFromResource(this, R.array.itemselectBloodType,android.R.layout.simple_spinner_item);

        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(staticAdapter);

        //dropdown reshus
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner_reshus);

        ArrayAdapter<CharSequence> staticAdapter1 = ArrayAdapter.createFromResource(this, R.array.rehsus,android.R.layout.simple_spinner_item);

        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(staticAdapter1);

        //dropdown job
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner_job);

        ArrayAdapter<CharSequence> staticAdapter2 = ArrayAdapter.createFromResource(this, R.array.job,android.R.layout.simple_spinner_item);

        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(staticAdapter2);

        //pindah ke activity verify
        register=findViewById(R.id.buttonRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registerActivity.this, verifyActivity.class);
                startActivity(intent);
            }
        });

    }
}