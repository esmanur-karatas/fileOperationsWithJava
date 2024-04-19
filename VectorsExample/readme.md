# Kitap Katalogu Uygulaması
Bu Java projesi, bir kitap katalogu oluşturmak ve yönetmek için kullanılır. VectorsExample sınıfı, Vector sınıfını kullanarak kitap nesnelerini bir vektörde saklar ve çeşitli işlemler gerçekleştirir. Kitap nesneleri Book sınıfı tarafından temsil edilirken, yazar bilgileri Author sınıfı tarafından tutulur.

## Book Sınıfı
Book sınıfı, bir kitabı temsil eden nesneleri oluşturur. Her kitap nesnesi bir ad, basım yılı ve yazar içerir.

## Alanlar:
- bookName: Kitap adı
- bookYear: Kitabın basım yılı
- author: Kitabın yazarı (Author sınıfından bir nesne)

## Metodlar:
- getBookName(): Kitap adını döndürür.
- setBookName(): Kitap adını ayarlar.
- getBookYear(): Kitabın basım yılını döndürür.
- setBookYear(): Kitabın basım yılını ayarlar.
- getAuthor(): Kitabın yazarını döndürür.
- setAuthor(): Kitabın yazarını ayarlar.
- hashCode(): Nesne özgü bir hashCode üretir.
- equals(): İki kitap nesnesinin eşit olup olmadığını kontrol eder.
- toString(): Kitap bilgilerini bir dize olarak döndürür.

## Author Sınıfı
Author sınıfı, bir yazarı temsil eden nesneleri oluşturur. Her yazar nesnesi bir ad ve soyad içerir.

## Alanlar:
- name: Yazarın adı
- surname: Yazarın soyadı

## Metodlar:
- getName(): Yazarın adını döndürür.
- setName(): Yazarın adını ayarlar.
- getSurname(): Yazarın soyadını döndürür.
- setSurname(): Yazarın soyadını ayarlar.
- hashCode(): Nesne özgü bir hashCode üretir.
- equals(): İki yazar nesnesinin eşit olup olmadığını kontrol eder.
- toString(): Yazar bilgilerini bir dize olarak döndürür.

## VectorsExample Sınıfı
VectorsExample sınıfı, Vector sınıfını kullanarak kitap nesnelerini bir vektörde saklar ve çeşitli işlemler gerçekleştirir.

## Kullanılan Metotlar ve İşlevleri:
- add(E element): Vektöre bir kitap ekler.
- size(): Vektördeki kitap sayısını döndürür.
- iterator(): Vektör üzerinde bir Iterator döndürür.
- capacity(): Vektörün kapasitesini döndürür.

## Nasıl Kullanılır?
- Proje dosyalarını indirin veya kopyalayın.
- Java geliştirme ortamında (IDE) projeyi açın.
- VectorsExample.java dosyasını çalıştırın.
- Program başladığında, vektöre kitap nesneleri eklenir ve çeşitli işlemler gerçekleştirilir.

![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/8a2159b6-4e93-475e-a67d-defddf1f5b45)
