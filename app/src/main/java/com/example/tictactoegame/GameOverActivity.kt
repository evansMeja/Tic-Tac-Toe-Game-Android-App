package com.example.tictactoegame

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gameover.*

class GameOverActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gameover)
        val bundle : Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
        txtviewUserMsg.text=msg

        btnReplay.setOnClickListener {
            val intent= Intent(this, TicTacToeGameActivity::class.java)
            startActivity(intent)
        }
    }
}