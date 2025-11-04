Order app Nala restaurant
Sebuah aplikasi Android sederhana untuk simulasi pemesanan makanan. Aplikasi ini dibuat menggunakan Kotlin dan Android Views (XML), mencakup alur 8 layar mulai dari autentikasi hingga konfirmasi pesanan.

🧑‍💻 Pembuat
Nama: Andi M. Mugni P.

NIM: 1237050041

Universitas: UIN Sunan Gunung Djati Bandung

📝 Deskripsi Proyek
Order app Nala restaurant adalah aplikasi prototipe yang dikembangkan untuk platform Android. Aplikasi ini mensimulasikan alur pemesanan makanan lengkap, mulai dari pendaftaran pengguna, pemilihan menu, hingga konfirmasi pengiriman.

Aplikasi ini dibuat sebagai latihan untuk memahami dasar-dasar pengembangan Android, termasuk:

Navigasi antar-Activity menggunakan Intent.

Menampilkan daftar data kompleks dengan RecyclerView.

Menyimpan data sesi sederhana (username) menggunakan SharedPreferences.

Memuat gambar dari internet menggunakan library Coil.

✨ Fitur Utama
Autentikasi Pengguna: Alur untuk Login dan Register.

Personalisasi: Menyimpan nama pengguna saat login/register dan menampilkannya secara dinamis di beberapa layar (Contoh: "Halo [username],").

Tampilan Menu: Menampilkan daftar 10+ menu makanan dalam RecyclerView yang interaktif.

Pemuatan Gambar Dinamis: Memuat gambar menu dari URL internet menggunakan library Coil.

Alur Pemesanan Lengkap: Simulasi alur 8-layar yang saling terhubung untuk pengalaman pemesanan yang lengkap.

📱 Alur Aplikasi (8 Screen)
Aplikasi ini terdiri dari 8 layar yang saling terhubung:

Splash Screen: Tampilan pembuka aplikasi.

Opsi Autentikasi: Pilihan untuk Login atau Register.

Halaman Login: Form untuk masuk.

Halaman Register: Form untuk mendaftar.

Halaman Utama (Menu): Menampilkan daftar makanan (menggunakan RecyclerView).

Detail Pesanan: Menampilkan item yang dipilih (disimulasikan).

Alamat Pengiriman: Form untuk mengisi alamat.

Halaman Konfirmasi: Pesan "Terima kasih" setelah memesan.

Alur: Screen 1 -> Screen 2 -> Screen 3 / 4 -> Screen 5 -> Screen 6 -> Screen 7 -> Screen 8 -> (Kembali ke Screen 5).

🛠️ Teknologi yang Digunakan
Bahasa: Kotlin

Arsitektur UI: Android Views (XML Layouts)

Komponen Utama:

Activity

RecyclerView & CardView

BottomNavigationView (statis, sebagai bagian dari UI)

Pemuatan Gambar: Coil (untuk memuat gambar dari URL secara asinkron).

Penyimpanan Lokal: SharedPreferences (untuk menyimpan data username).

Navigasi: Intent

Build Tool: Gradle

🚀 Cara Menjalankan Proyek
Clone repositori ini.

Buka proyek menggunakan Android Studio (disarankan versi terbaru).

Tunggu hingga proses Sync Gradle selesai (jika ada error unresolved reference: coil, pastikan build.gradle.kts (Module :app) sudah di-sync).

Pastikan Android SDK terinstal dan terkonfigurasi.

Jalankan aplikasi pada Emulator atau perangkat Android fisik.

Penting: Pastikan perangkat/emulator memiliki koneksi internet agar gambar menu dapat dimuat.
