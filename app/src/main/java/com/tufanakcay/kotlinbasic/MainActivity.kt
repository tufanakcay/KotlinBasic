package com.tufanakcay.kotlinbasic

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {

    lateinit var btnGotoSettings: Button
    lateinit var txtData: EditText
    lateinit var txtViewData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGotoSettings = findViewById(R.id.btnGotoSettings)
        txtData = findViewById(R.id.txtData)
        txtViewData = findViewById(R.id.txtViewData)

        var btnBackColor = btnGotoSettings.backgroundTintList?.defaultColor

        btnGotoSettings.setOnClickListener {
            var data = txtData.text.toString()
            Toast.makeText(this, data, Toast.LENGTH_LONG).show()
        }

        // OnChange
        txtData.addTextChangedListener {
            txtViewData.text = it.toString()
            if ( it.toString() == "test@gmail.com" ) {
                btnGotoSettings.setBackgroundColor(Color.GREEN)
            }else {
                btnGotoSettings.setBackgroundColor(btnBackColor!!)
            }
        }

    }


    /*
    fun btnClick( view:View ) : Unit {
        //view.setBackgroundColor(Color.RED)
        var btn:Button = view as Button
        var title = btn.text
        Log.i("", title.toString())
        var data = txtData.text.toString()
        Toast.makeText(this, "btnClick :" +data, Toast.LENGTH_LONG).show()
    }
     */


}