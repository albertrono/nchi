package com.example.nchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onclicked(view: View){
        if (box_ke.isChecked)txt_result.text="Kenya; Yes English is among the first languages in Kenya"
        if (box_rd.isChecked)txt_result.text="Rwanda; Yes we speak English but we prefer Rwandese"
        if (box_tz.isChecked)txt_result.text="Tanzania; Yes English is among the f*cking languages in Tanzania"

    }
    fun onselect(view: View){
        if (rad_btn_yes.isChecked)txt_result1.text="indeed am a developer"
        if (rad_btn_no.isChecked)txt_result1.text="indeed am not a developer"
    }
}