package com.example.hackaton

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(val listOfItems: List<Viloyat>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
//    lateinit var listener: OnClickItemListener

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.image)
        val title = itemView.findViewById<TextView>(R.id.tv_title)



//        init {
//            itemView.setOnClickListener {
//                val position = adapterPosition
//                if (position != RecyclerView.NO_POSITION) {
////                    listener.onClickItems(position)
//                }
//            }
//            next.setOnClickListener {
//                val position = adapterPosition
//                if (position != RecyclerView.NO_POSITION) {
//                    next.visibility = View.GONE
//                    check.visibility = View.VISIBLE
//                    itemView.rell.visibility = View.GONE
//                    itemView.rel1l.visibility = View.VISIBLE
//
//                    itemView.lavozim_et.setText(lavozim.text.toString())
//                    itemView.koef_et.setText(koeff.text.toString())
//                }
//            }
//            check.setOnClickListener {
//                val position = adapterPosition
//                if (position != RecyclerView.NO_POSITION) {
//                    next.visibility = View.VISIBLE
//                    check.visibility = View.GONE
//                    itemView.rell.visibility = View.VISIBLE
//                    itemView.rel1l.visibility = View.GONE
//
//                    lavozim.text = itemView.lavozim_et.text.toString()
//                    koeff.text = itemView.koef_et.text.toString()
//
//                }
//            }
//        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viloyat_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = listOfItems[position]

        holder.image.setImageResource(items.image)
        holder.title.text = items.title
    }

    override fun getItemCount(): Int = listOfItems.size

//    fun onClickItems(listener: OnClickItemListener) {
//        this.listener = listener
//    }
}
