package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var birthdaycard:Button = this.findViewById<Button>(R.id.createBirthday);



    }

    fun createBirthdayCard(view: View) {
        val name=this.findViewById<EditText>(R.id.nameInput).editableText.toString()

        var intent=Intent(this,birthdayGreetingActivity::class.java)
        intent.putExtra(birthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)

    }


}