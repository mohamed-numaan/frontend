package com.example.demo

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    fun OnBackPressed(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("")
        builder.setMessage("Exit?")
        builder.setPositiveButton("OK",{ dialogInterface: DialogInterface, i: Int -> finish()})
        builder.setNegativeButton("CANCEL",{ dialogInterface: DialogInterface, i: Int -> })
        builder.show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick1(view: View){
        setContentView(R.layout.activity3)
        val name:EditText = findViewById(R.id.editTextTextPersonName2)
        val password: EditText = findViewById(R.id.editTextTextPersonName)
        val DEP :EditText = findViewById(R.id.editTextTextPersonName6)
    }
    fun buttonClick(view: View){
        setContentView(R.layout.activity2)
        val regno: EditText =findViewById(R.id.editTextTextPersonName3)
        val DOB: EditText = findViewById(R.id.editTextTextPersonName4)
        val DEP: EditText = findViewById(R.id.editTextTextPersonName5)

    }
}