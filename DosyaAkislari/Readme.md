# Dosya Akışları
Bu Java programı, bir dosyaya yazma işlemini gerçekleştiren basit bir örnektir. FileOutputStream sınıfını kullanarak bir dosyaya metin yazılmaktadır.

## Kullanım
Projeyi İndirme: Bu projeyi bilgisayarınıza klonlayın veya zip dosyası olarak indirin.

Java Derleme Ortamınızı Hazırlama: Java Development Kit (JDK) yüklü olmalıdır. JDK'yi Oracle'nin resmi sitesinden veya tercih ettiğiniz bir kaynaktan indirebilirsiniz.

## Çıktı Kontrolü: Program, hello.txt adında bir dosya oluşturacak ve içine "Merhaba" yazacaktır.

## Kod Açıklaması
- File file = new File("hello.txt");: hello.txt adında bir dosya oluşturmak için File sınıfından bir nesne oluşturulur.

- FileOutputStream fileOutputStream = null;: Dosyaya yazma işlemi için FileOutputStream sınıfından bir nesne oluşturulur.

- fileOutputStream = new FileOutputStream(file);: FileOutputStream nesnesi, file adlı dosyaya yazma işlemi için oluşturulur.

- fileOutputStream.write("Merhaba".getBytes());: "Merhaba" metni, getBytes() metodu ile byte dizisine dönüştürülerek dosyaya yazılır.

- finally Bloğu: Dosya akışını kapatmak için kullanılır. Eğer dosya akışı null değilse, close() metodu çağrılarak kapatılır.

## Hata Yönetimi
Eğer yazma işlemi sırasında bir hata oluşursa, IOException türündeki istisnalar yakalanır ve ekrana hatanın mesajı yazdırılır.


![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/456133b7-bc5f-4e4e-b411-33f8db715457)
