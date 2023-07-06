package com.example.fibonaccisequence

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FibonacciAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.RecyclerView)
        adapter = FibonacciAdapter(getFibonacciNumbers())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        getFibonacciNumbers()
    }
    private fun getFibonacciNumbers(): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)
        for (i in 2 until 100) {
            val nextNumber = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2]
            fibonacciNumbers.add(nextNumber)
        }
        return fibonacciNumbers
    }
}