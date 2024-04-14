# ConvertByteToCharacterStream

Bu Java projesi, bir dosyadan karakterleri okuyan ve bir dosyaya karakterleri yazan basit bir örnektir.

## Nasıl Çalışır?

1. **ConvertByteToCharacterStream.java**: Bu sınıf, bir dosyadan karakterleri okumak için `FileInputStream`, `InputStreamReader` ve `BufferedReader` kullanır. Bir dosyaya karakterleri yazmak için ise `FileOutputStream` ve `OutputStreamWriter` kullanır.
2. **main() Metodu**: `ConvertByteToCharacterStream` sınıfının ana metodu, `fileReader()` ve `fileWrite()` metotlarını sırasıyla çağırarak dosyadan okuma ve dosyaya yazma işlemlerini gerçekleştirir.

## Kullanım

1. Projeyi klonlayın veya ZIP dosyası olarak indirin.
2. Proje dizinine gidin.
3. Projeyi derleyin:
    ```bash
    javac ConvertByteToCharacterStream.java
    ```
4. Programı çalıştırın:
    ```bash
    java ConvertByteToCharacterStream
    ```

## Notlar

- Bu örnek, dosyadan karakter okumak için Java'nın `FileInputStream`, `InputStreamReader` ve `BufferedReader` sınıflarını; dosyaya karakter yazmak için ise `FileOutputStream` ve `OutputStreamWriter` sınıflarını kullanır.
- Dosya adı `test.txt` olarak sabit olarak belirtilmiştir. Kodu kendi gereksinimlerinize göre güncelleyebilirsiniz.

## Gereksinimler

- Java Development Kit (JDK)

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.

![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/5caae9bf-9954-434c-ae31-0babdb84e4d3)
