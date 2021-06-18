package com.devgd.stirringmindstest_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Are you sure!")
        builder.setMessage("You want to close the App, some important tasks are running")


        builder.setPositiveButton(R.string.yes) { dialog, which ->
            super.onBackPressed()
        }

        builder.setNegativeButton(R.string.no) { dialog, which ->
        }
        builder.show()
    }

}