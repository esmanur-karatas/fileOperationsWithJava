# Film Katalogu Uygulaması
Bu Java projesi, film bilgilerini saklamak ve yönetmek için bir uygulama içerir. Movie sınıfı film nesnelerini temsil ederken, ArrayListEx sınıfı bu film nesnelerini bir ArrayList içinde saklar ve yönetir.

## Movie Sınıfı
Movie sınıfı, bir filmi temsil eden nesneleri oluşturur. Her film nesnesi bir isim, yönetmen, tür ve yayınlanma yılı içerir.

## Alanlar:
- name: Film adı
- director: Film yönetmeni
- type: Film türü (enum)
- year: Yayınlanma yılı

## Metodlar:
- getName(): Film adını döndürür.
- setName(): Film adını ayarlar.
- getDirector(): Film yönetmenini döndürür.
- setDirector(): Film yönetmenini ayarlar.
- getMovieType(): Film türünü döndürür.
- setMovieType(): Film türünü ayarlar.
- getYear(): Yayınlanma yılını döndürür.
- setYear(): Yayınlanma yılını ayarlar.
- hashCode(): Nesne özgü bir hashCode üretir.
- equals(): İki film nesnesinin eşit olup olmadığını kontrol eder.
- toString(): Film bilgilerini bir dize olarak döndürür.

## ArrayListEx Sınıfı
ArrayListEx sınıfı, film nesnelerini bir ArrayList içinde saklar ve yönetir.

## Metodlar:
- main(): Programın çalıştırıldığı ana metod. Film nesneleri oluşturulur, ArrayList'e eklenir ve ekrana yazdırılır.

## Film Türleri
Filmler, aşağıdaki türlerden birine ait olabilir:

- KOMEDİ
- DRAM
- BELGESEL
- AKSİYON
- BİLİM_KURGU
- GERİLİM
- FANTASTİK
Bu türler, MovieType enum sınıfında tanımlanmıştır.

Nasıl Kullanılır?
Proje dosyalarını indirin veya kopyalayın.
Java geliştirme ortamında (IDE) projeyi açın.
ArrayListEx.java dosyasını çalıştırın.
Program başladığında, film nesneleri oluşturulacak, ArrayList'e eklenip ve ekrana yazdırılacaktır.
