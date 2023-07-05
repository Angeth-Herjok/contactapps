package com.example.contactsapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val name1=TweetData("Angeth","076564310","angethbecky@gmail.com")
        val name2=TweetData("John", "0788564370","johnmwangi@gmail.com")
        val name3=TweetData("Wani","0702364550","waniigga@gmail.com")
        val name4=TweetData("Herjok","0715364750","herjokmach@gmail.com")
        val name5=TweetData("Joy","0795365380","joymoses@gmail.com")
        val multipleContents= listOf(name1,name2,name3,name4,name5)
        val tweetAdapter=TweetData(multipleContents)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=contactAdapter
    }
}