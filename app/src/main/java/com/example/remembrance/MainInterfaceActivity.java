package com.example.remembrance;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainInterfaceActivity extends AppCompatActivity {
//RecyclerView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
        LinearLayout layout1=findViewById(R.id.layout1);
        LinearLayout layout2=findViewById(R.id.layout2);
        LinearLayout layout3=findViewById(R.id.layout3);
        LinearLayout layout4=findViewById(R.id.layout4);
        LinearLayout layout5=findViewById(R.id.layout5);
        LinearLayout layout6=findViewById(R.id.layout6);
        LinearLayout layout7=findViewById(R.id.layout7);
        LinearLayout layout8=findViewById(R.id.layout8);
        LinearLayout layout9=findViewById(R.id.layout9);
        LinearLayout layout10=findViewById(R.id.layout10);
        LinearLayout layout11=findViewById(R.id.layout11);
        LinearLayout layout12=findViewById(R.id.layout12);

        LinearLayout layoutSettings=findViewById(R.id.layoutSettings);

        layoutSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainSettingsActivity.class));
            }
        });
        //ImageView img_settings=findViewById(R.id.img_settings);


       // img_settings.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  startActivity(new Intent(getApplicationContext(),MainSettingsActivity.class));
            //}
      //  });


        layout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainRemembrancesForHajjAndUmrahActivity.class));
            }
        });
        layout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainRoquiaActivity.class));
            }
        });
        layout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainQuranicSupplicationsActivity.class));
            }
        });
        layout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainProphetsSupplicationsActivity.class));
            }
        });
        layout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainRemembranceOfTheMosqueActivity.class));
            }
        });

        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainSealOfTheHolyQuranActivity.class));
            }
        });

        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainRemembranceOfPrayerActivity.class));
            }
        });
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainRemembranceAfterPrayerActivity.class));
            }
        });




        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainRemembranceOfWakingUpActivity.class));
            }
        });


        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainRemembranceOfSleepActivity.class));
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainEveningPrayersActivity.class));
            }
        });

layout1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(),CitationfOrMorningActivity.class));
    }
});


     //view =findViewById(R.id.view);
     //  ArrayList<item> data=new ArrayList<>();
     //  data.add(new item("أذكار الصباح"));
     //  Recycler recycler=new Recycler(this,data);
    //    LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    //  view.setLayoutManager(manager1);
      //  view.setAdapter(recycler);
    }


}