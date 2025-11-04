package lat.pam.myorder

// Kita gunakan data class untuk menyimpan data secara efisien
data class Food(
    val name: String,
    val description: String,
    val price: String,
    val imageUrl: String
    // Anda bisa tambahkan val imageResourceId: Int jika punya gambar
)