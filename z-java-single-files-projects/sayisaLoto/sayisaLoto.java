import java.util.Scanner;
import java.util.Random;
public class sayisaLoto 
{
	// program�n amac� : istedi�iniz limite kadar istedi�iniz adet say�y� ister manuel ister otomatik olarak �retmek.
	// Programda �kramiye tutar�n� belirleyebilirsiniz...
	public static void main(String[] args) 
	{
		AnaKontrol();
	}
	//AnaKontrol fonksiyonu i�erisinde ka� say� �retilece�i , limit ve manuel mi otomatik mi �retmek istedi�imizi belirliyoruz.
	public static void AnaKontrol()
	{
		Scanner sc=new Scanner(System.in);
		Random r = new Random();
		System.out.println("Ka� say� �retelim ?");
		int kacSayi	= sc.nextInt(); 
		if(kacSayi>500)
		{
			System.out.println("her�eyin bir s�n�r� var !\n \t...");
		}
		else
		{
		System.out.println("Limit ka� olsun ?"); // �retilecek maksimum de�eri kullan�c� belirler.
		int limit = sc.nextInt();
		System.out.println("B�y�k �kramiye Tutar�n� Giriniz!\tint/long �eklinde");
		Long ikramiye = sc.nextLong();
		int[] userTahmin = new int[kacSayi]; // kullan�c�n�n tahminlerinin tutuldu�u int dizisi
		System.out.println("Say� tahmin etmek i�in 1 hari� bir say� giriniz... \n Otomatik tahmin i�in 1 giriniz...");
		int tahminTip=sc.nextInt(); // manuel mi otomatik mi say� �retmek istiyoruz?
		if(tahminTip==1)// kullan�c� say� �retmeyi programa b�rak�rsa if kendisi tahmin etmek isterse else ko�ulu �al���r.
		{
			char[] cumle = new char[]{'s','a','y','�','l','a','r',' ','�','r','e','t','i','l','i','y','o','r','.','.','.','\n'}; // bi mesaj sadece :))
			for(int i=0;i<cumle.length;i++)
			{
			System.out.print(cumle[i]+" ");
			}
			for(int i=0;i<kacSayi;)
			{
			boolean kontrol=true;
			int uretilen = r.nextInt(limit)+1;
				for(int j=0;j<kacSayi;j++)
				{
					if(uretilen==userTahmin[j])
					{	
					kontrol=false;
					break;
					}
				}
				if(kontrol==true)
				{
					userTahmin[i]=uretilen;
					i++;
				}
			}			
		}
		else
		{
			for(int i=0;i<kacSayi;i++) // e�er manuel tahmin se�ilirse kullan�c�ya tahminlerini sordu�umuz d�ng�
			{
				System.out.println((i+1)+". tahmininiz nedir ?");
				int userSayi = sc.nextInt();
				userTahmin[i]=userSayi;
			}
		}
		int[] randTahmin= SayiUret(kacSayi,limit); // say��ret fonksiyonu �a�r�lmas�...
		System.out.print("\nSizin Tahminleriniz: "); // ekrana kullan�c�n�n girdi�i say�lar� yazd�rmak
		for(int i=0;i<kacSayi;i++)
		{
			System.out.print(userTahmin[i]+" ");	
		}
		System.out.print("\nRastgele  Tahminler: "); // ekrana random say�lar� yazd�rmak
		for(int i=0;i<kacSayi;i++)
		{
			System.out.print(randTahmin[i]+" ");	
		}
		int[] dogruTahminler = Control(userTahmin,randTahmin); //control methodundan d�nen de�erlerin int diziye at�l�p ekrana yaz�lmas�
		System.out.print("\nDo�ru     Tahminler: ");
		if(dogruTahminler.length==0) //e�er do�ru tahmin yok ise if e�er var ise else ko�ulu �al���r...
		{
			System.out.print("YOK");
		}
		else
		{
			for(int i=0;i<dogruTahminler.length;i++)
			{
				System.out.print(dogruTahminler[i]+" ");
			}	
		}
		System.out.println("\nB�y�k �kramiye Tutar� = "+ikramiye+" YTL"); // �ekili� sonunda ikramiyeyi ekrana yazd�rma
		if(dogruTahminler.length==kacSayi) // e�er t�m tahminler do�ru ise
		{
			System.out.println("\nTEBR�KLER B�Y�K �KRAM�YE KAZANDINIZ !!!");
			System.out.println("\nTam Tam�na "+ikramiye+" YTL");
		}
		else if(dogruTahminler.length==0) // do�ru tahmin yokse ikramiyede yok :))
		{
			System.out.println("\nBir tane bile bilemediniz �kramiye Falan YOK :))");
		}
		else if(dogruTahminler.length==1||dogruTahminler.length==2||dogruTahminler.length==3) // 1-2 ve 3 bilme durumundada ikramiye yok :))
		{
			System.out.println("\nSadece '"+dogruTahminler.length+"' tane bildiniz..Bu kadar�n� herkes bilir :))");
		}
		else // di�er ko�ullar d���nda bilme oran� kadar ikramiye kazan�r...
		{
			System.out.println("\n"+dogruTahminler.length+" tahmininiz tuttu!");
			System.out.println("\n"+((ikramiye/kacSayi)*dogruTahminler.length)+" YTL Kazand�n�z!");
		}
	}
	}
	// Say��ret fonksiyonu ile birbirinden farkl� istedi�imiz adet de say� �retip geriye int dizisi olarak d�nd�rme
	public static int[] SayiUret(int kacSayi,int limit)
	{
		Random r = new Random();
		int[] uretilenler = new int[kacSayi];
		for(int i=0;i<kacSayi;)
		{
		boolean kontrol=true;
		int uretilen = r.nextInt(limit)+1;
			for(int j=0;j<kacSayi;j++)
			{
				if(uretilen==uretilenler[j])
				{	
				kontrol=false;
				break;
				}
			}
			if(kontrol==true)
			{
				uretilenler[i]=uretilen;
				i++;
			}
		}
		return uretilenler;
	}
	// Control fonksiyonu sayesinde ka� tahminin tuttu�unu do�ru tahminlerin geriye string olarak d�nd�r�lmesini sa�l�yoruz.
	public static int[] Control(int[] myLoto,int[] randLoto)
	{
		// bu d�ng�de ka� tahminin tuttu�u bulunur... count de�erine atan�r...
		int count=0;
		for(int i=0;i<myLoto.length;i++)
		{
			for(int j=0;j<randLoto.length;j++)
			{
				if(myLoto[i]==randLoto[j])
				{
					count++;
				}
			}
		}
		//do�ru tahmin say�s� kapasiteli dizi olu�turulup bilinen de�erler geri d�nd�r�l�r...
		int sayac=0;
		int[] sonuc=new int[count];
		for(int i=0;i<myLoto.length;i++)
		{
			for(int j=0;j<randLoto.length;j++)
			{
				if(myLoto[i]==randLoto[j])
				{
					sonuc[sayac]=myLoto[i];
					sayac++;
				}
			}
		}
		return sonuc;
	}
	//Fatih Y�ld�zhan
	//fatih@yildizhanlar.com
	//www.fatihyildizhan.com
}
