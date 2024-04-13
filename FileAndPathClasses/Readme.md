# File1

Bu Java sınıfı, bir dosya üzerinde çeşitli işlemler gerçekleştiren örnek bir programı içerir. Aşağıda bu sınıfta gerçekleştirilen işlemler ve açıklamaları bulunmaktadır:

- `file.exists()`: Dosyanın verilen yol üzerinde olup olmadığını kontrol eder ve sonucu `true` veya `false` olarak döndürür.
- `file.canRead()`: Dosyayı okuma iznimizin olup olmadığını kontrol eder.
- `file.canWrite()`: Dosyayı yazma iznimizin olup olmadığını kontrol eder.
- `file.isDirectory()`: Dosyanın bir klasör olup olmadığını kontrol eder.
- `file.getAbsolutePath()`: Dosyanın tam yolunu alır.
- `file.getParent()`: Dosyanın üst dizinini alır.
- `file.length()`: Dosyanın boyutunu byte cinsinden döndürür.
- `new Date(file.lastModified())`: Dosya veya klasörün üzerindeki son değişikliğin tarihini döndürür.

Ayrıca, bu sınıf dosya oluşturma ve silme işlemlerini de içerir:
- Dosya oluşturma işlemi için `createNewFile()` metodu kullanılır.
- Dosya silme işlemi için `delete()` metodu kullanılır.

# Path1

Bu Java sınıfı, kullanıcıdan bir dosya yolunu girmesini isteyen ve daha sonra bu dosyanın içeriğini listelemeyi sağlayan bir programı içerir. İşte sınıfın işlevleri:

- Kullanıcı, dosya yolunu girmesi için bir mesaj alır.
- Kullanıcının girdiği dosya yoluna göre bir `File` nesnesi oluşturulur.
- `list()` yöntemi kullanılarak dosya içeriği alınır ve bir diziye atanır.
- Dizi, dosya içeriğini ekrana yazdırmak için döngü kullanılarak işlenir.




![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/8e7fcaf7-9efb-4e69-b928-1e8ba7cfae85)


![image](https://github.com/esmanur-karatas/fileOperationsWithJava/assets/83882274/65c93a64-3a46-4f64-9fd4-b7de1d692442)
