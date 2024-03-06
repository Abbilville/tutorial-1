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

### Refleksi 2
1. Setelah menulis unit test pada tutorial ini, saya merasa banyak hal yang saya belum mengerti di dunia perkodingan. <b>Jumlah unit test yang seharusnya dibuat dalam satu class</b> menurut saya itu tergantung dengan seberapa kompleks kode yang kita buat sehingga kita dapat menerka berapa banyak test yang harus dibuat untuk mengcover semua kode tersebut agar dijamin sudah benar. Menurut saya, <b>100% code coverage</b> itu belum menjamin bahwa kode tersebut terbebas dari bug atau error lainnya. Bisa jadi masih adal logical error dalam penulisan kode sehingga codenya masih bisa berjalan tapi menghasilkan output yang salah.<br><br>

2. Misal saya membuat <b>functional test</b> untuk mengecek banyaknya item di product list di class yang baru namun setupnya sama. Menurut saya hal tersebut akan sangat berpengaruh ke clean codenya, membuat kodenya terlihat jorok sebab kita sama saja seperti menduplikat kode yang sudah ada sebelumnya. Tentu saja hal tersebut akan mengurangi kualitas dari kodenya. Untuk memperbaiki hal tersebut, mungkin kita dapat membuat setup dan instance variable yang bisa digunakan kembali seperti membuat superclass sehingga kita bisa mengextendnya saja agar tidak menghindari duplikasi. <br><br>

## Tutorial 2
### Refleksi
Selama mengerjakan tutorial 2 ini, beberapa code quality issues saya perbaiki antara lain:
1. Memperbaiki masalah executable permission issue pada file gradlew di Dockerfile dengan memberikan izin yang sesuai menggunakan perintah chmod +x gradlew
2. Menyesuaikan versi Java yang digunakan dalam analisis SonarCloud dengan mengubah konfigurasi untuk menggunakan Java 21, karena versi Java sebelumnya sudah tidak didukung lagi
3. Menambahkan konfigurasi yang diperlukan dalam file GitHub Actions workflow untuk memastikan analisis SonarCloud berjalan dengan benar, termasuk spesifikasi distribusi Java yang digunakan
4. Menghilangkan public modifier pada file yang berhubungan dengan test, karena best implementation pada test yaitu menggunakan default modifier

Terhadap CI/CD workflows (GitHub)/pipelines (GitLab), implementasi saat ini memenuhi definisi Continuous Integration (CI) dan Continuous Deployment (CD). Hal ini karena setiap kali ada perubahan kode yang dipush, workflow CI dijalankan secara otomatis untuk memeriksa kualitas kode, menjalankan tes, dan menerapkan praktik-praktik terbaik. Selanjutnya, jika tes berhasil, kode akan dideploy secara otomatis ke aplikasi deploy yang digunakan, dalam hal ini saya menggunakan Koyeb. Hal tersebut menciptakan workflow yang otomatis dan dapat digunakan dalam SDLC.

## Tutorial 3
### Refleksi
1. **Explain what principles you apply to your project!** <br>
   Pada kesempatan kali ini, saya menerapkan **SOLID *principles*** ke dalam proyek yang saya buat sekarang. SOLID *principles* sebenarnya merupakan singkatan dari 5 aspek yang dibutuhkan ketika mendesain OOP sehingga lebih ter-*maintainable* saat proses selanjutnya dilakukan. Nah 5 aspek tersebut antara lain: **Single responsibility principle** (SRP), **Open-closed principle** (OCP), **Liskov substitution principle** (LSP), **Interface segregation principle** (ISP), dan **Dependency inversion principle** (DIP). Berikut hal yang sudah saya implementasikan berdasarkan kelima aspek tersebut:<br>
   - **Single responsibility principle** (SRP) <br>
     Setiap class harus sesuai dengan fungsinya masing-masing. Pada branch <code>before-solid</code>, class CarController terdapat di dalam class ProductController sehingga perlu dilakukan pemisahan agar CarController memiliki file classnya sendiri. Lalu, seharusnya class constructor model Product tidak boleh mengandung assign value ke dalam constructornya, sehingga constuctor assign value UUID ke id Product saya hapus dan pindahkan ke method create pada ProductRepository. Selain itu, CarController tidak perlu mengextend ProductController karena CarController hanya perlu mapping untuk yang berhubungan dengan car saja. <br>
   - **Open-closed principle** (OCP) <br>
     Pada class CarController, attribute carService menggunakan interface CarService dan bukan menggunakan class CarServiceImpl, hal ini agar bersifat *open-closed*. <br>
   - **Liskov substitution principle** (LSP) <br>
     CarController tidak perlu mengextend ProductController dan attribute carService menggunakan interface CarService. <br>
   - **Interface segregation principle** (ISP) <br>
     Dari mengganti attribute carService tersebut, class CarServiceImpl tidak perlu mengimplementasikan method dari interface yang mereka gunakan. <br>
   - **Dependency inversion principle** (DIP) <br>
     Menghapus public modifier pada class interface karena bersifat redundant. Mengganti attribute carService menjadi menggunakan interface CarService juga termasuk ke dalam DIP ini. <br>
