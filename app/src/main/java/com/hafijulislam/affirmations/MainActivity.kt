package com.hafijulislam.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hafijulislam.affirmations.adapters.AffirmationAdapter
import com.hafijulislam.affirmations.data.Datasource
import com.hafijulislam.affirmations.models.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val affirmations: List<Affirmation> = Datasource().loadAffirmations()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.adapter = AffirmationAdapter(this, affirmations)

        recyclerView.setHasFixedSize(true)
    }
}