# TP4DPBO2025C2

/*Saya Fahmi Yusuf Fadhilah dengan NIM 2304826 mengerjakan
 soal Tugas Praktikum 4 dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

# Aplikasi Manajemen Data Mahasiswa

Aplikasi ini adalah sebuah program Java Swing sederhana untuk mengelola data mahasiswa. Aplikasi ini memungkinkan pengguna untuk menambahkan, mengupdate, dan menghapus data mahasiswa, termasuk informasi seperti NIM, nama, jenis kelamin, dan status sebagai asisten praktikum (asprak).

## Fitur

- **Tambah Data**: Menambahkan data mahasiswa baru ke dalam sistem.
- **Update Data**: Memperbarui data mahasiswa yang sudah ada.
- **Hapus Data**: Menghapus data mahasiswa dari sistem.
- **Tampilan Tabel**: Menampilkan data mahasiswa dalam bentuk tabel.
- **Form Input**: Formulir untuk memasukkan atau mengedit data mahasiswa.

## Struktur Kode

### Kelas `Mahasiswa`

Kelas ini merepresentasikan entitas mahasiswa dengan atribut-atribut berikut:

- `nim`: Nomor Induk Mahasiswa.
- `nama`: Nama lengkap mahasiswa.
- `jenisKelamin`: Jenis kelamin mahasiswa (Laki-laki atau Perempuan).
- `asprak`: Status mahasiswa sebagai asisten praktikum (Ya atau Tidak).

### Kelas `Menu`

Kelas ini adalah kelas utama yang mengatur tampilan dan logika aplikasi. Berikut adalah komponen utama dari kelas ini:

- **Komponen UI**:
  - `mainPanel`: Panel utama yang menampung semua komponen UI.
  - `nimField`, `namaField`: Text field untuk memasukkan NIM dan nama.
  - `jenisKelaminComboBox`, `asprakComboBox`: Combo box untuk memilih jenis kelamin dan status asprak.
  - `mahasiswaTable`: Tabel untuk menampilkan data mahasiswa.
  - `addUpdateButton`, `cancelButton`, `deleteButton`: Tombol untuk menambah/memperbarui, membatalkan, dan menghapus data.

- **Metode Utama**:
  - `setTable()`: Mengatur model tabel dan mengisi tabel dengan data dari `listMahasiswa`.
  - `insertData()`: Menambahkan data mahasiswa baru ke dalam list dan tabel.
  - `updateData()`: Memperbarui data mahasiswa yang sudah ada.
  - `deleteData()`: Menghapus data mahasiswa dari list dan tabel.
  - `clearForm()`: Mengosongkan form input dan mereset tombol.

- **Event Handling**:
  - Tombol `addUpdateButton` untuk menambah atau memperbarui data.
  - Tombol `deleteButton` untuk menghapus data.
  - Tombol `cancelButton` untuk mengosongkan form.
  - `MouseListener` pada tabel untuk memilih baris dan mengisi form dengan data yang dipilih.

## Cara Menjalankan Aplikasi

1. Pastikan Anda memiliki Java Development Kit (JDK) terinstal di sistem Anda.
2. Clone repositori ini atau download source code.
3. Buka terminal atau command prompt dan navigasikan ke direktori proyek.
4. Compile kode dengan perintah:
   ```bash
   javac Menu.java Mahasiswa.java
