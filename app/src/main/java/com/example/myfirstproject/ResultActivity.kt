package com.example.myfirstproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val result = intent.getFloatExtra("extra", 0.1f )
        val tvresult = findViewById<TextView>(R.id.recactivity)
        val valor = findViewById<TextView>(R.id.text_clasificacao)

        tvresult.text= result.toString()

        findViewById<TextView>(R.id.text_clasificacao)


        var classification = ""

        if (result >= 18.5f) {
            if
                 (result in 18.5f..24.9f){
                classification = "NORMAL"} else if (result in 24.9f..29.9f){
                classification = "OVERWEIGHT" } else if (result in 30f..39.9f){
                classification = "OBESE CLASS |" } else if (result> 40f){
                classification = "OBESE CLASS ||" }
        } else {
            classification ="THIN" }

        valor.text = getString(R.string.message_Classificacao,classification )
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
