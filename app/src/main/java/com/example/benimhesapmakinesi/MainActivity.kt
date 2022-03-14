package com.example.benimhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }

    var operator="*"
    var oldNumber=""
    var newOperator=true
    var powResult:Int=1


    fun btn_numbers(view:View){

        var txt_calculate:TextView=findViewById(R.id.txt_calculate)

        val btn_0:Button=findViewById<Button>(R.id.btn_0)
        val btn_1:Button=findViewById<Button>(R.id.btn_1)
        val btn_2:Button=findViewById<Button>(R.id.btn_2)
        val btn_3:Button=findViewById<Button>(R.id.btn_3)
        val btn_4:Button=findViewById<Button>(R.id.btn_4)
        val btn_5:Button=findViewById<Button>(R.id.btn_5)
        val btn_6:Button=findViewById<Button>(R.id.btn_6)
        val btn_7:Button=findViewById<Button>(R.id.btn_7)
        val btn_8:Button=findViewById<Button>(R.id.btn_8)
        val btn_9:Button=findViewById<Button>(R.id.btn_9)

        if (newOperator){
            txt_calculate.text=""
            powResult=1

        }
        newOperator=false

        var chosen_button=view as Button
        var button_value:String=txt_calculate.text.toString()


        when(chosen_button.id){

            btn_0.id->{
                button_value += "0"
            }
            btn_1.id->{
                button_value += "1"
            }
            btn_2.id->{
                button_value += "2"
            }
            btn_3.id->{
                button_value += "3"
            }
            btn_4.id->{
                button_value += "4"
            }
            btn_5.id->{
                button_value += "5"
            }
            btn_6.id->{
                button_value += "6"
            }
            btn_7.id->{
                button_value += "7"
            }
            btn_8.id->{
                button_value += "8"
            }
            btn_9.id->{
                button_value += "9"
            }


        }

        txt_calculate.setText(button_value)

    }

    fun btn_op(view: View){
        var txt_calculate:TextView=findViewById(R.id.txt_calculate)

        var btn_multiply:Button=findViewById(R.id.btn_multiply)
        var btn_div:Button=findViewById(R.id.btn_div)
        var btn_plus:Button=findViewById(R.id.btn_plus)
        var btn_minus:Button=findViewById(R.id.btn_minus)
        var btn_sqrt:Button=findViewById(R.id.btn_sqrt)
        var btn_pow:Button=findViewById(R.id.btn_pow)
        var btn_percent:Button=findViewById(R.id.btn_percent)
        var btn_negorpos:Button=findViewById(R.id.btn_negorpos)

        var chosen_button2=view as Button


        when(chosen_button2.id){
            btn_multiply.id ->{
                operator="x"
            }
            btn_div.id ->{
                operator="/"
            }
            btn_plus.id ->{
                operator="+"
            }
            btn_minus.id ->{
                operator="-"
            }
            btn_sqrt.id ->{
                operator="**"
            }
            btn_pow.id ->{
                operator="^"
            }
            btn_percent.id ->{
                operator="%"
            }
            btn_negorpos.id ->{
                operator="-/+"
            }


        }

        oldNumber=txt_calculate.text.toString()
        newOperator=true


    }

    fun btn_equal(view: View){
        var txt_calculate:TextView=findViewById(R.id.txt_calculate)

        var newNumber=txt_calculate.text.toString()
        var result:Double?=null
        var i=1;

        when(operator){
            "x" ->{
                result=oldNumber.toDouble()*newNumber.toDouble()
            }
            "/" ->{
                result=oldNumber.toDouble()/newNumber.toDouble()
            }
            "+" ->{
                result=oldNumber.toDouble()+newNumber.toDouble()
            }
            "-" ->{
                result=oldNumber.toDouble()-newNumber.toDouble()
            }
            "**" ->{
                result=oldNumber.toDouble()*oldNumber.toDouble()
            }
            "^" -> {

                for (i in 1..newNumber.toInt()){

                    powResult *= oldNumber.toInt()



                }

                result=powResult.toDouble()


            }
            "%" -> {
                result=oldNumber.toDouble()*(newNumber.toDouble()/100)
            }
            "-/+" -> {

                result=5.2
            }

        }

        txt_calculate.setText(result.toString())
        newOperator=true

    }

    fun btn_clear(view: View){
        var txt_calculate:TextView=findViewById(R.id.txt_calculate)
        txt_calculate.setText("0")
        newOperator=true
    }


















}
