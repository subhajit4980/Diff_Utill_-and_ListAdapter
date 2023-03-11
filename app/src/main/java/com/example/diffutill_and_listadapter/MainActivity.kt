package com.example.diffutill_and_listadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = StudentAdapter()
        val arr = arrayListOf(
            Data("subahjit", "computer", "34"),
            Data("surajt", "abc", "43"),
            Data("avijit", "xyz", "78"),
            Data("ram", "computer", "32"),
        )
        adapter.submitList(arr)
        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = adapter

    }
}