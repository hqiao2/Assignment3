package com.example.assignment3
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSendData: Button = findViewById(R.id.buttonSendData)
        val editTextData: EditText = findViewById(R.id.editTextData)

        buttonSendData.setOnClickListener {
            val data = editTextData.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("EXTRA_DATA", data)
            startActivity(intent)
        }
    }
}

