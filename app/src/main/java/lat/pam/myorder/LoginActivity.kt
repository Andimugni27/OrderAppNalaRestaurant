package lat.pam.myorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLoginSubmit: Button = findViewById(R.id.btn_login_submit)

        // (Kita tidak melakukan validasi, hanya pindah screen)
        btnLoginSubmit.setOnClickListener {
            // Pindah ke HomeActivity (Screen 5)
            val intent = Intent(this, HomeActivity::class.java)
            // Membersihkan tumpukan (stack) activity sebelumnya
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}