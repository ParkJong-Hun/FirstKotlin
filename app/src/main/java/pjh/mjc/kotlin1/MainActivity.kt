package pjh.mjc.kotlin1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
//it is my first coding for Kotlin from 04 10 2021
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Hello Kotlin")
    }
    //is adult joke like trash
    fun ButtonClick(v : View) {
        val text1 : TextView = findViewById(R.id.tv)
        when(text1.text) {
            "Click Me" -> text1.text = "Clicked"
            "Clicked" -> text1.text = "It tickles!"
            "It tickles!" -> {
                text1.text = "I'm so happy" + " Sexy guy"
                text1.setBackgroundColor(Color.RED)
                text1.setTextSize(30.0F)
            }
        }
    }
}