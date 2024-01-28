import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lists.Hero
import com.example.lists.R

class MyRecycleViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(R.id.title)
    val imageView: ImageView = itemView.findViewById(R.id.imageView)
}

class MyRecyclerViewAdapter(var heroes: MutableList<Hero> = mutableListOf()) :
    RecyclerView.Adapter<MyRecycleViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecycleViewViewHolder {
        val listItemViewViewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_layout, parent, false)
        return MyRecycleViewViewHolder(listItemViewViewHolder)
    }

    override fun getItemCount(): Int = heroes.size

    override fun onBindViewHolder(holder: MyRecycleViewViewHolder, position: Int) {
        val hero = heroes[position]

        // Load image using Glide or any other image loading library
        Glide.with(holder.itemView)
            .load(hero.images.sm) // Use the desired size (xs, sm, md, lg)
            .into(holder.imageView)

        // Concatenate textual information and set it to the title TextView
        val titleText = "Name: ${hero.name}\n" +
                "Slug: ${hero.slug}\n" +
                "Powerstats: ${hero.powerstats}\n" +
                "Appearance: ${hero.appearance}\n" +
                "Biography: ${hero.biography}\n" +
                "Work: ${hero.work}\n" +
                "Connections: ${hero.connections}\n"

        holder.title.text = titleText
    }
}
