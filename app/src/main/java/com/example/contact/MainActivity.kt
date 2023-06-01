package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


override fun onResume() {
    super.onResume()
    displayContact()
}
    fun displayContact(){
        val contact1=ContactData("Regina","070987450","regina.com","")
        val contact3=ContactData("Eunice","078765340","eunice.com"," ")
        val contact4=ContactData("Ann","079874750","ann.com"," ")
        val contact5=ContactData("Grace","079235380","grace.com","")
        val contact2=ContactData("Philiph","070987450","philip.com","")
        val contact6=ContactData("Ryan","078765340","ryan.com"," ")
        val contact7=ContactData("Robert","079874750","robert.com"," ")

val contactName= mutableListOf<ContactData>(contact1,contact3,contact4,contact5)
//       val contactName=listOf(contact1,contact3,contact4,contact5)
       val contactAdapter=ContactAdapter(contactName)
        binding.rvcontact.layoutManager=LinearLayoutManager(this)
        binding.rvcontact.adapter=contactAdapter
    }
}