package com.example.hackaton

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AksiyaAdapter(val listOfItems: List<Aksiya>) : RecyclerView.Adapter<AksiyaAdapter.ViewHolder>() {
//    lateinit var listener: OnClickItemListener

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.im)
        val title = itemView.findViewById<TextView>(R.id.tv_name)
        val foiz = itemView.findViewById<TextView>(R.id.tv_foiz)
        val narx = itemView.findViewById<TextView>(R.id.tv_narx)



    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_re, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = listOfItems[position]

        holder.image.setImageResource(items.rasm)
        holder.title.text = items.title
        holder.foiz.text = "Aksiya qiymati: ${items.foiz}"
        holder.narx.text = "Aksiya narxi: ${items.narx}"
    }

    override fun getItemCount(): Int = listOfItems.size

//    fun onClickItems(listener: OnClickItemListener) {
//        this.listener = listener
//    }
}
