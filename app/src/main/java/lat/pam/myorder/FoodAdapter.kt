package lat.pam.myorder

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class FoodAdapter(
    private val context: Context,
    private val foodList: ArrayList<Food>
) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    // 1. Membuat ViewHolder (Tidak ada perubahan di sini)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    // 2. Menghubungkan data ke tampilan (ADA PERUBAHAN DI SINI)
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        // Ambil data makanan
        val food = foodList[position]

        // Set data teks
        holder.tvFoodName.text = food.name
        holder.tvFoodDescription.text = food.description
        holder.tvFoodPrice.text = food.price

        // ===== INI KODE BARU UNTUK MEMUAT GAMBAR =====
        holder.ivFoodImage.load(food.imageUrl) {
            crossfade(true) // Animasi fade-in
            placeholder(android.R.drawable.ic_menu_gallery) // Gambar saat loading
            error(android.R.drawable.ic_menu_report_image) // Gambar jika link error
        }
        // ===============================================

        // Set OnClickListener (Tidak ada perubahan)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, OrderDetailActivity::class.java)
            intent.putExtra("FOOD_NAME", food.name)
            context.startActivity(intent)
        }
    }

    // 3. Memberi tahu jumlah item (Tidak ada perubahan)
    override fun getItemCount(): Int {
        return foodList.size
    }

    // Class ViewHolder (ADA PERUBAHAN DI SINI)
    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFoodName: TextView = itemView.findViewById(R.id.tv_food_name)
        val tvFoodDescription: TextView = itemView.findViewById(R.id.tv_food_description)
        val tvFoodPrice: TextView = itemView.findViewById(R.id.tv_food_price)

        // <-- PENTING: Baris ini sekarang aktif (tidak ada komentar)
        val ivFoodImage: ImageView = itemView.findViewById(R.id.iv_food_image)
    }
}