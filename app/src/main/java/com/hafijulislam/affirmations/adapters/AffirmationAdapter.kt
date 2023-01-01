package com.hafijulislam.affirmations.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hafijulislam.affirmations.R
import com.hafijulislam.affirmations.models.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class AffirmationAdapter(
    private val context: Context,
    private val affirmationList: List<Affirmation>
) : RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class AffirmationViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView = view.findViewById(R.id.affirmation_title)

        val imageView: ImageView = view.findViewById(R.id.affirmation_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.partial_affirmation_list, parent, false)

        return AffirmationViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {

        val affirmation = affirmationList[position]

        holder.textView.text = context.resources.getString(affirmation.titleResourceId)

        holder.imageView.setImageResource(affirmation.imageResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount(): Int {

        return affirmationList.size
    }
}