package com.example.helloworldfromshiyu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//this kotlin file is where we are going to be handling
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //show the layout file: activity_main
        setContentView(R.layout.activity_main)
   // display customized to show 'Hello from [name]
        //user can tap a button to change color
        // 1. add a button to the layout
        findViewById<Button>(R.id.button).setOnClickListener{
            //handle button tap
            Log.i("Shiyu","Tap to change text color")
            // to change color by click on the tab, first we need to get a reference to the text view
            // then set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
        //get a reference to button
        // 2. set up logic to know when the user is tap on the button
        // 3. change color when the user tap on the button
        /* parent is to describe the background in general
end stand for the right and start is basically the right */
    }
}