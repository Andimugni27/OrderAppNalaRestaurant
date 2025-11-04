package lat.pam.myorder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvFood = findViewById(R.id.rv_food)
        rvFood.layoutManager = LinearLayoutManager(this)

        // Inisialisasi daftar makanan
        foodList = ArrayList()
        // Panggil method untuk mengisi data makanan (10+ item)
        addFoodData()

        // Setup Adapter
        foodAdapter = FoodAdapter(this, foodList)
        rvFood.adapter = foodAdapter

        // (BottomNavigationView tidak kita beri aksi sesuai wireframe)
    }

    private fun addFoodData() {
        foodList.add(Food("Nasi Goreng", "Nasi goreng spesial dengan telur", "Rp 25.000",
            "https://loremflickr.com/320/240/nasi_goreng,food"))

        foodList.add(Food("Sate Ayam", "10 tusuk sate ayam madura", "Rp 30.000",
            "https://loremflickr.com/320/240/sate_ayam,food"))

        foodList.add(Food("Rendang", "Daging rendang padang asli", "Rp 45.000",
            "https://loremflickr.com/320/240/rendang,food"))

        foodList.add(Food("Bakso", "Bakso urat komplit", "Rp 20.000",
            "https://loremflickr.com/320/240/bakso,food"))

        foodList.add(Food("Gado-gado", "Sayuran segar dengan bumbu kacang", "Rp 18.000",
            "https://loremflickr.com/320/240/gado_gado,food"))

        foodList.add(Food("Soto Ayam", "Soto ayam lamongan", "Rp 22.000",
            "https://loremflickr.com/320/240/soto_ayam,food"))

        foodList.add(Food("Mie Ayam", "Mie ayam jamur", "Rp 17.000",
            "https://awsimages.detik.net.id/community/media/visual/2022/10/12/resep-mie-ayam-kecap_43.jpeg?w=1200"))

        foodList.add(Food("Ikan Bakar", "Ikan nila bakar bumbu jimbaran", "Rp 55.000",
            "https://awsimages.detik.net.id/community/media/visual/2022/04/20/resep-gurame-bakar-bumbu-kecap-cabe_43.jpeg?w=650"))

        foodList.add(Food("Ayam Geprek", "Ayam geprek sambal bawang level 5", "Rp 23.000",
            "https://i.pinimg.com/736x/a6/fb/29/a6fb29e53206b849ae18c5e5db939712.jpg"))

        foodList.add(Food("Martabak", "Martabak manis coklat keju", "Rp 50.000",
            "https://asset.kompas.com/crops/usYtQmlcG_5iwGdeft74_TDh7wc=/0x0:1000x667/1200x800/data/photo/2020/08/22/5f40bfe4e8c16.jpg"))
    }
}