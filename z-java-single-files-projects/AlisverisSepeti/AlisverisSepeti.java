import java.util.Scanner;


public class AlisverisSepeti 
{
	public static void main(String[] args)
	{
		String[][] sepet = new String[10][4];
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		
		while(counter < 10) //for(; counter < 10; counter++)
		{
			System.out.println("Se�iminizi giriniz. ��kmak i�in 0'a bas�n�z.");
			System.out.println("et\nsut\nyogurt\ndergi");
			String choice = sc.next();
			if(choice.equals("0"))
				break;
			int birim = BirimFiyatBul(choice);
			if(birim == 0) //yanl�� se�im yap�ld�ysa
			{
				System.out.println("Yanl�� �r�n girdiniz.");
				continue;
			}
			System.out.println("Ne kadar olsun?");
			double miktar = sc.nextDouble();
			SepeteEkle(sepet, counter, choice, miktar, birim);
			counter++;
		}
		SepetiHesapla(sepet);
	}
	
	/*
	 * Kullan�c�n�n girdi�i et, sut, yogurt, dergi
	 * String'ini eldeki array'le kar��la�t�rarak birim fiyat�n� return eder.
	 * E�er kullan�c� elde olmayan bir �r�n girdiyse 0 d�nd�r�r.
	 */
	public static int BirimFiyatBul(String c)
	{
		String[][] urunler = 
		{ {"et", "8"}, 
				{"sut", "5"}, 
				{"yogurt", "4"}, 
				{"dergi", "3"} };
		
		for(int i = 0; i < urunler.length; i++)
		{
			if(urunler[i][0].equals(c))
				return Integer.parseInt(urunler[i][1]);
		}
		return 0;		
	}

	/*
	 * Gelen sepetin gelen index'teki sat�r�na gelen se�imi,
	 * gelen miktar�, birim fiyat�n� ve �r�n�n toplam tutar�n� 
	 * girer.
	 */
	public static void SepeteEkle(String[][] sepet, 
			int index, String secim, double miktar, int birimfiyat)
	{
		sepet[index][0] = secim; //�r�nad�
		sepet[index][1] = miktar + ""; //�r�n miktar�
		sepet[index][2] = birimfiyat + ""; //�r�n�n birim fiyat�
		sepet[index][3] = miktar * birimfiyat + ""; //�r�n�n toplam tutar�
	}
	
	/*
	 * Sepetteki �r�nlerin toplam�n� (3. s�tunlar�n toplam�) ve
	 * al�nan �r�nlerin d�k�m�n� bast�r�r.
	 */
	public static void SepetiHesapla(String[][] sepet)
	{
		double toplam = 0;
		
		for(int i = 0; i < sepet.length; i++)
		{
			//e�er �r�n eklenmemi�se d�ng�y� durdur.
			if(sepet[i][0] == null || sepet[i][0].equals(""))
				break;
			toplam += Double.parseDouble(sepet[i][3]);
			for(int j = 0; j < sepet[i].length; j++)
			{
				System.out.print(sepet[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Al��veri�iniz toplam " + toplam + " TL tutmu�tur.");
	}
	
}
