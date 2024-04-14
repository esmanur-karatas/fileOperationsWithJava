# Uzak Dosya İşlemleri

Bu Java projesi, internet üzerinden uzak bir dosyayı indirmek ve yerel olarak kaydetmek için kullanılan örnekler içerir.

## RemoteFile Sınıfı

Bu sınıf, belirli bir URL'den (web adresi) bir dosyayı indirir ve yerel bir dosyaya kaydeder.

### Nasıl Çalışır?

1. **main() Metodu**: `RemoteFile` sınıfının ana metodu, belirtilen URL'den bir bağlantı oluşturur (`URL url = new URL("https://www.w3.org/TR/2003/REC-PNG-20031110/iso_8859-1.txt")`), bu bağlantı üzerinden bir giriş akışı alır (`InputStream inputStream = connection.getInputStream()`), ve bu giriş akışını bir karakter akışına dönüştürür (`InputStreamReader inputStreamReader = new InputStreamReader(inputStream)`). Daha sonra bir karakter tamponu kullanarak veriyi okur (`char[] buffer = new char[1024]`) ve bu veriyi bir dosyaya yazmak için bir dosya çıktısı akışı oluşturur (`FileOutputStream fileOutputStream = new FileOutputStream("output.txt")`).


![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/84feb7ef-234a-4489-90ac-632cb56b860f)


## Downloader Sınıfı

Bu sınıf, kullanıcıdan bir URL alır, bu URL'den bir dosyayı indirir ve indirilen dosyayı yerel bir dosyaya kaydeder.

### Nasıl Çalışır?

1. **main() Metodu**: `Downloader` sınıfının ana metodu, kullanıcıdan bir URL alır (`Scanner scan = new Scanner(System.in); String line = scan.nextLine();`), bu URL'den bir bağlantı oluşturur (`URL url = new URL(line)`), bu bağlantı üzerinden bir giriş akışı alır (`InputStream inputStream = connection.getInputStream()`), ve bu giriş akışından veriyi okur (`byte[] buffer = new byte[1024]`) ve bir dosyaya yazmak için bir dosya çıktısı akışı oluşturur (`FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(System.currentTimeMillis()))`).

## Kullanım

1. Her iki sınıf da bağımsız olarak çalışabilir. İlgili sınıfın main metodu çalıştırılarak işlem gerçekleştirilebilir.
2. `RemoteFile` sınıfı, belirtilen bir URL'den dosya indirir ve `output.txt` dosyasına kaydeder.
3. `Downloader` sınıfı, kullanıcıdan bir URL alır, bu URL'den dosya indirir ve indirilen dosyayı sistem saatine bağlı olarak adlandırılmış bir dosyaya kaydeder.

   ![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/70d12551-fd74-46eb-9bc1-2990bef6fed2)

   

## Notlar

- Bu örnekler, internet üzerinden dosya indirmek ve yerel bir dosyaya kaydetmek için kullanışlı Java sınıflarını gösterir.
- İndirilen dosyanın adı ve kaydedileceği konum kod içinde sabit olarak belirtilmiştir. İhtiyacınıza göre bu değerleri değiştirebilirsiniz.

## Gereksinimler

- Java Development Kit (JDK)

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.



