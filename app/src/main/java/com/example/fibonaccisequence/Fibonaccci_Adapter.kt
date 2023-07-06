package com.example.fibonaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fibonaccisequence.R

class FibonacciAdapter(private val numbers: List<Int>) :
    RecyclerView.Adapter<FibonacciAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacciadapter, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val number = numbers[position]
        holder.numberTextView.text = number.toString()
    }
    override fun getItemCount(): Int {
        return numbers.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberTextView: TextView = itemView.findViewById(R.id.RecyclerView)
    }
}
