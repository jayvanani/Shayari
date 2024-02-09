package com.example.shayari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {


    var array= arrayOf("Morning Shayari","Night Shayari","Birthday Shayari","Love Shayari","Friend Shayari","Attitude Shayari","Funny Shayari","Best Wishes","Yaad Shayari","God Shayari","Other Shayari","Ganesha Shayari","All in one","Holi Shayari","Independence Shayari","Janmashtami Shayari","Royal Shayari","2 Lines Shayari","Motivational Shayari")



    lateinit var list:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        list=findViewById(R.id.list)



        var adapter=Myclass(this@MainActivity2,array)


        list.adapter=adapter

        list.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this@MainActivity2, "$position", Toast.LENGTH_SHORT).show()

            var intent = Intent(this@MainActivity2, MainActivity3::class.java)


            intent.putExtra("name", array[position])

            startActivity(intent)
        }





        }





    }
