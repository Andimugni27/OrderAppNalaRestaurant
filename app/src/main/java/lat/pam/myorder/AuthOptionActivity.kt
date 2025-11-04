package lat.pam.myorder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AuthOptionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth_option)

        val btnRegister: Button = findViewById(R.id.btn_register)
        val btnLogin: Button = findViewById(R.id.btn_login)

        btnRegister.setOnClickListener {
            // Pindah ke RegisterActivity (Screen 4)
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            // Pindah ke LoginActivity (Screen 3)
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}