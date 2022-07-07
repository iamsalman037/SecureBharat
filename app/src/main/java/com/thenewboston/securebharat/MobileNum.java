package com.thenewboston.securebharat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

/**
 * Created by SAM on 4/10/2018.
 */

public class MobileNum extends AppCompatActivity {
    Button n3;
    EditText e2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mob);
        n3=(Button) findViewById(R.id.b3);
        e2=(EditText) findViewById(R.id.e4);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isValidPhone(e2.getText().toString())) {
                    Intent inte = new Intent(getApplicationContext(), OtpV.class);
                    startActivity(inte);

                } else {

                    Toast.makeText(getApplicationContext(), "Phone number is not valid", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
    private boolean isValidPhone(String phone)
    {
        boolean check=false;
        if(!Pattern.matches("[a-zA-Z]+", phone))
        {
            if(phone.length() < 6 || phone.length() > 13)
            {
                check = false;

            }
            else
            {
                check = true;

            }
        }
        else
        {
            check=false;
        }
        return check;
    }
}
