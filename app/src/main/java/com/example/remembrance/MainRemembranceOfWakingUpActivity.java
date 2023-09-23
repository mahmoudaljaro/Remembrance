package com.example.remembrance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainRemembranceOfWakingUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_remembrance_of_waking_up);
        RecyclerView view3=findViewById(R.id.view3);
        ImageView i6=findViewById(R.id.i6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));
            }
        });
        ArrayList<item> data3=new ArrayList<>();

        data3.add(new item("(الحمد لله الذي أحيانا بعد ما أماتنا، وإليه النشور)"));
        data3.add(new item("(لا إله إلا الله وحده لا شريك له، له الملك وله الحمد، وهو على كل شيء قدير، سبحان الله، والحمد لله، ولا إله إلا الله، والله أكبر، ولا حول ولا قوة إلا بالله العلي العظيم، رب اغفر لي)."));
        data3.add(new item("(الحمد لله الذي عافاني في جسدي، ورد علي روحي، وأذن لي بذكره)."));
        data3.add(new item("﴿إن في خلق السموات والأرض واختلاف الليل والنهار لآيات لأولي الألباب * الذين يذكرون الله قياما وقعودا وعلى جنوبهم ويتفكرون في خلق السموات والأرض ربنا ما خلقت هذا باطلا سبحانك فقنا عذاب النار* ربنا إنك من تدخل النار فقد أخزيته وما للظالمين من أنصار* ربنا إننا سمعنا مناديا ينادي للإيمان أن آمنوا بربكم فآمنا ربنا فاغفر لنا ذنوبنا وكفر عنا سيئاتنا وتوفنا مع الأبرار* ربنا وآتنا ما وعدتنا على رسلك ولا تخزنا يوم القيامة إنك لا تخلف الميعاد* فاستجاب لهم ربهم أني لا أضيع عمل عامل منكم من ذكر أو أنثى بعضكم من بعض فالذين هاجروا وأخرجوا من ديارهم وأوذوا في سبيلي وقاتلوا وقتلوا لأكفرن عنهم سيئاتهم ولأدخلنهم جنات تجري من تحتها الأنهار ثوابا من عند الله والله عنده حسن الثواب * لا يغرنك تقلب الذين كفروا في البلاد * متاع قليل ثم مأواهم جهنم وبئس المهاد * لكن الذين اتقوا ربهم لهم جنات تجري من تحتها الأنهار خالدين فيها نزلا من عند الله وما عند الله خير للأبرار * وإن من أهل الكتاب لمن يؤمن بالله وما أنزل إليكم ومآ أنزل إليهم خاشعين لله لا يشترون بآيات الله ثمنا قليلا أولئك لهم أجرهم عند ربهم إن الله سريع الحساب*يا أيها الذين آمنوا اصبروا وصابروا ورابطوا واتقوا الله لعلكم تفلحون﴾."));

        Recycler recycler=new Recycler(this,data3);
        LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        view3.setLayoutManager(manager1);
        view3.setAdapter(recycler);
    }
}