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
        Glide.with(holder.itemView)
            .load(hero.images.sm)
            .into(holder.imageView)
        val titleText = "Name: ${hero.name}\n"
        holder.title.text = titleText
    }
}
