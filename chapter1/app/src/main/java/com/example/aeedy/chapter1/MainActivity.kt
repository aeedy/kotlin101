package com.example.aeedy.chapter1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)

        //method 1
        //btnClickMe.setOnClickListener {
            //implement code onclick
        //}

        //method 2
        val btn1  = findViewById<Button>(R.id.btnClickMe)
        val ethow = findViewById<EditText>(R.id.txtshow)

        btn1.setOnClickListener {
           // Toast.makeText(this@MainActivity,"นี่คือฉัน",Toast.LENGTH_SHORT).show()
           // ethow.setText("This is text")


//            val intent = Intent(this,SecondActivity::class.java)
//            intent.putExtra("position_code","MGE001")
//            intent.putExtra("position_name","Manager")
//
//            startActivity(intent)


            //call function integer
            val call_age = map_status(10)
            //Toast.makeText(this@MainActivity,call_age,Toast.LENGTH_SHORT).show()

            //call function string
            var xyz = 100
            val call_string = map_status("A")

            //Toast.makeText(this@MainActivity,call_string,Toast.LENGTH_SHORT).show()
            //println("====>>>> "+ call_string + " ==> xyz " + xyz.toString())

            var msg = "====>>>> "+ call_string + " ==> xyz " + xyz.toString()
            Log.d("my_app",msg)
        }


        //practice array
        val btn2  = findViewById<Button>(R.id.btnClickArray)
        btn2.setOnClickListener {
            val numbers = arrayOf(1, 2, 3, 4, 5)
//            numbers.forEach { e ->
//                Log.d("array",e.toString())
//            }

            val Alphabets  = ArrayList<Char>()
            for (i in 65..90) {
                var tmp:Char = i.toChar()
                Alphabets.add(tmp)
            }

            Log.d("List"," ========>>> <<< ========")
            Alphabets.forEach {
                e ->  Log.d("List",e.toString())
            }


        }

        //practice hash map
        val btn3  = findViewById<Button>(R.id.btnClickHashMap)
        btn3.setOnClickListener {
            val hashmap = HashMap<String,Int>()
            hashmap.put("adithep",28)
            hashmap.put("arm",35)
            hashmap.put("note",22)
            hashmap.put("golf",27)

            hashmap.forEach({
                e ->  Log.d("Hashmap","key==>"+e.key + " value=>"+e.value)
            })

        }



    } //end function onCreate


    fun map_status()
    {

    }

    fun map_status(name: String) : String {
        var ret:String? = null
        ret = when(name){
            "A" -> "AAAA"
            "B" -> "BBBB"
            "C" -> "CCCC"
            else  -> "ไม่ระบุ"
        }
        return ret
    }

    fun map_status(age: Int) : String{

//       var ret = when(age){
//            10 -> "AAAA"
//            20 -> "BBBB"
//            30 -> "CCCC"
//            else  -> "ไม่ระบุ"
//        }
//        return ret

//        if(age < 1) {
//            return "ไม่มีอายุ"
//        }
//        else if(age > 0 &&  age <= 10) {
//            return "เด็กน้อย"
//        }
//        else {
//            return  "แก่มาก"
//        }

        var ret: String? = null
        if(age < 1) {
            ret = "ไม่มีอายุ"
        }
        else if(age > 0 &&  age <= 10) {
            ret = "เด็กน้อย"
        }
        else {
            ret = "แก่มาก"
        }

        return ret
    }

    fun map_status(checkVal: Boolean) {

    }

}





