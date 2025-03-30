# TP5DPBO2025C1

# Janji
Saya Muhammad Ichsan Khairullah dengan NIM 2306924 mengerjakan Tugas Praktikum 5 dalam mata kuliah Desain dan Pemograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Desain Program
Program ini merupakan pembaruan dari program Tugas Praktikum 4. Program ini merupakan aplikasi berbasis GUI menggunakan Java Swing yang memungkinkan pengguna untuk menampilkan, menambahkan, mengedit, dan menghapus data mahasiswa (CRUD) yang disimpan dalam database MySQL. Program ini juga telah dilengkapi dengan dialog/prompt error jika masih ada input yang kosong saat insert/update dan dialog/prompt error jika sudah ada NIM yang sama saat insert.

## Desain GUI:
![Screenshot 2025-03-23 205140](https://github.com/user-attachments/assets/ee6fa953-209e-4f86-b3b1-ee8fb872ac76)

## Komponen Utama dalam Menu.java:
JFrame: Frame utama aplikasi
JTable: Menampilkan daftar mahasiswa dalam bentuk tabel
JTextField: Input untuk NIM dan nama mahasiswa
JComboBox: Input dropdown untuk jenis kelamin mahasiswa
JSpinner: Input untuk umur mahasiswa
JButton: Tombol add/update, cancel, dan delete
ArrayList<Mahasiswa>: List untuk menyimpan data mahasiswa

# Penjelasan Alur
1. Program dimulai, membuat window GUI menggunakan JFrame dan menampilkan tabel mahasiswa.
2. Data mahasiswa diambil dari database mahasiswa_db dan ditampilkan di JTable.
3. Pengguna dapat melakukan operasi berikut:
   - Tambah Data:
     - Isi NIM, Nama, Jenis Kelamin, dan Umur.
     - Klik tombol 'Add' untuk memasukkan data ke database
     - Jika terdapat baris inputan yang kosong, maka akan muncul dialog error
     - Jika NIM yang dimasukkan sama dengan salah satu NIM yang berada di database, maka akan muncul dialog error
   - Update Data:
     - Pilih mahasiswa dari tabel.
     - Data mahasiswa yang dipilih muncul di form, tombol 'add' akan berubah menjadi 'Update'.
     - Ubah data, lalu klik 'Update' untuk memperbarui database
     - Jika terdapat baris inputan yang kosong, maka akan muncul dialog error
   - Hapus Data:
     - Pilih mahasiswa dari tabel.
     - Klik 'Delete', lalu akan muncul window konfirmasi penghapusan
     - Klik 'Yes' untuk mengonfirmasi penghapusan data
   - Cancel Input:
     - Klik tombol 'Cancel' untuk reset form
5. Setiap perubahan diperbarui di JTable secara otomatis.
6. Program terus berjalan hingga pengguna menutup window.

# Dokumentasi
![dokumentasi (2)](https://github.com/user-attachments/assets/0f42ba44-4fd2-4c18-8db2-eb538802964e)
