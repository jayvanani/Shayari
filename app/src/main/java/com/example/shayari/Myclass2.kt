package com.example.shayari

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipDescription
import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import android.content.Intent
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity


class Myclass2(var mainActivity3: MainActivity3, var empty: Array<String>) : BaseAdapter() {
    override fun getCount(): Int {

        return empty.size
    }

    override fun getItem(position: Int): Any {

        return position

    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var txt2: TextView
        var copy: ImageView
        var share:ImageView
        var whatsapp:ImageView
        var view2 = LayoutInflater.from(mainActivity3).inflate(R.layout.abc2, parent, false)

        txt2 = view2.findViewById(R.id.txt2)
        copy = view2.findViewById(R.id.copy)
        share=view2.findViewById(R.id.share)
        whatsapp=view2.findViewById(R.id.whatsapp)


        txt2.setText(empty[position])

        copy.setOnClickListener {
            val clipboardManager =
                mainActivity3.getSystemService(CLIPBOARD_SERVICE) as ClipboardManager

            // initializing clip data on below line.
            val clipData = ClipData.newPlainText("Clip Data", empty[position])
                .apply {
                    // on below line adding description
                    description.extras = PersistableBundle().apply {
                        // only available for Android13 or higher
                        putBoolean(ClipDescription.MIMETYPE_TEXT_PLAIN, true)
                        // use raw string for older versions
                        // android.content.extra.IS_SENSITIVE
                    }
                }

            // on below line setting primary clip for clip board manager.
            clipboardManager.setPrimaryClip(clipData)

            // displaying toast message as text copied to clip board.
            Toast.makeText(mainActivity3, "Copied to Clipboard", Toast.LENGTH_SHORT).show()


        }

        share.setOnClickListener {
            // Create an Intent with ACTION_SEND
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, empty[position])
            }

            // Start the activity with the specified Intent
            mainActivity3.startActivity(Intent.createChooser(sendIntent, "Share via"))
        }

        whatsapp.setOnClickListener {

            val sendIntent = Intent()
            sendIntent.setAction(Intent.ACTION_SEND)
            sendIntent.putExtra(Intent.EXTRA_TEXT, empty[position])
            sendIntent.setType("text/plain")
            sendIntent.setPackage("com.whatsapp");

            mainActivity3.startActivity(sendIntent)


//            val sendIntent = Intent().apply {
//                action = Intent.ACTION_SEND
//                type = "text/plain"
//                putExtra(Intent.EXTRA_TEXT, empty[position])
//                `package` = "com.whatsapp" // Specify WhatsApp package name
//            }
//
//            // Check if WhatsApp is installed
//            if (mainActivity3.packageManager.resolveActivity(sendIntent, 0) != null) {
//                mainActivity3.startActivity(sendIntent)
//            } else {
//                // WhatsApp is not installed, show a Toast or take appropriate action
//                Toast.makeText(mainActivity3, "WhatsApp not installed", Toast.LENGTH_SHORT).show()
//            }
        }





        return view2


    }

}
