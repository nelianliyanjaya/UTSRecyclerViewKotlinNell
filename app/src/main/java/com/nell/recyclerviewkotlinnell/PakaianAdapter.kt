package com.nell.recyclerviewkotlinnell

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PakaianAdapter(private val context: Context, private val pakaian: List<Pakaian>, val listener: (Pakaian) -> Unit)
    : RecyclerView.Adapter<PakaianAdapter.PakaianViewHolder> (){

    class PakaianViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgPakaian = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePakaian = view.findViewById<TextView>(R.id.tv_item_name)
        val descPakaian = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(pakaian: Pakaian, listener: (Pakaian) -> Unit) {
            imgPakaian.setImageResource(pakaian.imgPakaian)
            namePakaian.text = pakaian.namePakaian
            descPakaian.text = pakaian.descPakaian

            itemView.setOnClickListener {
                listener(pakaian)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PakaianViewHolder {
        return PakaianViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_pakaian, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PakaianViewHolder, position: Int) {
        holder.bindView(pakaian[position], listener)
    }

    override fun getItemCount(): Int = pakaian.size
    }