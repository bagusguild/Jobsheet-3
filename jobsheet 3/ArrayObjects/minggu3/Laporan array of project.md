# Laporan Array of Project (Jobsheet 3)

## Attention please >> the question that ask about source code, u can check on code file, i apload the file too.

Created by : 

Bagus Dwi Putranto
2141720079
1F D4 TI

### 3.2.1 Langkah-langkah percobaan
1. Buat Project baru, dengan nama “ArrayObjects”. Buat package dengan nama minggu3.
2. Buat class PersegiPanjang:
3. ada fungsi main yaitu pada class ArrayObjects, buatlah array PersegiPanjang yang berisi :
4. Kemudian isikan masing-masing atributnya :
5. Cetak ke layar semua atribut dari objek ppArray :
6. Jalankan dan amati hasilnya.

### 3.2.2 Verifikasi Hasi Percobaan
Cocokan hasi compile kode program anda dengan gambar berikut ini

### 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan! :
    : -Iya, karena nantinya kelas object akan dipakai untuk deklarasi atribut dan method, sedangkan main hanya untuk mengoperasikannya
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
    : -Untuk menyatakan bahwa ppArray adalah variable bari di package PersegiPanjang();
3. Apa yang dimaksud dengan kode berikut ini:
    : Instansiasi variable PersegiPanjang yang berbentuk array dengan nama variable ppArray
4. Apa yang dimaksud dengan kode berikut ini:
    : Instansiasi ppArray dan deklarasi atribut panjang dan lebar yang ada pada class PersegiPanjang.
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
    : Karena menggunakan program berbasis object

### 3.3 Menerima input Array menggunakan looping
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang ada di ppArray.

### 3.3.1 Langkah-langkah percobaan
1. Import scanner pada class ArrayObjects
2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek Scanner untuk menerima input, kemudian melakukan looping untuk menerima input:
3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping untuk mengakses isi array ppArray dan menampilkannya ke layar:
4. Amati hasil

### 3.3.2 Verifikasi
Contoh verifikasi hasil percobaan ini.

### 3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
    : dapat
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
    : saat membuat program yang membutuhkan table, kita bisa menggunakan array 2 dimensi, seperti program penilaian akademik
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?
    : karena belum menginstansiasi pgArray[5] yang berada pada class Persegi
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan ! 
    : Boleh, tapi akan memakan baris code


### 3.4 Operasi Matematika Atribut Object Array
Pada praktikum ini kita akan melakukan pengoperasian matematika beberapa atribut pada masing-masing anggota array.

### 3.4.1 Langkah-langkah Percobaan
1. Buat package baru “ArrayBalok”.
2. Buat class Balok:
3. Pada fungsi main yaitu pada class ArrayBalok, buat array Balok yang berisi 3 elemen :
4. Kemudian tambahkan kode berikut ini untuk mengisi array blArray menggunakan konstruktor dari class Balok:
5. Tampilkan semua volume balok tersebut dengan cara memanggil method hitungVolume() di dalam looping seperti berikut ini:
6. Jalankan dan amati hasilnya.

### 3.4.2 Verify
Cocokkan hasil compile kode program anda dengan gambar berikut ini.

### 3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
    : bisa, saat membei parameter, agar mempersingkat saat menginisialisasi
2. Jika diketahui terdapat class Segitiga seperti berikut ini: (Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int tyang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.)
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut.
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().

### 3.5 Latihan Praktikum (Run file codenya !!!)
1. Buatlah program yang dapat menghitung luas permukaan dan volume beberapa bangun ruang (minimal 3, jenis bangun luas bebas). Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Dan buat satu main class untuk membuat array of objek yang menginputkan atribut-atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. 
Keterangan : Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut.
2. Sebuah perusahaan jual beli tanah membutuhkan sebuah program yang dapat memberitahu luas tanah. Program tersebut dapat menerima input jumlah tanah yang akan dihitung dan atribut panjang dan lebar masing-masing dari tanah yang diinputkan. Program dapat menampilkan luas tanah masing-masing tanah yang diinputkan tadi dan juga tanah terluas dari ketiga tanah yang ada. Contoh output program:
3. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program:
