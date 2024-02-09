package com.example.shayari

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Myclass(var mainActivity2: MainActivity2,var array: Array<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var txt:TextView

        var view=LayoutInflater.from(mainActivity2).inflate(R.layout.abc,parent,false)

        txt=view.findViewById(R.id.txt)
        txt.setText(array[position])

        return view

    }


}
