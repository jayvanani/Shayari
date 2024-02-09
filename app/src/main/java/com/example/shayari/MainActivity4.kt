package com.example.shayari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity4 : AppCompatActivity() {
//
//    lateinit var finalshayari:TextView
//
//    lateinit var next:Button
//    lateinit var previous:Button


    lateinit var pager : ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        pager = findViewById(R.id.pager)
        var array=intent.getStringArrayExtra("next")


        var adapter = MyPagerAdapter(this,array)

        pager.adapter = adapter

        var position=intent.getIntExtra("finalshayari",3)
        pager.setCurrentItem(position)

//        next=findViewById(R.id.next)
//        previous=findViewById(R.id.previous)
//        finalshayari=findViewById(R.id.finalshayari)
//
//        var position=intent.getIntExtra("finalshayari",3)
//        var nextt=intent.getStringArrayExtra("next")
//
//
//        finalshayari.setText(nextt!![position])
//
//        next.setOnClickListener {
//
//            if(position<nextt.size-1)
//            {
//                position++
//            }
//            finalshayari.setText(nextt[position])
//
//        }
//
//        previous.setOnClickListener {
//
//            if(position>0)
//            {
//                position--
//            }
//            finalshayari.setText(nextt[position])
//        }
    }
}