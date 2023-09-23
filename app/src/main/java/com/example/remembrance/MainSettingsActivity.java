package com.example.remembrance;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainSettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_settings);
        LinearLayout layoutHome=findViewById(R.id.layoutHome);
        LinearLayout layout13=findViewById(R.id.layout13);
        LinearLayout layout14=findViewById(R.id.layout14);
        LinearLayout layout15=findViewById(R.id.layout15);
        layout15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://instagram.com/mahmoud.raed1?igshid=NTc4MTIwNjQ2YQ=="));
                startActivity(intent);
            }
        });
        layout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://t.me/mhmoadu"));
                startActivity(intent);
            }
        });


        layout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Check out this cool Application");
                intent.putExtra(Intent.EXTRA_TEXT,"Your Application Link Here");
                startActivity(Intent.createChooser(intent,"Share Via"));
            }
        });
        layoutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));

            }
        });

        // RecyclerView view12=findViewById(R.id.view12);
       // ArrayList<item> data12=new ArrayList<>();
      //  data12.add(new item("مشاركة التطبيق"));
       // data12.add(new item("ستوريات قرانية"));
      //  data12.add(new item("تابعونا على الانستقرام"));

     //   Recycler recycler=new Recycler(this,data12);
       // LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
       // view12.setLayoutManager(manager1);
      //  view12.setAdapter(recycler);

       // ImageView img_Main=findViewById(R.id.img_Main);
       // img_Main.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View v) {
          //      startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));
          //  }
        //});
    }


}