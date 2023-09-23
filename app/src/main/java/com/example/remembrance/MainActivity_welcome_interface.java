package com.example.remembrance;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity_welcome_interface extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_interface);
        LinearLayout layout =findViewById(R.id.layout);


     //  ImageView img=findViewById(R.id.img);
       // img.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View v) {
            //   startActivity(new Intent(MainActivity_welcome_interface.this,MainInterfaceActivity.class));
           // }
        //});

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(),MainInterfaceActivity.class);
                startActivity(intent);

            }
        },1000);











        
    }

}