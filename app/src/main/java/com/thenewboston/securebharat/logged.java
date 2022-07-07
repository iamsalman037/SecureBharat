package com.thenewboston.securebharat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by SAM on 4/10/2018.
 */

public class logged extends AppCompatActivity {
    ImageView ib1,ib2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logged);
        ib1=(ImageView) findViewById(R.id.i1);
        ib2=(ImageView) findViewById(R.id.i2);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photo= new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(photo);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Audio=new Intent(getApplicationContext(),Rec.class);
                startActivity(Audio);
            }
        });
    }
}
