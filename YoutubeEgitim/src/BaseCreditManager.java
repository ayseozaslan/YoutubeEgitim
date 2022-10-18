
public abstract class BaseCreditManager implements ICreditManager {

	public abstract void Calculator ();//her class da değişken olduğu için abstract 
	public virtual  void Save() {
		System.out.println("Kaydedildi.");
		
		
	}
}
//* abstract classlarda icin tamamlanmamis ve tamamlanmis method yazabiliriz
//* abstract siniflar sinif özelligi gösterir o yuzden bir sinif sadece bir abstract sinifi inheritance edebilir
//* Bir sinif sadece bir abstract classi veya bir baska classi inheritance edebilir Yani hem classi hem de abstract classi inheritance edemez
//* abstract classlarda sinif grubunda kabul ediliyor.
//* abstract ve interface siniflari new'lenemez. Ikisi de referans tiplerin özelliklerinden yararlanir
//* java da methodlar default olarak virualdir. Direkt ezebiliriz
