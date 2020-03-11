import java.util.Scanner;
import java.util.Random;
public class Poker
{
	static Scanner input = new Scanner(System.in);
	static Random rndm = new Random();
	//Program�n Amac� tek kullan�c� i�in poker oyunu gibi 5 farkl� kart da��tmakt�r
    //methodlarda ufak de�i�iklikler sayesinde birden fazla oyuncu i�in uygun hale getirilebilir...
    
    //Main
    // oyuncuKartlar Methoduna , kartlariDagit ve SayiUret methodlar�ndan gelen de�erler verilip
    // oyuncudakiKartlar string dizisine at�l�p ekrana for d�ng�s�yle yaz�lm��t�r.
public static void main(String[] args) 
	{
		System.out.print("Oyuncu say�s� giriniz:	");
		int oyuncuSayisi = input.nextInt(); 
		if(oyuncuSayisi>10||oyuncuSayisi<1)
		{
			System.out.println("\nPoker ancak 1 ile 10 ki�i aras�nda oynanabilir");
		}
		else
		{
			String[] oyuncudakiKartlar = oyuncuKartlar(kartlariDagit(),sayiUret(oyuncuSayisi),oyuncuSayisi);
			int counter=1;
			for(int i = 0; i<5*oyuncuSayisi;i++)
			{
				if(i%5==0)
				{
					System.out.println("\n"+counter+". Oyuncu");
					counter++;
				}	
				System.out.print(oyuncudakiKartlar[i]+" ");
			}
		}
	}
//kartlariDagit Methodu
// karTur ve kartNo dizilerini kullanarak 52 lik bir deste olu�turup bunu kartlar String dizisine atar
// geriye kartlar String dizisini d�nd�r�r
public static String[] kartlariDagit()		//Kartlar�Da��t Method
	{
	
	String[] kartTur = new String[] { "Ma�a", "Karo", "Sinek", "Kupa" };
    String[] kartNo = new String[] { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "K�z", "Papaz" };
    String[] kartlar = new String[52];
	
	for (int i = 0; i < kartTur.length; i++)
    {
        for (int x = 0; x < kartNo.length; x++)
        {
            kartlar[i * 13 + x] = kartTur[i] + "-" + kartNo[x];
        }    
    }
	  return kartlar;
	}
//SayiUret Methodu
// Birbirinden farkl� 52 ye kadar 5 farkl� say� uretir.
// geriye int dizi �eklinde �retti�i say�lar� d�nd�r�r
public static int[] sayiUret(int Sayi)		//SayiUret Method
{
	int[] uretilenler = new int[5*Sayi];
	
	for(int i=0; i<uretilenler.length;)
	{
		boolean kontrol = true;
		int uretilen = rndm.nextInt(52);
		for(int j=0; j<uretilenler.length; j++)
		{
			if(uretilen == uretilenler[j])
			{
				kontrol = false;
				break;
			}
		}
		if(kontrol == true)
		{
			uretilenler[i] = uretilen;
			i++;
		}
	}
	return uretilenler;
}
//oyuncuKartlar Methodu
// uretilen 52 lik ka��t destesi ile �retilen 5 farkl� say�y� birle�tirir
// �al��ma mant��� �udur... 5 farkl� say�y� 52lik destenin i�inden se�ip oyuncuKartlar String dizisine atar
// elimizde Ma�a - 5 , Karo - K�z gibi 5 farkl� kombinasyon bulunur...
public static String[] oyuncuKartlar(String[] dizi,int[] sayilar,int sayi)	//oyuncuKartlar Method
	{
		String[] oyuncuKartlar = new String[sayilar.length];
		for(int i = 0; i<sayi*5; i++)
		{
			oyuncuKartlar[i] = dizi[sayilar[i]];	
		}
		return oyuncuKartlar;
	}
//Fatih Y�ld�zhan
//fatih@yildizhanlar.com
//www.fatihyildizhan.com
}
