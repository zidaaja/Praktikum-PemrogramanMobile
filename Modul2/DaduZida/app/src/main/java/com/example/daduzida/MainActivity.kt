package com.example.daduzida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.button)

        rollButton.setOnClickListener(){
            rollDadu()
        }
    }

    private fun rollDadu() {
        val dadu = Dadu(6)
        val daduRoll = dadu.acak()
        val gambarDadu: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (daduRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        gambarDadu.setImageResource(drawableResource)

        val dadu2 = Dadu(6)
        val daduRoll2 = dadu2.acak()
        val gambarDadu2: ImageView = findViewById(R.id.imageView2)
        val drawableResource2 = when (daduRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        gambarDadu2.setImageResource(drawableResource2)

        if(daduRoll == daduRoll2){
            Toast.makeText(this, "Selamat Anda dapat dadu double !", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Anda Belum Beruntung !", Toast.LENGTH_SHORT).show()
        }
    }
}

class Dadu(private val sisi: Int) {
    fun acak(): Int {
        return (1..sisi).random()
    }
}
