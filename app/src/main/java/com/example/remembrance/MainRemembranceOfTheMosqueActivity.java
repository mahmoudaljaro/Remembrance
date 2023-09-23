package com.example.remembrance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainRemembranceOfTheMosqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_remembrance_of_the_mosque);
        RecyclerView view7=findViewById(R.id.view7);
        ImageView i8=findViewById(R.id.i8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));
            }
        });
        ArrayList<item> data7=new ArrayList<>();
        data7.add(new item("دعاء الذهاب إلى المسجد\n" +
                "اللهـم اجعـل في قلبـي نورا ، وفي لسـاني نورا، واجعـل في سمعي نورا، واجعـل في بصري نورا، واجعـل من خلفي نورا، ومن أمامـي نورا، واجعـل من فوقـي نورا ، ومن تحتـي نورا .اللهـم أعطنـي نورا."));
        data7.add(new item("دعاء دخول المسجد\n" +
                "يبدأ برجله اليمنى، ويقول:\n" +
                "أعوذ بالله العظيـم وبوجهـه الكريـم وسلطـانه القديـم من الشيـطان الرجـيم، بسم الله، والصلاة والسلام على رسول الله، اللهـم افتـح لي أبواب رحمتـك. "));
        data7.add(new item("دعاء الخروج من المسجد\n" +
                "يبدأ برجله اليسرى، ويقول:\n" +
                "بسـم اللـه والصلاة والسلام على رسول الله، اللهم إني أسألك من فضلك، اللهم اعصمني من الشيطان الرجيم. "));

        Recycler recycler=new Recycler(this,data7);
        LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        view7.setLayoutManager(manager1);
        view7.setAdapter(recycler);

    }
}