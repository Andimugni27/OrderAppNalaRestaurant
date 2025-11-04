package lat.pam.myorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OrderDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_detail)

        val tvFoodName: TextView = findViewById(R.id.tv_food_name)
        val btnKirim: Button = findViewById(R.id.btn_kirim)

        // Mengambil data yang dikirim dari FoodAdapter
        val foodName = intent.getStringExtra("FOOD_NAME")
        if (foodName != null) {
            tvFoodName.text = foodName
        }

        btnKirim.setOnClickListener {
            // Pindah ke ShippingActivity (Screen 7)
            val intent = Intent(this, ShippingActivity::class.java)
            startActivity(intent)
        }
    }
}