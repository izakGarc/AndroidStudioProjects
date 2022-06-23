package mx.com.geelkyworld.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var  timesClicked = 0

        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val txtTextView =  findViewById<TextView>(R.id.txtVTexto)
        btnClickMe.setOnClickListener {
            btnClickMe.text ="Contando Personas"
            timesClicked +=1
            txtTextView.text =  timesClicked.toString()
            Toast.makeText(this,"Hey Dan the Man",Toast.LENGTH_LONG).show()
        }


    }
}