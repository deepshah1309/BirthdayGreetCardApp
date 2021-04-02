package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birthdayGreetingActivity : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name=intent.getStringExtra(NAME_EXTRA)
        val greet=this.findViewById<TextView>(R.id.BirthdayGreetings);
        greet.text="Happy Birthday\n$name!"

    }
}