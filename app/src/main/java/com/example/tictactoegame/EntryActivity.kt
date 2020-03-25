package com.example.tictactoegame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_entry.*

class EntryActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
        btnStartGame.setOnClickListener {
            val intent= Intent(this, TicTacToeGameActivity::class.java)
            startActivity(intent)
        }
    }

}