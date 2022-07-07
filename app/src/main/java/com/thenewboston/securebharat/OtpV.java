package com.thenewboston.securebharat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by SAM on 4/10/2018.
 */

public class OtpV extends AppCompatActivity {
    EditText e1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp);
        e1=(EditText) findViewById(R.id.e1);
    }
}
