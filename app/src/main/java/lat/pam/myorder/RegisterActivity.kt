package lat.pam.myorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegisterSubmit: Button = findViewById(R.id.btn_register_submit)

        // (Kita tidak melakukan validasi, hanya pindah screen)
        btnRegisterSubmit.setOnClickListener {
            // Pindah ke HomeActivity (Screen 5)
            val intent = Intent(this, HomeActivity::class.java)
            // Membersihkan tumpukan (stack) activity sebelumnya
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}