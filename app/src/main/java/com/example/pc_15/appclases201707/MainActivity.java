package com.example.pc_15.appclases201707;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickEscribir(View view){
        FirebaseDatabase database= FirebaseDatabase.getInstance();
        DatabaseReference myRef=database.getReference("estudiantes");

        myRef.setValue("Hello","World");
    }

}
