package com.example.myfirstproject


import android.content.Intent
import android.os.Bundle
import android.sax.StartElementListener
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao: Button = findViewById(R.id.botao)
        val peso: EditText = findViewById(R.id.peso)
        val  hellowork: TextView = findViewById(R.id.buscatext)
        val altura: EditText = findViewById(R.id.altura)
        val recuperar: String = peso.text.toString()
        val tallrec: String = altura.text.toString()



         botao.setOnClickListener {

             val alturaStri = altura.text.toString()
             val pesoStri = peso.text.toString()

             if (pesoStri.isNotEmpty()&& alturaStri.isNotEmpty()){

             val pesoFinal: Float = pesoStri.toFloat()
             val altura: Float = alturaStri.toFloat()


             val alturaFinal: Float = altura * altura
             val result = pesoFinal / alturaFinal

            hellowork.text=result.toString()

             val intent = Intent(this, ResultActivity::class.java)
                 .apply {
                     putExtra("extra", result)

                 }
             startActivity(intent)
              }


              else {

             Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show() }



        }


    }
}


