# Dosya Akışları
Bu Java programı, bir dosyaya yazma işlemini gerçekleştiren ve aynı zamanda belirli bir dosyadan veri okuma işlemini gerçekleştiren basit bir örnektir.

## Kullanım
Projeyi İndirme: Bu projeyi bilgisayarınıza klonlayın veya zip dosyası olarak indirin.

Java Derleme Ortamınızı Hazırlama: Java Development Kit (JDK) yüklü olmalıdır. JDK'yi Oracle'nin resmi sitesinden veya tercih ettiğiniz bir kaynaktan indirebilirsiniz.

## Çıktı Kontrolü:

- Dosya Yazma: Program, hello.txt adında bir dosya oluşturacak ve içine "Merhaba" yazacaktır.

- Veri Okuma: Program, hello.txt adlı dosyadan veri okuyacak ve bu verileri konsola yazdıracaktır.

## Kod Açıklaması
- Dosya Yazma (DosyaAkislari)

- File file = new File("hello.txt");: hello.txt adında bir dosya oluşturmak için File sınıfından bir nesne oluşturulur.

- FileOutputStream fileOutputStream = null;: Dosyaya yazma işlemi için FileOutputStream sınıfından bir nesne oluşturulur.

- fileOutputStream = new FileOutputStream(file);: FileOutputStream nesnesi, file adlı dosyaya yazma işlemi için oluşturulur.

- fileOutputStream.write("Merhaba".getBytes());: "Merhaba" metni, getBytes() metodu ile byte dizisine dönüştürülerek dosyaya yazılır.

- finally Bloğu: Dosya akışını kapatmak için kullanılır. Eğer dosya akışı null değilse, close() metodu çağrılarak kapatılır.

## Veri Okuma (VeriyeErişme)

- File file = new File("hello.txt");: hello.txt adındaki dosyaya erişmek için File sınıfından bir nesne oluşturulur.

- FileInputStream fileInputStream = null;: Veri okuma işlemi için FileInputStream sınıfından bir nesne oluşturulur.

- fileInputStream = new FileInputStream(file);: FileInputStream nesnesi, file adlı dosyadan veri okumak için oluşturulur.

- while((c = fileInputStream.read()) != -1) { System.out.println((char)c); }: Dosyadan okunan veriler, read() metodu ile okunarak konsola yazdırılır. Okunan veriler int türünde olduğu için (char) dönüşümü yapılır.

## Hata Yönetimi
Eğer yazma veya okuma işlemi sırasında bir hata oluşursa, IOException türündeki istisnalar yakalanır ve ekrana hatanın mesajı yazdırılır.


## Veri Yazma 
![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/456133b7-bc5f-4e4e-b411-33f8db715457)


## Veri Okuma 
![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/4dffd695-1757-4fd3-b326-5cef7bcee2b1)

