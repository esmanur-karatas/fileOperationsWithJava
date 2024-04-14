# Nesne Serileştirme Örneği

Bu Java projesi, bir nesneyi serileştirmek ve serileştirilmiş bir nesneyi dosyaya yazmak için kullanılan örnekler içerir.

## Serilization Sınıfı

Bu sınıf, bir `Student` nesnesini oluşturur, bu nesneyi serileştirir ve serileştirilmiş nesneyi bir dosyaya yazmak için kullanılır.

### Serileştirme Nedir?

Serileştirme, bir nesnenin bellekteki durumunu saklayarak ve sonra geri yükleyerek nesnenin durumunu korumak için kullanılan bir mekanizmadır. Java'da serileştirme, bir nesnenin `Serializable` arabirimini uygulayarak gerçekleştirilir.

### Serilization Sınıfı Nasıl Çalışır?

1. **main() Metodu**: `Serilization` sınıfının ana metodu, bir `Student` nesnesi oluşturur. Bu nesneye öğrenci numarası, adı, soyadı ve sınıfı atanır. Ardından, bu nesneyi belirtilen dosyaya serileştirir ve dosyaya yazmak için bir `ObjectOutputStream` kullanır.

## Student Sınıfı

Bu sınıf, öğrenci bilgilerini temsil eder ve serileştirilebilir bir sınıftır.

### Student Sınıfının Oluşturulma Nedeni

`Student` sınıfı, öğrenci bilgilerini içeren bir veri yapısı oluşturmak için yazılmıştır. Bu sınıf, öğrenci numarası, adı, soyadı ve sınıfı gibi özelliklere sahiptir. Ayrıca, serileştirilebilir bir sınıf olarak tasarlanmıştır, böylece nesneleri dosyalara yazmak ve dosyalardan okumak mümkün olur.

### Serileştirilebilirlik

`Student` sınıfı, `Serializable` arabirimini uygulayarak serileştirilebilir hale getirilmiştir. Bu, `Student` nesnelerinin serileştirme ve deserializasyon işlemlerine tabi tutulabileceği anlamına gelir. Serileştirme, öğrenci nesnesinin durumunu korumak ve dosyalara yazmak için kullanışlı bir yöntemdir.

## Kullanım

1. `Serilization` sınıfı, bir `Student` nesnesini serileştirir ve `student.bin` adlı bir dosyaya kaydeder.
2. `Student` sınıfı, öğrenci bilgilerini temsil eder ve serileştirilebilir bir sınıftır.

## Notlar

- Serileştirme, bir nesnenin bir dosyaya yazılabilir bir biçime dönüştürülmesini sağlar. Bu dosyadan nesne tekrar oluşturulabilir.
- `Student` sınıfı, öğrenci bilgilerini içerir ve serileştirilebilir bir sınıftır.
- Dosya adı ve kaydedileceği konum, kod içinde sabit olarak belirtilmiştir. İhtiyacınıza göre bu değerleri değiştirebilirsiniz.

## Gereksinimler

- Java Development Kit (JDK)

## Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.


![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/687b9668-3a35-4a7c-a611-ab3e06c55ac0)


![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/844332f8-656b-47b1-9e0a-3e6c057acd49)
