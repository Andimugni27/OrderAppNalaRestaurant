package lat.pam.myorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ShippingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shipping)

        val btnOrderSekarang: Button = findViewById(R.id.btn_order_sekarang)

        btnOrderSekarang.setOnClickListener {
            // Pindah ke ConfirmationActivity (Screen 8)
            val intent = Intent(this, ConfirmationActivity::class.java)
            startActivity(intent)
        }
    }
}