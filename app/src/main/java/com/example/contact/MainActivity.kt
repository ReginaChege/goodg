package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }


override fun onResume() {
    super.onResume()
    displayContact()
}
    fun displayContact(){
        val contact1=ContactData("Angeth","070987450","angeth@gmail.com","")
        val contact3=ContactData("Wanifrida","078765340","wanifrida@gmail.com"," ")
        val contact4=ContactData("Herjok","079874750","herjok@gmail.com"," ")
        val contact5=ContactData("Joyce","079235380","joyce@gmail.com","")


       val contactName=listOf(contact1,contact3,contact4,contact5)
       val contactAdapter=ContactAdapter(contactName)
        binding.rvcontact.layoutManager=LinearLayoutManager(this)
        binding.rvcontact.adapter=contactAdapter
    }
}