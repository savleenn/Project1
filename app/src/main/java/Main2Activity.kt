// Main2Activity.kt (Kotlin)
package com.example.project1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.project1.R

class Main2Activity : AppCompatActivity() {

    private var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textviewCounter : TextView = findViewById(R.id.textviewCounter)
        val plus : Button = findViewById(R.id.plus)
        val minus : Button = findViewById(R.id.minus)

        textviewCounter.text = count.toString()

        plus.setOnClickListener{
            count++
            textviewCounter.text = count.toString()
        }
minus.setOnClickListener{
//if (count>0){
    count--
    textviewCounter.text = count.toString()
//}
}

    // Setting the layout for this activity
    }
}
