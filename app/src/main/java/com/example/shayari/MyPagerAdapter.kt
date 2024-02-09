package com.example.shayari

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class MyPagerAdapter(var mainActivity4: MainActivity4,var  array: Array<String>?) : PagerAdapter() {
    override fun getCount(): Int = array!!.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean = (view == `object`)

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var txt : TextView

        var v = LayoutInflater.from(mainActivity4).inflate(R.layout.abcd,container,false)
        txt = v.findViewById(R.id.txt)
        txt.setText(array!![position])

        container.addView(v)

        return v

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as View)
    }
}
