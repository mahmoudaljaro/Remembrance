package com.example.remembrance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainProphetsSupplicationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prophets_supplications);
        RecyclerView view8=findViewById(R.id.view8);
        ImageView i9=findViewById(R.id.i9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));
            }
        });

        ArrayList<item> data8=new ArrayList<>();
        data8.add(new item("\"ربنا ظلمنا أنفسنا وإن لم تغفر لنا وترحمنا لنكونن من الخاسرين\""));
        data8.add(new item("\"رب اغفر لي ولوالدي ولمن دخل بيتي مؤمنا وللمؤمنين والمؤمنات ولا تزد الظالمين إلا تبارا\"."));
        data8.add(new item("\" رب إني أعوذ بك أن أسألك ما ليس لي به علم وإلا تغفر لي وترحمني أكن من الخاسرين\"."));
        data8.add(new item("\"رب أنزلني منزلا مباركا وأنت خير المنزلين\""));
        data8.add(new item("\"ربنا تقبل منا إنك أنت السميع العليم  ربنا واجعلنا مسلمين لك ومن ذريتنا أمة مسلمة لك وأرنا مناسكنا وتب علينا إنك أنت التواب الرحيم \""));
        data8.add(new item("\"رب اجعلني مقيم الصلاة ومن ذريتي ۚ ربنا وتقبل دعاء  ربنا اغفر لي ولوالدي وللمؤمنين يوم يقوم الحساب \"."));
        data8.add(new item("\"رب هب لي حكما وألحقني بالصالحين  واجعل لي لسان صدق في الآخرين (84) واجعلني من ورثة جنة النعيم \"."));
        data8.add(new item("\"ربنا عليك توكلنا وإليك أنبنا وإليك المصير  ربنا لا تجعلنا فتنة للذين كفروا واغفر لنا ربنا ۖ  إنك أنت العزيز الحكيم \"."));
        data8.add(new item("\"رب هب لي من الصالحين\"."));
        data8.add(new item("\"إني توكلت على الله ربي وربكم ۚ ما من دابة إلا هو آخذ بناصيتها ۚ إن ربي علىٰ صراط مستقيم\"."));
        data8.add(new item("\"رب انصرني على القوم المفسدين\"."));
        data8.add(new item("\"رب نجني وأهلي مما يعملون\"."));
        data8.add(new item("\"فاطر السماوات والأرض أنت وليي في الدنيا والآخرة ۖ توفني مسلما وألحقني بالصالحين\"."));
        data8.add(new item("\"وسع ربنا كل شيء علما على الله توكلنا ربنا افتح بيننا وبين قومنا بالحق وأنت خير الفاتحين\"."));
        data8.add(new item("\"رب إني ظلمت نفسي فاغفر لي\"."));
        data8.add(new item("\"رب بما أنعمت علي فلن أكون ظهيرا للمجرمين\"."));
        data8.add(new item("\"رب إني لما أنزلت إلي من خير فقير\"."));
        data8.add(new item("\"رب اشرح لي صدري  ويسر لي أمري  واحلل عقدة من لساني  يفقهوا قولي \"."));
        data8.add(new item("\"أني مسني الضر وأنت أرحم الراحمين\"."));
        data8.add(new item("\"رب أوزعني أن أشكر نعمتك التي أنعمت علي وعلى والدي وأن أعمل صالحا ترضاه وأدخلني برحمتك في عبادك الصالحين\"."));
        data8.add(new item("\" لا إله إلا أنت سبحانك إني كنت من الظالمين\". "));
        data8.add(new item("\"رب هب لي من لدنك ذرية طيبة إنك سميع الدعاء\"."));
        data8.add(new item("\"رب لا تذرني فردا وأنت خير الوارثين\"."));
        data8.add(new item("\"إنما أشكو بثي وحزني إلى الله\"."));



        Recycler recycler=new Recycler(this,data8);
        LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        view8.setLayoutManager(manager1);
        view8.setAdapter(recycler);
    }
}