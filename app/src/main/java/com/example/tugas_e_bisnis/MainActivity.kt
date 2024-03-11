package com.example.tugas_e_bisnis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.example.tugas_e_bisnis.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listimage = intArrayOf(
            R.drawable.kripca,
            R.drawable.kerupuk,
            R.drawable.basreng
        )

        val detail = intArrayOf(
            R.string.Kripca,
            R.string.kerupuk,
            R.string.Basreng
        )
        val Listname = arrayOf("Kripca", "Basreng", "Kerupuk")

        for (i in listimage.indices){
            listData = ListData (
                Listname[i], listimage[i].toString()
            )

            dataArrayList.add(listData)
        }
        listAdapter = ListAdapter(this@MainActivity, dataArrayList)
        binding.listView.adapter = listAdapter
        binding.listView.isClickable = true

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("name", Listname[i])
            intent.putExtra("detail", detail[i])
            intent.putExtra("image", listimage[i])
            startActivity(intent)
        }
    }
}