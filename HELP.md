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

## Data
- `@Data` digunakan untuk mempersingkat penulisan gabungan dari annotasi `@Getter`, `@Setter`, `@RequiredArgsConstructor`, `@ToString`, dan `@EqualsAndHashCode`.
- Meskipun sudah menggunakan `@Data`, tetap bisa menambahkan annotasi `@Getter`, `@Setter`, dll.

## Builder
- Lombok memiliki fitur untuk melakukan auto generate class Builder untuk membuat object yang kompleks.
- Dengan menggunakan `@Builder`, secara otomatis lombok akan membuat static method `builder()` untuk membuat builder objectnya, dan `build()` untuk membuat objectnya
- Cara membuat objectnya cukup dengan  `ClassNya.builder().field1(isiFieldnya).field2(isiFieldnya).build();`
- Cara membuat objectnya jika classnya memiliki tipe generic `ClassNya.<TipeGenericNya>builder().field1(isiFieldnya).field2(isiFieldnya).build();`

## Singular
- Lombok memiliki fitur untuk memasukkan data singular ke dalam Collection.
- Dengan `@Singular` Lombok akan membuat builder method untuk menambahkan data ke Collection (List, Set, Map) satu per satu.
- Nama method otomatis bentuk singular dari nama field collection nya, contohnya pada field `hobbies` maka nama method buildernya adalah `hobby()`
- Untuk menghapus data yang sudah di masukkan, gunakan method `clearNamaMethod()`.

## NonNull
- jika `@NonNull` ditempatkan di field, maka secara otomatis akan digenerate di `@RequiredArgsConstructor`, sekaligus dilakukan pengecekan tidak boleh null.
- jika `@NonNull` ditempatkan di parameter, maka parameter tersebut akan dilakukan pengecekan null, jika ternyata null, akan throw NullPointerException.

## Value
- `@Value` digunakan untuk membuat immutable class.
- Mirip seperti `@Data` bedanya  classnya akan menjadi final class, semua field nya akan immutable, dan tidak ada setternya.

## With
- `@With` digunakan untuk membuat class baru dengan memodifikasi salah satu field yang sudah ada.
- Jika ditempatkan di field, maka secara otomatis membuat method dengan nama `withNamaField`.
- Jika ditempatkan di class, maka secara otomatis membuat method `withNamaField` untuk semua field.

## Cleanup
- Saat membuat object resource di java yang perlu close (contohnya koneksi ke database), biasanya menggunakan try-catch-finally, dengan melakukan close connection di finally.
- `@Cleanup` digunakan untuk membuat auto generate close resource.

## Sneaky Throws
- Secara default ketika membuat code yang memiliki checked exception, perlu menangkapnya dalam try-catch.
- Lombok bisa mengubah checked exception menjadi runtime exception, tanpa mengubah exception itu sendiri.
- Lombok hanya mengakali agar compiler java tidak komplen ketika tidak menangkap checked exception.
- Menggunakan annotasi `@SneakyThrows`.

## Log
- Lombok mendukung pembuatan field Logger log secara otomatis, dengan beberapa cara sesuai dengan library log yang digunakan.
- `@Log` untuk Java Logging.
- `@Slf4j` untuk SLF4J.
- `@CommonsLog` untuk apache commons log.
- `@Flogger` untuk google flogger.
- `@Log4J` untuk Log4J.
- `@JbossLog` untuk JBoss Log.

## Synchronized
- Lombok memiliki fitur untuk mempermudah membuat Lock agar method yang dibuat aman dari race condition.
- Dengan menggunakan `@Synchronized` dan jika ingin sharing lock dengan beberapa method bisa gunakan `value="valueLockNya"` yang sama.

## Learning
- main/Customer.java
- test/CustomerTest.java
- main/Login.java
- test/LoginTest.java
- main/Merchant.java
- main/Employee.java
- main/Manager.java
- main/Product.java
- main/Person.java
- test/PersonTest.java
- main/Member.java
- main/Register.java
- test/RegisterTest.java
- main/FileHelper.java
- test/FileHelperTest.java