package com.example.tugas_e_bisnis

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.tugas_e_bisnis.R

class ListAdapter(context: Context, dataArrayList: ArrayList<ListData?>?):
ArrayAdapter<ListData?>(context, R.layout.list_item, dataArrayList!!){

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        var view = view
        val listData = getItem(position)

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        val listimage = view!!.findViewById<ImageView>(R.id.listimage)
        val ListName = view!!.findViewById<TextView>(R.id.Listname)

        listimage.setImageResource (listData!!.image)
        ListName.text = listData.name

        return view
    }
}

private fun ImageView.setImageResource(image: String) {
    TODO("Not yet implemented")
}
