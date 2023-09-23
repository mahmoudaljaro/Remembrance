package com.example.remembrance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainRemembranceOfSleepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_remembrance_of_sleep);

        RecyclerView view2=findViewById(R.id.view2);
        ImageView i5=findViewById(R.id.i5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainInterfaceActivity.class));
            }
        });
        ArrayList<item> data2=new ArrayList<>();
        Recycler recycler=new Recycler(this,data2);

        data2.add(new item("\n" +
                "(آمَنَ الرَّسُولُ بِمَا أُنزِلَ إِلَيْهِ مِن رَّبِّهِ وَالْمُؤْمِنُونَ ۚ كُلٌّ آمَنَ بِاللَّهِ وَمَلَائِكَتِهِ وَكُتُبِهِ وَرُسُلِهِ لَا نُفَرِّقُ بَيْنَ أَحَدٍ مِّن رُّسُلِهِ ۚ وَقَالُوا سَمِعْنَا وَأَطَعْنَا ۖ غُفْرَانَكَ رَبَّنَا وَإِلَيْكَ الْمَصِيرُ*لَا يُكَلِّفُ اللَّهُ نَفْسًا إِلَّا وُسْعَهَا ۚ لَهَا مَا كَسَبَتْ وَعَلَيْهَا مَا اكْتَسَبَتْ ۗ رَبَّنَا لَا تُؤَاخِذْنَا إِن نَّسِينَا أَوْ أَخْطَأْنَا ۚ رَبَّنَا وَلَا تَحْمِلْ عَلَيْنَا إِصْرًا كَمَا حَمَلْتَهُ عَلَى الَّذِينَ مِن قَبْلِنَا ۚ رَبَّنَا وَلَا تُحَمِّلْنَا مَا لَا طَاقَةَ لَنَا بِهِ ۖ وَاعْفُ عَنَّا وَاغْفِرْ لَنَا وَارْحَمْنَا ۚ أَنتَ مَوْلَانَا فَانصُرْنَا عَلَى الْقَوْمِ الْكَافِرِينَ)"));
        data2.add(new item("\n" +
                "قراءة آية الكرسي: (اللَّهُ لَا إِلَٰهَ إِلَّا هُوَ الْحَيُّ الْقَيُّومُ ۚ لَا تَأْخُذُهُ سِنَةٌ وَلَا نَوْمٌ ۚ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ ۗ مَن ذَا الَّذِي يَشْفَعُ عِندَهُ إِلَّا بِإِذْنِهِ ۚ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ ۖ وَلَا يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلَّا بِمَا شَاءَ ۚ وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ ۖ وَلَا يَئُودُهُ حِفْظُهُمَا ۚ وَهُوَ الْعَلِيُّ الْعَظِيمُ)."));
        data2.add(new item("\n" +
                "(قُلْ هُوَ اللَّهُ أَحَدٌ*اللَّهُ الصَّمَدُ*لَمْ يَلِدْ وَلَمْ يُولَدْ*وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ).[٣] (قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ*مِن شَرِّ مَا خَلَقَ*وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ*وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ*وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ).[٤] (قُلْ أَعُوذُ بِرَبِّ النَّاسِ*مَلِكِ النَّاسِ*إِلَٰهِ النَّاسِ*مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ*الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ*مِنَ الْجِنَّةِ وَالنَّاسِ)."));
        data2.add(new item("\n" +
                "(قُلْ يَا أَيُّهَا الْكَافِرُونَ* لَا أَعْبُدُ مَا تَعْبُدُونَ* وَلَا أَنتُمْ عَابِدُونَ مَا أَعْبُدُ* وَلَا أَنَا عَابِدٌ مَّا عَبَدتُّمْ* وَلَا أَنتُمْ عَابِدُونَ مَا أَعْبُدُ* لَكُمْ دِينُكُمْ وَلِيَ دِينِ)."));
        data2.add(new item("\n" +
                "قراءة سورة الملك: (تَبَارَكَ الَّذِي بِيَدِهِ الْمُلْكُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ* الَّذِي خَلَقَ الْمَوْتَ وَالْحَيَاةَ لِيَبْلُوَكُمْ أَيُّكُمْ أَحْسَنُ عَمَلًا وَهُوَ الْعَزِيزُ الْغَفُورُ* الَّذِي خَلَقَ سَبْعَ سَمَاوَاتٍ طِبَاقًا مَّا تَرَى فِي خَلْقِ الرَّحْمَـنِ مِن تَفَاوُتٍ فَارْجِعِ الْبَصَرَ هَلْ تَرَى مِن فُطُورٍ* ثُمَّ ارْجِعِ الْبَصَرَ كَرَّتَيْنِ يَنقَلِبْ إِلَيْكَ الْبَصَرُ خَاسِئًا وَهُوَ حَسِيرٌ* وَلَقَدْ زَيَّنَّا السَّمَاءَ الدُّنْيَا بِمَصَابِيحَ وَجَعَلْنَاهَا رُجُومًا لِّلشَّيَاطِينِ وَأَعْتَدْنَا لَهُمْ عَذَابَ السَّعِيرِ* وَلِلَّذِينَ كَفَرُوا بِرَبِّهِمْ عَذَابُ جَهَنَّمَ وَبِئْسَ الْمَصِيرُ* إِذَا أُلْقُوا فِيهَا سَمِعُوا لَهَا شَهِيقًا وَهِيَ تَفُورُ* تَكَادُ تَمَيَّزُ مِنَ الْغَيْظِ كُلَّمَا أُلْقِيَ فِيهَا فَوْجٌ سَأَلَهُمْ خَزَنَتُهَا أَلَمْ يَأْتِكُمْ نَذِيرٌ* قَالُوا بَلَى قَدْ جَاءَنَا نَذِيرٌ فَكَذَّبْنَا وَقُلْنَا مَا نَزَّلَ اللَّـهُ مِن شَيْءٍ إِنْ أَنتُمْ إِلَّا فِي ضَلَالٍ كَبِيرٍ* وَقَالُوا لَوْ كُنَّا نَسْمَعُ أَوْ نَعْقِلُ مَا كُنَّا فِي أَصْحَابِ السَّعِيرِ* فَاعْتَرَفُوا بِذَنبِهِمْ فَسُحْقًا لِّأَصْحَابِ السَّعِيرِ* إِنَّ الَّذِينَ يَخْشَوْنَ رَبَّهُم بِالْغَيْبِ لَهُم مَّغْفِرَةٌ وَأَجْرٌ كَبِيرٌ* وَأَسِرُّوا قَوْلَكُمْ أَوِ اجْهَرُوا بِهِ إِنَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ* أَلَا يَعْلَمُ مَنْ خَلَقَ وَهُوَ اللَّطِيفُ الْخَبِيرُ* هُوَ الَّذِي جَعَلَ لَكُمُ الْأَرْضَ ذَلُولًا فَامْشُوا فِي مَنَاكِبِهَا وَكُلُوا مِن رِّزْقِهِ وَإِلَيْهِ النُّشُورُ* أَأَمِنتُم مَّن فِي السَّمَاءِ أَن يَخْسِفَ بِكُمُ الْأَرْضَ فَإِذَا هِيَ تَمُورُ* أَمْ أَمِنتُم مَّن فِي السَّمَاءِ أَن يُرْسِلَ عَلَيْكُمْ حَاصِبًا فَسَتَعْلَمُونَ كَيْفَ نَذِيرِ* وَلَقَدْ كَذَّبَ الَّذِينَ مِن قَبْلِهِمْ فَكَيْفَ كَانَ نَكِيرِ* أَوَلَمْ يَرَوْا إِلَى الطَّيْرِ فَوْقَهُمْ صَافَّاتٍ وَيَقْبِضْنَ مَا يُمْسِكُهُنَّ إِلَّا الرَّحْمَـنُ إِنَّهُ بِكُلِّ شَيْءٍ بَصِيرٌ* أَمَّنْ هَـذَا الَّذِي هُوَ جُندٌ لَّكُمْ يَنصُرُكُم مِّن دُونِ الرَّحْمَـنِ إِنِ الْكَافِرُونَ إِلَّا فِي غُرُورٍ* أَمَّنْ هَـذَا الَّذِي يَرْزُقُكُمْ إِنْ أَمْسَكَ رِزْقَهُ بَل لَّجُّوا فِي عُتُوٍّ وَنُفُورٍ* أَفَمَن يَمْشِي مُكِبًّا عَلَى وَجْهِهِ أَهْدَى أَمَّن يَمْشِي سَوِيًّا عَلَى صِرَاطٍ مُّسْتَقِيمٍ* قُلْ هُوَ الَّذِي أَنشَأَكُمْ وَجَعَلَ لَكُمُ السَّمْعَ وَالْأَبْصَارَ وَالْأَفْئِدَةَ قَلِيلًا مَّا تَشْكُرُونَ* قُلْ هُوَ الَّذِي ذَرَأَكُمْ فِي الْأَرْضِ وَإِلَيْهِ تُحْشَرُونَ* وَيَقُولُونَ مَتَى هَـذَا الْوَعْدُ إِن كُنتُمْ صَادِقِينَ* قُلْ إِنَّمَا الْعِلْمُ عِندَ اللَّـهِ وَإِنَّمَا أَنَا نَذِيرٌ مُّبِينٌ* فَلَمَّا رَأَوْهُ زُلْفَةً سِيئَتْ وُجُوهُ الَّذِينَ كَفَرُوا وَقِيلَ هَـذَا الَّذِي كُنتُم بِهِ تَدَّعُونَ* قُلْ أَرَأَيْتُمْ إِنْ أَهْلَكَنِيَ اللَّـهُ وَمَن مَّعِيَ أَوْ رَحِمَنَا فَمَن يُجِيرُ الْكَافِرِينَ مِنْ عَذَابٍ أَلِيمٍ* قُلْ هُوَ الرَّحْمَـنُ آمَنَّا بِهِ وَعَلَيْهِ تَوَكَّلْنَا فَسَتَعْلَمُونَ مَنْ هُوَ فِي ضَلَالٍ مُّبِينٍ* قُلْ أَرَأَيْتُمْ إِنْ أَصْبَحَ مَاؤُكُمْ غَوْرًا فَمَن يَأْتِيكُم بِمَاءٍ مَّعِينٍ)."));
        data2.add(new item("\n" +
                "(اللَّهُمَّ أسْلَمْتُ نَفْسِي إلَيْكَ، وفَوَّضْتُ أمْرِي إلَيْكَ، ووَجَّهْتُ وجْهِي إلَيْكَ، وأَلْجَأْتُ ظَهْرِي إلَيْكَ، رَغْبَةً ورَهْبَةً إلَيْكَ، لا مَلْجَا ولَا مَنْجَا مِنْكَ إلَّا إلَيْكَ، آمَنْتُ بكِتَابِكَ الذي أنْزَلْتَ، وبِنَبِيِّكَ الذي أرْسَلْتَ)."));
        data2.add(new item("\n" +
                "(اللَّهُمَّ رَبَّ السَّمَوَاتِ وَرَبَّ الأرْضِ وَرَبَّ العَرْشِ العَظِيمِ، رَبَّنَا وَرَبَّ كُلِّ شيءٍ، فَالِقَ الحَبِّ وَالنَّوَى، وَمُنْزِلَ التَّوْرَاةِ وَالإِنْجِيلِ وَالْفُرْقَانِ، أَعُوذُ بكَ مِن شَرِّ كُلِّ شيءٍ أَنْتَ آخِذٌ بنَاصِيَتِهِ، اللَّهُمَّ أَنْتَ الأوَّلُ فليسَ قَبْلَكَ شيءٌ، وَأَنْتَ الآخِرُ فليسَ بَعْدَكَ شيءٌ، وَأَنْتَ الظَّاهِرُ فليسَ فَوْقَكَ شيءٌ، وَأَنْتَ البَاطِنُ فليسَ دُونَكَ شيءٌ، اقْضِ عَنَّا الدَّيْنَ، وَأَغْنِنَا مِنَ الفَقْرِ)."));
        data2.add(new item("(رب قني عذابك يوم تبعث عبادك).\n"));
        data2.add(new item("\n" +
                "(الحمدُ للهِ الذي أطعَمَنا، وسقانا، وكفانا، وآوانا فكَم مِمَّنْ لا كافِيَ له، ولامُؤْوِيَ له)."));
        data2.add(new item("(سُبْحَانَكَ اللَّهُمَّ رَبِّي بكَ وَضَعْتُ جَنْبِي، وَبِكَ أَرْفَعُهُ، إنْ أَمْسَكْتَ نَفْسِي، فَاغْفِرْ لَهَا، وإنْ أَرْسَلْتَهَا فَاحْفَظْهَا بما تَحْفَظُ به عِبَادَكَ الصَّالِحِينَ)."));
        data2.add(new item("\n" +
                "(اللَّهُمَّ باسْمِكَ أحْيَا وأَمُوتُ)."));
        data2.add(new item("(بسم اللهِ وضعتُ جنبي، اللهم اغفر لي ذنبي، وأخْسئْ شيطاني، وفكَّ رِهاني، واجعلني في النديِّ الأعلى)."));
        data2.add(new item("(اللَّهمَّ إنِّي أعوذُ بوجهِكَ الكريمِ، وَكَلماتِكَ التَّامَّةِ، مِن شرِّ ما أنتَ آخذٌ بناصيتِهِ، اللَّهمَّ أنتَ تَكْشِفُ المغرمَ والمأثمَ، اللَّهمَّ لا يُهْزَمُ جندُكَ، ولا يُخلَفُ وعدُكَ، ولا ينفعُ ذا الجدِّ منكَ الجدُّ سُبحانَكَ وبحمدِكَ)"));









        LinearLayoutManager manager1 =new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        view2.setLayoutManager(manager1);
        view2.setAdapter(recycler);
    }
}