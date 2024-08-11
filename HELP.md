# Lombok
Merupakan sebuah library untuk melakukan generate code java secara otomatis, seperti getter setter, equals method, toString, dll.

## Getter Setter
- Lombok bisa membuat getter setter otomatis dengan menggunakan annotasi `@Getter` dan `@Setter`.
- Jika ditempatkan pada field, secara otomatis akan membuat getter setter untuk field.
- Jika ditempatkan pada class, maka semua field yang tidak statis yang ada di dalam class akan otomatis dibuatkan getter atau setternya.
- Secara default visibility nya adalah public, jika ingin diubah, menggunakan method `value=AccessLevel.LEVELNYA`

## Constructor
- `@NoArgsConstructor` (membuat constructor tanpa parameter)
- `@NoArgsConstructor` (membuat constructor dengan semua parameter yang diambil dari fieldnya, urutan parameternya yang dibuat sesuai dengan urutan fielnya)
- `@RequiredArgsConstructor` (membuat constructor untuk beberapa parameter saja diambil dari fieldnya yang final)
- Untuk membuat object dengan static method, bisa menambahkan method `staticName=namaMethodnya` pada annotationnya, secara otomatis constructornya akan menjadi private, sehingga harus mnggunakan static method untuk membuat object.

## ToString
- Lombok bisa digunakan untuk membuat method toString dengan menggunakan annotation `@ToString`.
- Secara otomatis akan membuat method toString() yang berisikan informasi semua field yang ada didalam class.
- Jika tidak ingin menampilkan beberapa field, gunakan method `exclude={namaFieldnya}`

## Equals dan HashCode
- Seperti biasa, kedua kethod equals() dan hashCode() selalu diimplementasikan berbarengan.
- Untuk membuat equals dan hashCode secara otomatis, bisa gunakan annotation `@EqualsAndHashMethod`.
- Secara otmatis ini akan membandingkan semua field didalam class, dan akan membuatkan hashCode method.
- Jika ingin memanggil super class methodnya, perlu mengubah method `callSuper()` menjadi true di annotationnya.

## Learning
- main/Customer.java
- test/CustomerTest.java
- main/Login.java
- test/LoginTest.java
- main/Merchant.java
- main/Employee.java
- main/Manager.java