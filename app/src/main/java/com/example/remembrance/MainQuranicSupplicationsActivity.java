package com.example.remembrance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainQuranicSupplicationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quranic_supplications);
        RecyclerView view9=findViewById(R.id.view9);
        ImageView i10=findViewById(R.id.i10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));
            }
        });
        ArrayList<item> data9=new ArrayList<>();
        data9.add(new item("\"ربنا آتنا في الدنيا حسنة وفي الآخرة حسنة وقنا عذاب النار\"."));
        data9.add(new item("\"ربنا أفرغ علينا صبرا وثبت أقدامنا وانصرنا على القوم الكافرين\"."));
        data9.add(new item("\"ربنا لا تؤاخذنا إن نسينا أو أخطأنا ربنا ولا تحمل علينا إصرا كما حملته على الذين من قبلنا ربنا ولا تحملنا ما لا طاقة لنا به واعف عنا واغفر لنا وارحمنا أنت مولانا فانصرنا على القوم الكافرين\"."));
        data9.add(new item("\"ربنا لا تزغ قلوبنا بعد إذ هديتنا وهب لنا من لدنك رحمة إنك أنت الوهاب\"."));
        data9.add(new item("\"ربنا إننا آمنا فاغفر لنا ذنوبنا وقنا عذاب النار\". "));
        data9.add(new item("\"رب هب لي من لدنك ذرية طيبة إنك سميع الدعاء\"."));
        data9.add(new item("\"ربنا آمنا بما أنزلت واتبعنا الرسول فاكتبنا مع الشاهدين\"."));
        data9.add(new item("\"ربنا اغفر لنا ذنوبنا وإسرافنا في أمرنا وثبت أقدامنا وانصرنا على القوم الكافرين\"."));
        data9.add(new item("\"ربنا ما خلقت هذا باطلا سبحانك فقنا عذاب النار ربنا إنك من تدخل النار فقد أخزيته وما للظالمين من أنصار ربنا إننا سمعنا مناديا ينادي للإيمان أن آمنوا بربكم فآمنا ربنا فاغفر لنا ذنوبنا وكفر عنا سيئاتنا وتوفنا مع الأبرار ربنا وآتنا ما وعدتنا على رسلك ولا تخزنا يوم القيامة إنك لا تخلف الميعاد\"."));
        data9.add(new item("\"ربنا ظلمنا أنفسنا وإن لم تغفر لنا وترحمنا لنكونن من الخاسرين\"."));
        data9.add(new item("\"ربنا لا تجعلنا مع القوم الظالمين\"."));
        data9.add(new item("\"ربنا أفرغ علينا صبرا وتوفنا مسلمين\"."));
        data9.add(new item("\"حسبي الله لا إلـه إلا هو عليه توكلت وهو رب العرش العظيم\"."));
        data9.add(new item("\"ربنا لا تجعلنا فتنة للقوم الظالمين ونجنا برحمتك من القوم الكافرين\"."));
        data9.add(new item("\"رب إني أعوذ بك أن أسألك ما ليس لي به علم وإلا تغفر لي وترحمني أكن من الخاسرين\"."));
        data9.add(new item("\"رب اجعلني مقيم الصلاة ومن ذريتي ربنا وتقبل دعاء\"."));
        data9.add(new item("\"ربنا اغفر لي ولوالدي وللمؤمنين يوم يقوم الحساب\"."));
        data9.add(new item("\"رب أدخلني مدخل صدق وأخرجني مخرج صدق واجعل لي من لدنك سلطانا نصيرا\"."));
        data9.add(new item("\"ربنا آتنا من لدنك رحمة وهيئ لنا من أمرنا رشدا\"."));
        data9.add(new item("\"رب اشرح لي صدري ويسر لي أمري واحلل عقدة من لساني يفقهوا قولي\". "));
        data9.add(new item("\"رب زدني علما\"."));
        data9.add(new item("\"لا إله إلا أنت سبحانك إني كنت من الظالمين\". "));
        data9.add(new item("\"رب لا تذرني فردا وأنت خير الوارثين\"."));
        data9.add(new item("\"رب أعوذ بك من همزات الشياطين وأعوذ بك رب أن يحضرون\"."));
        data9.add(new item("\"ربنا آمنا فاغفر لنا وارحمنا وأنت خير الراحمين\"."));
        data9.add(new item("\"رب اغفر وارحم وأنت خير الراحمين\"."));

        Recycler recycler=new Recycler(this,data9);
        LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        view9.setLayoutManager(manager1);
        view9.setAdapter(recycler);
    }
}