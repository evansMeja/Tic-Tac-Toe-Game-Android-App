package com.example.tictactoegame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buClick(view : View){
        val buSelected = view as Button
        var cellID = 0
        when(buSelected.id){
            R.id.bu1 -> cellID = 1
            R.id.bu2 -> cellID = 2
            R.id.bu3 -> cellID = 3
            R.id.bu4 -> cellID = 4
            R.id.bu5 -> cellID = 5
            R.id.bu6 -> cellID = 6
            R.id.bu7 -> cellID = 7
            R.id.bu8 -> cellID = 8
            R.id.bu9 -> cellID = 9
        }
          Toast.makeText(this,"Cell Id: "+cellID,Toast.LENGTH_SHORT).show()
           playGame(cellID,buSelected)
    }
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activeplayer = 1

    private fun playGame(cellID: Int, buSelected: Button) {
        if(activeplayer == 1){
            buSelected.text="x"
            buSelected.setBackgroundColor(Color.parseColor("#009193"))
            player1.add(cellID)
            activeplayer=2
        }else{
            buSelected.text="O"
            buSelected.setBackgroundColor(Color.parseColor("#FF9300"))
            player2.add(cellID)
            activeplayer=1
        }
        buSelected.isEnabled=false
    }
}
