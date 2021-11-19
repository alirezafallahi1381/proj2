package com.example.proj2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num_1 = findViewById<EditText>(R.id.ac_main_edt_num_1)
        var num_2 = findViewById<EditText>(R.id.ac_main_edt_num_2)
        var tv_result = findViewById<TextView>(R.id.ac_main_tv_result)


        val sp_1 = arrayListOf("+","-","/","*")
        val sp_2= findViewById<Spinner>(R.id.ac_main_sp_calcuator)
        val sp_adaptor = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,sp_1)
        sp_2.adapter = sp_adaptor

        sp_2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (sp_2.selectedItemPosition == 0) {
                    var n1: Int = num_1.text.toString().toInt()
                    var n2: Int = num_2.text.toString().toInt()
                    var result = n1 + n2
                    tv_result.text = result.toString()
                } else if (sp_2.selectedItemPosition == 1) {
                    var n1: Int = num_1.text.toString().toInt()
                    var n2: Int = num_2.text.toString().toInt()
                    var result = n1 - n2
                    tv_result.text = result.toString()
                } else if (sp_2.selectedItemPosition == 2) {
                    var n1: Int = num_1.text.toString().toInt()
                    var n2: Int = num_2.text.toString().toInt()
                    var result = n1 / n2
                    tv_result.text = result.toString()
                } else if (sp_2.selectedItemPosition == 3) {
                    var n1: Int = num_1.text.toString().toInt()
                    var n2: Int = num_2.text.toString().toInt()
                    var result = n1 * n2
                    tv_result.text = result.toString()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

}