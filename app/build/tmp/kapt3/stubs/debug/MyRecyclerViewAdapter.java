
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.lists.Hero;
import com.example.lists.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"LMyRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LMyRecycleViewViewHolder;", "heroes", "", "Lcom/example/lists/Hero;", "(Ljava/util/List;)V", "getHeroes", "()Ljava/util/List;", "setHeroes", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class MyRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<MyRecycleViewViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.lists.Hero> heroes;
    
    public MyRecyclerViewAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.lists.Hero> heroes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.lists.Hero> getHeroes() {
        return null;
    }
    
    public final void setHeroes(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.lists.Hero> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public MyRecycleViewViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    MyRecycleViewViewHolder holder, int position) {
    }
    
    public MyRecyclerViewAdapter() {
        super();
    }
}