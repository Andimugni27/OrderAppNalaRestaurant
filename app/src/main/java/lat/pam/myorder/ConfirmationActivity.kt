package lat.pam.myorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val btnKirimKonfirmasi: Button = findViewById(R.id.btn_kirim_konfirmasi)

        btnKirimKonfirmasi.setOnClickListener {
            // Kembali ke HomeActivity (Screen 5)
            val intent = Intent(this, HomeActivity::class.java)
            // Membersihkan semua activity di atas Home
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish() // Tutup activity konfirmasi
        }
    }
}