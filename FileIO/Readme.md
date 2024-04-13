# Dosya Oluşturma ve Yazma

Bu Java programı, kullanıcıdan bir dosya yolunu girmesini isteyen ve daha sonra bu dosyaya kullanıcı tarafından girilen metinleri yazan bir örnektir. Aşağıda programın işlevleri ve kodları açıklanmaktadır:

1. **Dosya Yolu Alma**:
   - Kullanıcıya, dosya yolunu girmesi için bir mesaj gösterilir.
   - Kullanıcının girdiği dosya yoluna göre bir `File` nesnesi oluşturulur.

2. **Dosya Oluşturma**:
   - Eğer girilen dosya daha önce mevcut değilse, `createNewFile()` metoduyla yeni bir dosya oluşturulur.
   - Dosya başarıyla oluşturulduğunda, kullanıcıya bir mesaj gösterilir.

3. **Dosyaya Yazma**:
   - `FileWriter` sınıfı kullanılarak dosyaya yazma işlemi gerçekleştirilir.
   - Kullanıcıdan metin satırları alınır ve dosyaya yazılır.
   - Kullanıcı "quit" kelimesini girene kadar metin alma ve dosyaya yazma işlemi devam eder.
   - Metinler arasında `System.lineSeparator()` kullanılarak yeni satırlar eklenir.

4. **Hata Kontrolü ve Temizlik**:
   - Dosya yazma işlemi sırasında oluşabilecek hatalar `try-catch` blokları kullanılarak kontrol edilir.
   - Dosya yazma işlemi bittiğinde, `FileWriter` nesnesi kapatılır.

5. **Sonuçlar**:
   - Kullanıcıya dosya yazma işleminin başarılı bir şekilde tamamlandığı ve dosyanın boyutunun kaç byte olduğu bildirilir.


