# 📝 JTest_Demoqa

Bu proje, **DemoQA** web sitesindeki çeşitli bileşenlerin otomasyon testlerini içermektedir. Java ve TestNG kullanılarak yazılmış olan bu testler, web elemanlarının doğru şekilde çalıştığını doğrulamaya yöneliktir.

## 🎯 Amaç
DemoQA sitesinde bulunan çeşitli bileşenleri test etmek ve **otomasyon test senaryoları** yazma pratiği yapmaktır. Testler, sayfa üzerindeki öğelerin beklenen şekilde çalıştığını doğrulamaya yardımcı olur.

## 🛠️ Kullanılan Teknolojiler
- **Java** (Test otomasyonu için)
- **Selenium WebDriver** (Web uygulamalarını test etmek için)
- **TestNG** (Test senaryolarını yönetmek ve çalıştırmak için)
- **Maven** (Bağımlılık yönetimi ve testleri çalıştırmak için)

## 📌 Test Edilen Bileşenler
Projede aşağıdaki bileşenler test edilmiştir:

1. **📄 Text Box**  
   - Kullanıcı adı, e-posta, adres gibi alanlara veri girme ve doğrulama testleri.

2. **🔘 Buttons**  
   - Farklı butonlara tıklama ve tıklama sonrası geri dönüşleri kontrol etme testleri. Actions class'ından nesne türetilip doubleClick, contextClick, click gibi metotlar kullanılarak test edilmiştir.

3. **📑 Check Box**  
   - Farklı checkbox’ları işaretleme ve işaret durumlarını doğrulama testleri.

4. **↔️ Drag and Drop**  
   - Sürükle-bırak işlemlerinin doğru çalışıp çalışmadığını test etme. Dosyanın hedefe beklenen şekilde bırakılması test edilmiştir.

5. **⚪ Radio Button**  
   - Radyo butonlarını seçme ve seçili durumu doğrulama testleri.

6. **🎚️ Slider**  
   - Slider’ı farklı değerlere sürükleyerek çalışmasını kontrol etme.

## 🚀 Nasıl Çalıştırılır?
Projeyi çalıştırmak için aşağıdaki adımları takip edebilirsiniz:

1. **Projeyi klonlayın:**
   ```sh
   git clone https://github.com/sumeyyessmn/JTest_Demoqa.git
   cd JTest_Demoqa
