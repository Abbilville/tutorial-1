# Eshop
[https://eshop-abbilville.koyeb.app/](https://eshop-abbilville.koyeb.app/)

[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=Abbilville_tutorial-1)](https://sonarcloud.io/summary/new_code?id=Abbilville_tutorial-1)

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Abbilville_tutorial-1&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Abbilville_tutorial-1)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Abbilville_tutorial-1&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Abbilville_tutorial-1)
---
#### Nama: Abbilhaidar Farras Zulfikar
#### NPM: 2206026012
#### Kelas: Adpro A
---
## Tutorial 1
### Refleksi 1
Setelah mengerjakan <i>Exercise</i> 1 saya menjadi menyadari bahwa ilmu dalam perkodingan saya masih sangat kurang untuk bisa bersaing nantinya di dunia kerja. Fyi untuk menyelesaikan edit dan delete product membutuhkan waktu 3 jam nonstop bagi saya dan menurut saya itu sangat lama sekali. Hal tersebut terjadi karena saya belum terbiasa dengan kode yang harus dioper-oper functionnya ke setiap class. Tapi jika sudah menemukan polanya dalam membuat fungsi yang tepat maka jadi mudah untuk mengerjakannya. Namun tentu hal tersebut butuh pengamatan yang dalam dari kodenya. Tentu walaupun pada semester 3 saya sudah belajar Django namun menurut saya arsitektur ini berbeda dengan Spring Boot jadi saya juga perlu untuk belajar dokumentasi-dokumentasi dari Spring Boot agar bisa mengerti lebih dalam. <br>

Juga ada Clean Code Principles yang beberapa sudah saya terapkan dalam tutorial ini, yaitu:<br>

1. Meaningful Names, dalam tutorial ini saya sudah menerapkan penamaan variabel agar sesuai dengan fungsi aslinya sehingga tidak perlu menambahkan komen untuk menjelaskannya.
2. Function, dalam tutorial ini saya juga menerapkan clean code dalam function yaitu agar panjangnya tidak melebihi layar dan memiliki nama yang sesuai dengan fungsi dari function tersebut.
3. Comment, dalam tutorial ini saya sudah sebisa mungkin untuk menulis code yang jelas sehingga tidak memerlukan comment apapun.
4. Object and Data Structures, dalam tutorial ini saya sudah menerapkan OOP dan membuat interface class sehingga dapat menerapkan implementasi dari fungsinya. Modifier yang digunakan juga kebanyakan private agar program menggunakan getter dan setter.
5. Error Handling, nah kekurangan saya ada di error handling ini, misal dalam mencari item dengan id saya belum menghandle jika item yang dicari itu tidak ada dan malah mereturn null. <br>

Lalu untuk secure coding belum saya terapkan karena di exercise belum ada tutorial untuk menambahkan seperti autentikasi pengguna sehingga saya takut akan salah jika melakukannya sendiri.<br>

Setelah menulis refleksi pertama ini saya jadi kepikiran untuk memperbaiki kode saya agar semakin dekat dengan clean code. Pertama, saya ingin memperbaiki edit dan delete karena saya masih menggunakan method http GET dan POST untuk edit dan delete product. Kedua, mungkin saya akan menambahkan validasi input dalam membuat product.<br><br>

## Refleksi 2
1. Setelah menulis unit test pada tutorial ini, saya merasa banyak hal yang saya belum mengerti di dunia perkodingan. <b>Jumlah unit test yang seharusnya dibuat dalam satu class</b> menurut saya itu tergantung dengan seberapa kompleks kode yang kita buat sehingga kita dapat menerka berapa banyak test yang harus dibuat untuk mengcover semua kode tersebut agar dijamin sudah benar. Menurut saya, <b>100% code coverage</b> itu belum menjamin bahwa kode tersebut terbebas dari bug atau error lainnya. Bisa jadi masih adal logical error dalam penulisan kode sehingga codenya masih bisa berjalan tapi menghasilkan output yang salah.<br><br>

2. Misal saya membuat <b>functional test</b> untuk mengecek banyaknya item di product list di class yang baru namun setupnya sama. Menurut saya hal tersebut akan sangat berpengaruh ke clean codenya, membuat kodenya terlihat jorok sebab kita sama saja seperti menduplikat kode yang sudah ada sebelumnya. Tentu saja hal tersebut akan mengurangi kualitas dari kodenya. Untuk memperbaiki hal tersebut, mungkin kita dapat membuat setup dan instance variable yang bisa digunakan kembali seperti membuat superclass sehingga kita bisa mengextendnya saja agar tidak menghindari duplikasi. <br><br>

## Tutorial 2
### Refleksi
Selama mengerjakan tutorial 2 ini, beberapa code quality issues saya perbaiki antara lain:
1. Memperbaiki masalah executable permission issue pada file gradlew di Dockerfile dengan memberikan izin yang sesuai menggunakan perintah chmod +x gradlew
2. Menyesuaikan versi Java yang digunakan dalam analisis SonarCloud dengan mengubah konfigurasi untuk menggunakan Java 21, karena versi Java sebelumnya sudah tidak didukung lagi
3. Menambahkan konfigurasi yang diperlukan dalam file GitHub Actions workflow untuk memastikan analisis SonarCloud berjalan dengan benar, termasuk spesifikasi distribusi Java yang digunakan.

Terhadap CI/CD workflows (GitHub)/pipelines (GitLab), implementasi saat ini memenuhi definisi Continuous Integration (CI) dan Continuous Deployment (CD). Hal ini karena setiap kali ada perubahan kode yang dipush, workflow CI dijalankan secara otomatis untuk memeriksa kualitas kode, menjalankan tes, dan menerapkan praktik-praktik terbaik. Selanjutnya, jika tes berhasil, kode akan dideploy secara otomatis ke aplikasi deploy yang digunakan, dalam hal ini saya menggunakan Koyeb. Hal tersebut menciptakan workflow yang otomatis dan dapat digunakan dalam SDLC.
