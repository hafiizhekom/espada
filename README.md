# Espada - Aplikasi Ekspedisi Sederhana

Espada adalah aplikasi desktop berbasis Java Swing untuk manajemen pengiriman ekspedisi, mencakup fitur pengelolaan pengiriman, kurir, layanan, wilayah, ekspor/impor data, serta visualisasi data dalam bentuk chart.

## Fitur Utama

- **Manajemen Pengiriman**  
  Kelola data pengiriman, barang, verifikasi, dan pencarian pengiriman.  
  Lihat: [`com.espada.gui.Pengiriman`](src/com/espada/gui/Pengiriman.java)

- **Manajemen Kurir**  
  Tambah, edit, hapus, dan impor/ekspor data kurir.  
  Lihat: [`com.espada.gui.Kurir`](src/com/espada/gui/Kurir.java)

- **Manajemen Layanan**  
  Kelola jenis layanan pengiriman.  
  Lihat: [`com.espada.model.qLayanan`](src/com/espada/model/qLayanan.java)

- **Manajemen Wilayah**  
  Data provinsi, kabupaten, kecamatan untuk pengiriman.  
  Lihat:  
  - [`com.espada.gui.wilayah.Provinsi`](src/com/espada/gui/wilayah/Provinsi.java)  
  - [`com.espada.model.qProvinsi`](src/com/espada/model/qProvinsi.java)  
  - [`com.espada.model.qKabupaten`](src/com/espada/model/qKabupaten.java)  
  - [`com.espada.model.qKecamatan`](src/com/espada/model/qKecamatan.java)

- **Manajemen Tarif**  
  Pengaturan tarif pengiriman berdasarkan wilayah dan layanan.  
  Lihat: [`com.espada.gui.Tarif`](src/com/espada/gui/Tarif.java)

- **Ekspor & Impor Data Excel**  
  Ekspor dan impor data pengiriman, kurir, layanan ke/dari Excel.  
  Lihat:  
  - [`com.espada.gui.excel.exportz.Pengiriman`](src/com/espada/gui/excel/exportz/Pengiriman.java)  
  - [`com.espada.gui.excel.importz.Pengiriman`](src/com/espada/gui/excel/importz/Pengiriman.java)  
  - [`com.espada.gui.excel.exportz.Kurir`](src/com/espada/gui/excel/exportz/Kurir.java)  
  - [`com.espada.gui.excel.importz.Kurir`](src/com/espada/gui/excel/importz/Kurir.java)

- **Visualisasi Data (Chart)**  
  Menampilkan statistik pengiriman, layanan, kurir, wilayah dalam bentuk chart (pie/bar/line).  
  Lihat: [`com.espada.Chart`](src/com/espada/Chart.java)

- **Pengaturan Usaha & Administrator**  
  Pengaturan data usaha dan administrator aplikasi.  
  Lihat:  
  - [`com.espada.gui.SetUsaha`](src/com/espada/gui/SetUsaha.java)  
  - [`com.espada.gui.Administrator`](src/com/espada/gui/Administrator.java)

- **Login & Hak Akses**  
  Sistem login dan otorisasi pengguna.  
  Lihat: [`com.espada.gui.Login`](src/com/espada/gui/Login.java)

- **Utilitas**  
  - Hashing password: [`com.espada.Hash`](src/com/espada/Hash.java)
  - Registry Windows: [`com.espada.RegistryKey`](src/com/espada/RegistryKey.java)
  - Koneksi database: [`com.espada.Koneksi`](src/com/espada/Koneksi.java)
  - Tools umum: [`com.espada.Tools`](src/com/espada/Tools.java)

## Cara Menjalankan

1. **Build Project**  
   Gunakan NetBeans atau jalankan perintah berikut di root project:
   ```sh
   ant clean; ant jar
   ```
2. **Jalankan Aplikasi**  
   File utama: [`com.espada.main.Loading`](src/com/espada/main/Loading.java)  
   Atau jalankan file JAR di folder `dist/`.

## Dependensi

- Java 7+
- Library eksternal di folder [lib/](lib/)
- Database MySQL (lihat konfigurasi di [`com.espada.Koneksi`](src/com/espada/Koneksi.java))
