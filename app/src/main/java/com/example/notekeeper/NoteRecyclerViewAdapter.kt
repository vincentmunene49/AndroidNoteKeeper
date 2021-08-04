package com.example.notekeeper

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteRecyclerViewAdapter(private  val context: Context,private val notes:List<NoteInfo>) :
    RecyclerView.Adapter<NoteRecyclerViewAdapter.viewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemView = layoutInflater.inflate(R.layout.item_note_list, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val note = notes[position]
        holder.textCourse?.text = note.course?.title
        holder.textTitle?.text = note?.title
        holder.notePosition = position



    }

    override fun getItemCount() = notes.size

  inner  class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textCourse = itemView.findViewById<TextView>(R.id.textCourse)
        val textTitle = itemView.findViewById<TextView>(R.id.textTitle)
        var notePosition = 0
        init {
            itemView.setOnClickListener{
                var intent = Intent(context,MainActivity::class.java)
                intent.putExtra(EXTRA_NOTE_POSITION,notePosition)
                context.startActivity(intent)
            }
        }

    }


}