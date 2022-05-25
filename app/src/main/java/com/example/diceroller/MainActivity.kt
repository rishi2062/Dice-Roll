package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button) // every attributes when created have its own number so this findviewid helps to find that id
        rollButton.setOnClickListener { rollDice() }  // this function setonclicklistener basically reads or listens every click of the button
        rollDice1()  // when app starts this function now executes
    }


    // Updation after startup
    private fun rollDice() {
        val dice = Dice(6)
        // val greet = "You Win""
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)  // resource id of imageView is assigned to variable diceImage
        //val resultTextView3: TextView = findViewById(R.id.textView3)

        // Updates the Content description of the image
        diceImage.contentDescription = diceRoll.toString()

        when (diceRoll) {
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
// To congrats if lucky number occurs and also a example of using two textviews at a time or any other views.
//        if(diceRoll == 3)
//        {
//            resultTextView3.text = greet
//        } else {
//            resultTextView3.text = luck
//        }
        //resultTextView.text = diceRoll.toString()  The reference to text when the dice image is not shown this code will show the number that dice rolled
        // Displays a short message about dice being rolled
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        toast.show()
    }

// Just a copy function to show the dice randomly else it will feel like odd and not show the toast during the startup of app else whenever app start a short message occurs.
    private fun rollDice1() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)  // resource id of imageView is assigned to variable diceImage
        //val resultTextView3: TextView = findViewById(R.id.textView3)

        // Updates the Content description of the image
        diceImage.contentDescription = diceRoll.toString()

        when (diceRoll) {
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }

}
// Code For the Dice Logic to give number
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}