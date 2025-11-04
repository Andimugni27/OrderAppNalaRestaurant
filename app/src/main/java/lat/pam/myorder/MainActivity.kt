package lat.pam.myorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cari tombol berdasarkan ID-nya
        val btnStart: Button = findViewById(R.id.btn_start)

        // Atur apa yang terjadi ketika tombol diklik
        btnStart.setOnClickListener {
            // Buat niat (Intent) untuk pindah dari
            // MainActivity (Screen 1) ke AuthOptionActivity (Screen 2)
            val intent = Intent(this, AuthOptionActivity::class.java)
            startActivity(intent)
        }
    }
}