package com.example.remembrance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainRemembranceAfterPrayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_remembrance_after_prayer);

        RecyclerView view4=findViewById(R.id.view4);
        ImageView i3=findViewById(R.id.i3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));
            }
        });
        ArrayList<item> data4=new ArrayList<>();
        data4.add(new item("أسـتغفر الله، أسـتغفر الله، أسـتغفر الله.\n" +
                "اللهـم أنـت السلام ، ومـنك السلام ، تباركت يا ذا الجـلال والإكـرام . "));
        data4.add(new item("لا إله إلا الله وحده لا شريك له، له المـلك وله الحمد، وهو على كل شيء قدير، اللهـم لا مانع لما أعطـيت، ولا معطـي لما منـعت، ولا ينفـع ذا الجـد منـك الجـد."));
        data4.add(new item("لا إله إلا الله, وحده لا شريك له، له الملك وله الحمد، وهو على كل شيء قدير، لا حـول ولا قـوة إلا بالله، لا إله إلا اللـه، ولا نعـبـد إلا إيـاه, له النعـمة وله الفضل وله الثـناء الحـسن، لا إله إلا الله مخلصـين لـه الدين ولو كـره الكـافرون."));
        data4.add(new item("سـبحان الله، والحمـد لله ، والله أكـبر.(ثلاثة وثلاثون مرة)"));
        data4.add(new item("لا إله إلا الله وحـده لا شريك له، له الملك وله الحمد، وهو على كل شيء قـدير. "));
        data4.add(new item("بسم الله الرحمن الرحيم\n" +
                "قل هو ٱلله أحد، ٱلله ٱلصمد، لم يلد ولم يولد، ولم يكن لهۥ كفوا أحدۢ.\n" +
                "بسم الله الرحمن الرحيم\n" +
                "قل أعوذ برب ٱلفلق، من شر ما خلق، ومن شر غاسق إذا وقب، ومن شر ٱلنفٰثٰت فى ٱلعقد، ومن شر حاسد إذا حسد.\n" +
                "بسم الله الرحمن الرحيم\n" +
                "قل أعوذ برب ٱلناس، ملك ٱلناس، إلٰه ٱلناس، من شر ٱلوسواس ٱلخناس، ٱلذى يوسوس فى صدور ٱلناس، من ٱلجنة وٱلناس.\n" +
                "ثلاث مرات بعد صلاتي الفجر والمغرب. ومرة بعد الصلوات الأخرى."));
        data4.add(new item("أعوذ بالله من الشيطان الرجيم\n" +
                "الله لا إلـه إلا هو الحي القيوم لا تأخذه سنة ولا نوم له ما في السماوات وما في الأرض من ذا الذي يشفع عنده إلا بإذنه يعلم ما بين أيديهم وما خلفهم ولا يحيطون بشيء من علمه إلا بما شاء وسع كرسيه السماوات والأرض ولا يؤوده حفظهما وهو العلي العظيم. "));
        data4.add(new item("لا إله إلا الله وحـده لا شريك له، له الملك وله الحمد، يحيـي ويمـيت وهو على كل شيء قدير. \n" +
                "عشر مرات بعد المغرب والصـبح."));
        data4.add(new item("اللهـم إنـي أسألـك علمـا نافعـا ورزقـا طيـبا ، وعمـلا متقـبلا. \n" +
                "بعد السلام من صلاة الفجر."));
        data4.add(new item("اللهم أجرني من النار. \n" +
                "بعد صلاة الصبح والمغرب.(ستة مرات)"));
        data4.add(new item("اللهم أعني على ذكرك وشكرك وحسن عبادتك."));



        Recycler recycler=new Recycler(this,data4);
        LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        view4.setLayoutManager(manager1);
        view4.setAdapter(recycler);
    }
}