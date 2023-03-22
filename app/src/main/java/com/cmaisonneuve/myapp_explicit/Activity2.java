package com.cmaisonneuve.myapp_explicit;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {



    public class ActivityTwo extends Activity {

        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.activity2);
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                return;
            }

            String value1 = extras.getString("key1");
            String value2 = extras.getString("key2");

            if (value1 != null && value2 != null) {
                EditText text1 = (EditText) findViewById(R.id.input1);
                EditText text2 = (EditText) findViewById(R.id.input2);

                text1.setText(value1);
                text2.setText(value2);
            }
        }
    }
}