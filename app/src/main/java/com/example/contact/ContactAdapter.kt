package com.example.contact

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contact.databinding.ContactListItemBinding

class ContactAdapter(var ContactList:List<ContactData>) : RecyclerView.Adapter<ContactViewHolder>(){
    lateinit var contactListItemBinding: ContactListItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=
            ContactListItemBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact =ContactList[position]
        var  binding=holder.binding
        binding.ivavatar.tag=currentContact.image
        binding.tvNames.text=currentContact.names
        binding.tvPhoneNumber.text=currentContact.phoneNumbers
        binding.tvEmail.text =currentContact.emails
    }
    override fun getItemCount(): Int {
        return ContactList.size
    }
}
class ContactViewHolder( var binding:ContactListItemBinding):ViewHolder(binding.root)