2. **Explain the advantages of applying SOLID principles to your project with examples!** <br>
Penerapan **SOLID *principles*** dalam proyek kita memberikan keuntungan yang cukup signifikan, termasuk peningkatan *quality code*, *maintainability*, *comprehensibility*, dan *extensibility* yang lebih baik. Misalnya, **Single Responsibility Principle** yang memastikan setiap kelas memiliki tugasnya masing-masing sesuai dengan classnya, memperjelas fungsinya dan memudahkan pemahaman. **Open/Closed Principle** yang memungkinkan perluasan fitur tanpa mengganggu kode yang sudah ada serta mengurangi risiko dari adanya bug. **Liskov Substitution Principle** memastikan subclass dapat digunakan sebagai pengganti superclassnya. **Interface Segregation Principle** memisahkan interface agar klien hanya bergantung pada yang relevan dan yang terakhir **Dependency Inversion Principle** yang memungkinkan fleksibilitas. Dengan **SOLID *principles*** kita dapat menciptakan kode yang bersifat seperti yang dijelaskan di awal tadi. Contoh kasus adalah misal kita memiliki suatu error di class CarController, maka kita akan tahu di mana untuk melakukan debugging karena fitur-fiturnya berada di kelas itu sendiri, yaitu CarController. Hal ini sesuai dengan prinsip dari **Single Responsibility Principle** (SRP). <br>
3. **Explain the disadvantages of not applying SOLID principles to your project with examples!** <br>
Tidak menerapkan **SOLID *principles*** dalam proyek kita dapat mengakibatkan beberapa kelemahan cukup signifikan. Contohnya sama seperti tadi, jika kita tidak menerapkan **Single Responsibility Principle** (SRP), kelas-kelas menjadi terlalu kompleks dengan workload yang terlalu banyak dan sulit dipahami. Jika CarController masih ada di file ProductController maka kita jadi bingung jika terjadi error di file tersebut maka kita harus mendebug class CarControllernya atau ProductControllernya. Selain itu, misal apabila ada interface bernama Service yang mengandung semua method yang seharusnya di CarService dan ProductService, implementasinya di CarServiceImpl harus mengimplementasikan method seperti <code>Product create(Product product);</code> yang tidak akan pernah digunakan.

## Tutorial 4
### Refleksi
1. **Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, chapter “Evaluating Your Testing Objectives”), whether this TDD flow is useful enough for you or not. If not, explain things that you need to do next time you make more tests.** <br>
Setelah saya mengerjakan tutorial 4 ini, saya merasa bahwa metode TDD telah memberikan manfaat dan pengalaman yang berkesan bagi saya karena kita harus membuat mengimplementasikan sesuatu berdasarkan test-test yang kita buat. Dalam hal kebenaran (correctness), saya yakin bahwa saya memiliki cukup banyak tes fungsional untuk memastikan bahwa aplikasi saya benar-benar berfungsi dari sudut pandang pengguna. Saya juga yakin bahwa saya telah menguji semua kasus ekstrem secara menyeluruh. Dalam hal maintainability, tes yang saya buat memberi saya kepercayaan untuk melakukan refaktorisasi kode saya tanpa rasa takut. Tes tersebut juga membantu saya untuk menghasilkan desain yang baik. Saya menyadari bahwa jika saya memiliki lebih banyak tes integrasi daripada tes unit, maka saya perlu membuat lebih banyak tes unit untuk mendapatkan umpan balik yang lebih baik terhadap desain kode saya. Dalam hal alur kerja produksi (production workflow), umpan balik yang saya terima sejauh ini telah memenuhi harapan saya. Saya dapat menjalankan subset dari rangkaian tes secara efisien ketika diperlukan. Meskipun saya melakukan evaluasi reguler dan refaktorisasi tes untuk meningkatkan kecepatan pengujian, saya merasa tidak terlalu banyak waktu yang terbuang untuk menunggu hasil pengujian, sehingga saya dapat tetap produktif dalam alur kerja saya. Dengan demikian, sementara aliran TDD yang saya terapkan saat ini telah membantu saya mencapai sebagian besar tujuan pengujian saya, saya tetap terbuka untuk melakukan penyesuaian di masa depan berdasarkan evaluasi reguler terhadap proses pengujian dan umpan balik yang saya terima dari proses tersebut.

2. **You have created unit tests in Tutorial. Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not. If not, explain things that you need to do the next time you create more tests.** <br>
Dalam pengembangan perangkat lunak, menerapkan prinsip F.I.R.S.T dalam pengujian sangat penting untuk memastikan kualitas kode yang tinggi dan keandalan aplikasi. Saya telah berhasil mengikuti prinsip ini dalam proses pengujian saya. Tes saya dijalankan sesegera mungkin tanpa mengganggu alur kerja saya, sehingga memungkinkan saya untuk tetap fokus pada pengembangan. Saya memisahkan tes menjadi unit tes dan tes fungsional untuk memastikan cakupan pengujian yang komprehensif. <br> <br>
Tes saya juga dirancang agar tidak saling bergantung satu sama lain, dan mereka konsisten dalam hasilnya pada setiap eksekusi yang diulang. Dengan menggunakan asserst yang ketat, tes saya menjadi mandiri dalam memvalidasi fungsionalitas kode. Saya memastikan bahwa semua jalur yang mungkin dieksplorasi, baik yang bahagia maupun yang tidak bahagia, serta semua kemungkinan kesalahan atau hasil yang tidak diinginkan, tercakup dalam pengujian saya. <br> <br>
Selain itu, saya mengimplementasikan teknik Dummy, Mocks, setUp, dan tearDown untuk menghindari duplikasi dan membersihkan objek. Jika fungsi saya melibatkan pemanggilan fungsi lain, saya menggunakan teknik Test Double untuk memastikan pengujian yang terisolasi dan dapat diandalkan. Dengan demikian, prinsip F.I.R.S.T menjadi pedoman saya dalam membangun dan menguji perangkat lunak, memastikan bahwa produk yang dihasilkan memiliki kualitas yang tinggi dan keandalan yang kuat.
