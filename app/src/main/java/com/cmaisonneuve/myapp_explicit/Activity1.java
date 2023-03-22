package com.cmaisonneuve.myapp_explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
    }

        private static final int REQUEST_CODE = 10;

        public void myFunction1(View view) {
            Intent i = new Intent(Activity1.this, Activity2.class);
            i.putExtra("key1", " Jack");
            i.putExtra("key2", " Lucas");
            startActivity(i);
        }
    }
