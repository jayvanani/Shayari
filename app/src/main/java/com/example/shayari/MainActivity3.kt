package com.example.shayari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    lateinit var txt : TextView

    lateinit var list3:ListView

    var Morning= arrayOf("एक दूसरे के लिए जीने का नाम ही जिंदगी है\n" +
            "\n" +
            "इसलिए वक्त उन्हें दो जो तुम्हे दिल से अपना मानते हैं।","जरूरत है तो बस शुरुआत करने की,\n" +
            "\n" +
            "हर दिन एक शुभ दिन बन जाता है\n" +
            "\n" +
            "सुप्रभात। आपका दिन शुभ हो।","कल चाहे कितना भी बुरा था, बीत गया।\n" +
            "\n" +
            "आपको नई सुबह की शुभकामनाएं।","हर सूर्यास्त हमारे जीवन से\n" +
            "\n" +
            "एक दिन कम कर देता है\n" +
            "\n" +
            "लेकिन हर सूर्योदय हमें\n" +
            "\n" +
            "आशा भरा एक और दिन दे देता है।","आज से बेहतर कुछ नहीं\n" +
            "\n" +
            "क्योंकि कल कभी आता नहीं\n" +
            "\n" +
            "और आज कभी जाता नहीं।")

    var Night= arrayOf("हो चुकी रात अब सो भी जाइए\n" +
            "\n" +
            "जो हैं दिल के करीब उनके ख्यालों में खो जाइए\n" +
            "\n" +
            "कर रहा होगा कोई इंतज़ार आपका\n" +
            "\n" +
            "ख़्वाबों में ही सही उनसे मिल तो आइये।\n" +
            "\n" +
            "Good Night! Sweet Dreams!","जैसे तारे ऊपर चमकते हैं,\n" +
            "\n" +
            "मेरे विचार हमारी यादों के साथ चमकते हैं।\n" +
            "\n" +
            "यहाँ मीठे सपनों की एक रात और\n" +
            "\n" +
            "आपकी चमक से भरे कल का वादा है।","सोते हुए को जगाएंगे हम,\n" +
            "\n" +
            "आप की नींदे चुराएंगे हम,\n" +
            "\n" +
            "हर वक्त SMS करके सताएंगे हम,\n" +
            "\n" +
            "आप को आएगा गुस्सा लेकीन,\n" +
            "\n" +
            "उस गुस्से मे ही याद तो आएंगे हम।","आप मेरे सपनों की रानी हैं,\n" +
            "\n" +
            "एकमात्र जिसे मैं हर रात\n" +
            "\n" +
            "अपने सपनों में देखना चाहता हूं।\n" +
            "\n" +
            "तुम्हारी रात अच्छी बीते। शुभ रात्रि।")

    var Birthday= arrayOf("फूलों ने अमृत का जाम भेजा है\n" +
            "\n" +
            "सूरज ने गगन सलाम भेजा है\n" +
            "\n" +
            "मुबारक हो आपको जन्मदिन\n" +
            "\n" +
            "हमने तहेदिल से ये पैगाम भेजा है।\uD83C\uDF82\uD83E\uDD73","कोशिश करो ऐसी की हर सपना साकार हो,\n" +
            "\n" +
            "ईश्वर करें की दुनियां में बस आपके ही नाम का शोर हो।","हर लम्हा आपके होठों पे मुस्कान रहे,\n" +
            "\n" +
            "हर ग़म से आप अनजान रहे,\n" +
            "\n" +
            "जिसके साथ महक उठे आपकी ज़िन्दगी,\n" +
            "\n" +
            "हमेशा आपके साथ वो इंसान रहे.\n" +
            "\n" +
            "जन्मदिन के ये ख़ास लम्हें मुबारक","आपका जन्मदिन एक संकेत है कि आपमें\n" +
            "\n" +
            "अपना एक बेहतर संस्करण बनाने की शक्ति है।\n" +
            "\n" +
            "बढ़ते रहो, चमकते रहो। जन्मदिन की शुभकामनाएँ!","इस जन्म दिवस के अवसर पर\n" +
            "\n" +
            "भगवान से यही प्रार्थना है की\n" +
            "\n" +
            "आपकी हर प्रार्थना पूरी हो।")

    var Love= arrayOf("तुमसे शुरू और तुमपर खतम,\n" +
            "मेरा गुस्सा और मेरा प्यार…!","मुझे उसकी फिक्र रहती थी,\n" +
            "और उसे इस दुनिया की…!","देख लेना रो रोकर पुकारोगे,\n" +
            "मुझे जरा मर तो जाने दो…!","सुनो जो यादें तुम्हारे पास है,\n" +
            "उन्हे कभी टूटने मत देना…!","किसी ने मुझसे पूछा के तेरा अपना कोन है,\n" +
            "मैने कहा वक्त अच्छा तो सब अपने वरना कोई नही…!")

    var Friend= arrayOf("जो दोस्त पहले मिलने का बहाना ढूंढते थे,\n" +
            "\n" +
            "आज ना मिलने के लिए बहाने बनाते है।","दोस्ती के फूल हर मौसम में खिलते हैं\n" +
            "\n" +
            "दोस्ती के बादल हर मौसम में बरसते हैं\n" +
            "\n" +
            "हम Miss You कहे या ना कहे\n" +
            "\n" +
            "ये सच हैं कि हम आप सबको दिल से याद करते हैं।","एक सबसे अच्छे दोस्त को खोना\n" +
            "\n" +
            "आपकी आत्मा का एक हिस्सा\n" +
            "\n" +
            "खोने जैसा महसूस हो सकता है,\n" +
            "\n" +
            "जिससे आप अंदर से खाली हो जाएंगे।","वो दोस्त दुश्मनों से ज्यादा रुला देते हैं,\n" +
            "\n" +
            "जो मतलब के वक़्त याद कर के\n" +
            "\n" +
            "ज़रुरत के वक़्त भुला देते हैं।")

    var empty= arrayOf<String>("")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        txt = findViewById(R.id.txt)

        list3=findViewById(R.id.list3)

        var text = intent.getStringExtra("name")

        txt.setText(text.toString())


        if(text=="Morning Shayari")
        {
            empty=Morning
        }else if(text=="Night Shayari")
        {
            empty=Night
        }
        else if (text=="Birthday Shayari")
        {
            empty=Birthday
        }
        else if(text=="Love Shayari")
        {
            empty=Love
        }
        else
        {
            empty=Friend
        }

        var adapter=Myclass2(this,empty)


        list3.adapter=adapter


        list3.setOnItemClickListener { parent, view, position, id ->

            var intent=Intent(this@MainActivity3,MainActivity4::class.java)

            intent.putExtra("finalshayari",position)

            intent.putExtra("next",empty)



            startActivity(intent)



        }








    }
}