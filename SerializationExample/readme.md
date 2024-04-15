# Nesne Serileştirme ve Dosya Okuma

Bu Java projesi, nesne serileştirme ve dosya okuma işlemleri için örnekler içerir. Proje, bir araç (car) nesnesini oluşturur, bu nesneyi serileştirir ve ardından serileştirilmiş nesneyi bir dosyaya yazar. Ayrıca, serileştirilmiş bir araç nesnesini okuyarak geri oluşturur.

## Car Sınıfı

Bu sınıf, bir aracı temsil eder ve araç bilgilerini içerir. Araç plakası, markası, modeli, yılı ve motor bilgisi gibi özellikleri içerir.

### Nasıl Çalışır?

- `Car` sınıfı, araç bilgilerini tutmak için kullanılır. Araç bilgilerini saklar ve bu bilgileri döndüren metodlara sahiptir. Ayrıca, aracın motor bilgisini de bir `Engine` nesnesi olarak içerir.

## Engine Sınıfı

Bu sınıf, bir aracın motorunu temsil eder. Motor hacmi gibi özellikleri içerir.

### Nasıl Çalışır?

- `Engine` sınıfı, aracın motor bilgilerini saklamak için kullanılır. Motor hacmi gibi bilgileri içerir.

## fileRead Sınıfı

Bu sınıf, bir dosyadan serileştirilmiş bir araç nesnesini okur.

### Nasıl Çalışır?

- `fileRead` sınıfı, `car.txt` dosyasından bir araç nesnesini okur. Dosya okuma işlemleri için `FileInputStream` ve `ObjectInputStream` kullanır.

## SerializationExample Sınıfı

Bu sınıf, bir araç nesnesini serileştirerek bir dosyaya yazar.

### Nasıl Çalışır?

- `SerializationExample` sınıfı, bir araç nesnesi oluşturur, bu nesneyi serileştirir ve `car.txt` adlı bir dosyaya yazar. Serileştirme işlemi için `FileOutputStream` ve `ObjectOutputStream` kullanır.

## Kullanım

1. `SerializationExample` sınıfı, bir araç nesnesini serileştirir ve `car.txt` adlı bir dosyaya kaydeder.
2. `fileRead` sınıfı, `car.txt` dosyasından bir araç nesnesini okur ve ekrana yazdırır.

## Notlar

- Bu proje, nesne serileştirme ve dosya okuma işlemlerini gösterir.
- Serileştirme işlemi, bir nesnenin bir dosyaya yazılabilir bir biçime dönüştürülmesini sağlar.
- Dosya adı ve konumu, kod içinde sabit olarak belirtilmiştir. İhtiyacınıza göre bu değerleri değiştirebilirsiniz.

## Gereksinimler

- Java Development Kit (JDK)

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.
   
![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/d40f4127-4da2-4277-8ffe-df86d0ebcd3d)

![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/9543e4e5-82ef-4eac-8d4a-0dd12b4fca8b)
