package com.example.remembrance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class CitationfOrMorningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citationf_or_morning);

        ImageView i1=findViewById(R.id.i1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));
            }
        });
        RecyclerView view=findViewById(R.id.view);

        ArrayList<item> data=new ArrayList<>();
        data.add(new item("(أَصبَحْنا على فِطرةِ الإسلامِ، وعلى كَلِمةِ الإخلاصِ، وعلى دِينِ نَبيِّنا محمَّدٍ صلَّى اللهُ عليه وسلَّمَ، وعلى مِلَّةِ أبِينا إبراهيمَ، حَنيفًا مُسلِمًا، وما كان مِنَ المُشرِكينَ)."));
        data.add(new item("(بسمِ اللهِ الذي لا يَضرُ مع اسمِه شيءٌ في الأرضِ ولا في السماءِ وهو السميعُ العليمِ)(ثلاثُ مراتٍ)."));
        data.add(new item("\n" +
                "(سبحانَ اللَّهِ وبحمدِه لا قوَّةَ إلَّا باللَّهِ/ ما شاءَ اللَّهُ كانَ وما لم يشأ لم يَكن/ أعلمُ أنَّ اللَّهَ على كلِّ شيءٍ قديرٌ وأنَّ اللَّهَ قد أحاطَ بِكلِّ شيءٍ علمًا)/ فإنَّهُ من قالَها حينَ يصبِحُ حُفِظَ حتَّى يمسيَ ومن قالَها حينَ يمسي حُفِظَ حتَّى يصبِحَ."));
        data.add(new item("\n" +
                "(سبحانَ اللَّهِ وبحمدِهِ مئةَ مرَّةٍ)."));
        data.add(new item("(اللَّهمَّ بِكَ أصبَحنا، وبِكَ أمسَينا، وبِكَ نحيا وبِكَ نموتُ وإليكَ المصيرُ، وإذا أمسَى فليقُلْ: اللَّهمَّ بِكَ أمسَينا وبِكَ أصبَحنا وبِكَ نحيا وبِكَ نموتُ وإليكَ النُّشورُ)."));
        data.add(new item("(رَضيتُ باللَّهِ ربًّا، وبالإسلامِ دينًا، وبِمُحمَّدٍ رسولًا)، من قالها وجبت له الجنة."));
        data.add(new item("(اللَّهمَّ عالِمَ الغَيبِ والشَّهادةِ، فاطرَ السَّمواتِ والأرضِ، رَبَّ كلِّ شيءٍ ومَليكَهُ، أشهدُ أن لا إلَهَ إلَّا أنتَ، أعوذُ بِكَ مِن شرِّ نفسي وشرِّ الشَّيطانِ وشِركِهِ، قلهُ إذا أصبَحتَ، وإذا أمسَيتَ، وإذا أخَذتَ مَضجعَكَ)."));
        data.add(new item("\n" +
                "(اللَّهمَّ ما أصبحَ بي من نعمةٍ أو بأحدٍ من خلقِكَ فمنكَ وحدَكَ لا شريكَ لكَ فلكَ الحمدُ ولكَ الشُّكرُ) فمن قالها عندما يُصبح فقد أدَّى شكرَ يومِهِ، ومن قالَ مثلَ ذلكَ حينَ يمسي فقد أدَّى شكرَ ليلتِهِ."));
        data.add(new item("(سُبْحَانَ اللهِ وَبِحَمْدِهِ، عَدَدَ خَلْقِهِ وَرِضَا نَفْسِهِ وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ)، وهي تُقال ثلاث مرات."));
        data.add(new item("\n" +
                "(حَسبيَ اللهُ لا إلهَ إلَّا هو، عليه تَوكَّلْتُ، وهو ربُّ العَرشِ العَظيمِ)، سَبعَ مراتٍ، فمن قالها كَفاه اللهُ ما أهَمَّه من أمرِ الدُّنيا والآخِرةِ."));
        data.add(new item("\n" +
                "(اللَّهُمَّ إنِّي أصبَحتُ أُشهِدُك، وأُشهِدُ حَمَلةَ عَرشِكَ، ومَلائِكَتَك، وجميعَ خَلقِكَ: أنَّكَ أنتَ اللهُ لا إلهَ إلَّا أنتَ، وأنَّ مُحمَّدًا عبدُكَ ورسولُكَ)."));
        data.add(new item("\n" +
                "(اللهمَّ ما أصبحَ بي منْ نعمةٍ أو بأحدٍ منْ خلقِكَ فمنكَ وحدكَ لا شريكَ لكَ، فلك الحمدُ ولك الشُّكر)، من قالها حين يصبح وحين يمسي فقد أدى شكرَ ذلك اليومَ."));
        data.add(new item("\n" +
                "(أَصْـبَحْنا وَأَصْـبَحَ المُـلْكُ لله وَالحَمدُ لله، لا إلهَ إلاّ اللّهُ وَحدَهُ لا شَريكَ لهُ، لهُ المُـلكُ ولهُ الحَمْـد، وهُوَ على كلّ شَيءٍ قدير، رَبِّ أسْـأَلُـكَ خَـيرَ ما في هـذا اليوم وَخَـيرَ ما بَعْـدَه، وَأَعـوذُ بِكَ مِنْ شَـرِّ ما في هـذا اليوم وَشَرِّ ما بَعْـدَه، رَبِّ أَعـوذُ بِكَ مِنَ الْكَسَـلِ وَسـوءِ الْكِـبَر، رَبِّ أَعـوذُ بِكَ مِنْ عَـذابٍ في النّـارِ وَعَـذابٍ في القَـبْر)."));
        data.add(new item("\n" +
                "اللَّهُمَّ صَلِّ وَسَلِّمْ وَبَارِكْ على نَبِيِّنَا مُحمَّد، فقد جاء في الحديث: (مَن صلى عَلَيَّ حين يُصْبِحُ عَشْرًا، وحين يُمْسِي عَشْرًا أَدْرَكَتْه شفاعتي يومَ القيامةِ)."));
        data.add(new item("\n" +
                "(أستغفرُ اللهَ العظيمَ الذي لا إلهَ إلَّا هو الحيَّ القيومَ وأتوبُ إليه)."));
        data.add(new item("\n" +
                "(لا إلهَ إلَّا اللهُ وحدَه لا شريكَ له له الملكُ وله الحمدُ وهو على كلِّ شيءٍ قديرٌ)."));





        Recycler recycler=new Recycler(this,data);
        LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
         view.setLayoutManager(manager1);
          view.setAdapter(recycler);
    }
}