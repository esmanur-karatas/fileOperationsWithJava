# ReadingByteSource

Bu Java projesi, belirtilen bir dosyadan byte verilerini okuyan basit bir örnektir.

## Nasıl Çalışır?

1. **ReadingByteSource.java**: Bu sınıf, belirtilen bir dosyayı okur ve içeriğini byte dizisi olarak okur.
2. **main() Metodu**: `ReadingByteSource` sınıfının ana metodu, belirtilen dosyanın mevcut olup olmadığını kontrol eder. Eğer dosya mevcut ise, bir `FileInputStream` oluşturur ve dosyadan byte'ları okur. Okunan byte'lar `byte` türündeki bir diziye yerleştirilir ve konsola yazdırılır.

## Kullanım

1. Projeyi klonlayın veya ZIP dosyası olarak indirin.
2. Proje dizinine gidin.
3. Projeyi derleyin:
    ```bash
    javac ReadingByteSource.java
    ```
4. Programı çalıştırın:
    ```bash
    java ReadingByteSource
    ```

## Notlar

- Bu örnek, belirtilen dosyadan byte'ları okumak için Java'nın `FileInputStream` sınıfını kullanır.
- Dosyanın konumu `ReadingByteSource` sınıfının içinde sabit olarak belirtilmiştir. Kodu kendi dosya yoluyla güncelleyebilirsiniz.

## Gereksinimler

- Java Development Kit (JDK)

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.


![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/9200fdeb-4958-4b50-9df5-c1e64cb66055)
