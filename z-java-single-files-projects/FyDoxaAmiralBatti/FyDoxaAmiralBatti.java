import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class FyDoxaAmiralBatti 
{
	// Oyun Ad� : Amiral Batt�
	// Oyun 10X10 Matristen olu�maktad�r , 2 adet 2'li 1 adet 3'l� gemi bulunmaktad�r...
	// Oyun ��kt� olarak toplam hamle say�s� , Iska say�s�, �sabet say�s� ve her gemi batt���nda gemiye ait bilgi vermektedir...
	// �yi E�lenceler... ;)
	public static void main(String[] args) 
	{
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 10X10 luk matris'in tan�mlanmas�
		String[][] places = new String[10][10];
		
		// Geminin matris'te yerle�tirilmesinde kullan�lan de�erler..
		// Gemi 2 li ise krdnt Gemi 3 l� ise krdnt2 deki de�erler kullan�l�r..
		int[] krdnt={-1,1};
		int[] krdnt2={-2,2};
		
		// E�er t�m gemiler d�zg�n bir �ekilde yerle�tirilemediyse ��lem tekrarlan�r...
		// Batan Gemi say�lar� kullan�c�ya bilgi ama�la saklan�r...
		// �sabet Say�s�,Iska Say�s� ve Toplam Hamle Say�s� saklan�r...
		int gemilerYerlestiMi=0;
		int batanGemiSayisi=0;
		int isabet=0;
		int iska=0;
		int hamle=0;
		
		// Birinci 2'li geminin kordinat ve Batma Durumunu tutan de�i�kenler ve boolean de�i�keni 
		boolean gemiBatti1=false;
		int gemi1x1;
		int gemi1y1;
		int gemi1x2;
		int gemi1y2;
		
		// �kinci 2'li geminin kordinat ve Batma Durumunu tutan de�i�kenler ve boolean de�i�keni
		boolean gemiBatti2=false;
		int gemi2x1;
		int gemi2y1;
		int gemi2x2;
		int gemi2y2;
		
		// Birinci 3'l� geminin kordinat ve Batma Durumunu tutan de�i�kenler ve boolean de�i�keni
		boolean gemiBatti3=false;
		int gemi3x1;
		int gemi3y1;
		int gemi3x2;
		int gemi3y2;
		int gemi3x3 = 0;
		int gemi3y3 = 0;
		
		//Kar��lama Sat�r�....
		System.out.println("Amiral Batt� Oyununa Ho�geldiniz...\n �yi E�lenceler...\nBa�lamak i�in '1' giriniz.");
		int start=sc.nextInt();
		if(start==1)
		{}
		else
		{
			System.out.println("Yine Bekleriz...");
			return;
		}
		
		// While d�ng�s�nde gemiler matris'e yerle�tirilirler sonsuz d�ng�n�n sebebi ise 
		// baz� hatalardan dolay� gemiler yerle�tirilemediyse i�lemin tekrarlanmas�
		while(1==1)
		{
			// Matris'in elemanlar� "." ile doldurulur...
			// While'�n i�inde olma sebebi ise herhangi bir gemi yerle�tirilmediyse i�lem tekrarland���nda yerle�en gemileri silmek...
			for(int i=0;i<places.length;i++)
			{
				for(int j=0;j<places[i].length;j++)
				{
					places[i][j]=".";
				}
			}
			
			// Birinci 2'li geminin rastgele matris'e yerle�tirilmesi
			gemi1x1=r.nextInt(places.length-1);
			gemi1y1=r.nextInt(places.length-1);
			
			int which = r.nextInt(2);  // bu sat�rda geminin sat�rdam� kolondam� yer alaca�� belirlenir...
			int durum = r.nextInt(2); // geminin sat�rda ise sa�am� solam� kolonda ise a�a�am� yukar�m� olaca�� belirlenir..
			
			gemi1x2=gemi1x1;
			gemi1y2=gemi1y1;
			
			if(which==1)
			{
				gemi1x2=gemi1x1+krdnt[durum];
			}
			else
			{
				gemi1y2=gemi1y1+krdnt[durum];
			}
			
			if(gemi1x2<=places.length-1&&gemi1y2<=places.length-1) // E�er geminin tamam� matrisler i�erisindeyse gemi yerle�tirilir...
			{
				places[gemi1x1][gemi1y1]="@";
				places[gemi1x2][gemi1y2]="@";
				gemilerYerlestiMi++;
			}
			
			// �kinci 2'li geminin rastgele matris'e yerle�tirilmesi
			gemi2x1=r.nextInt(places.length-1);
			gemi2y1=r.nextInt(places.length-1);
			
			which = r.nextInt(2);
			durum = r.nextInt(2);
			
			gemi2x2=gemi2x1;
			gemi2y2=gemi2y1;
			
			if(which==1)
			{
				gemi2x2=gemi2x1+krdnt[durum];
			}
			else
			{
				gemi2y2=gemi2y1+krdnt[durum];
			}
			if(gemi2x2<=places.length-1&&gemi2y2<=places.length-1&&places[gemi2x1][gemi2y1]=="."&&places[gemi2x2][gemi2y2]==".")
			{
				places[gemi2x1][gemi2y1]="@";
				places[gemi2x2][gemi2y2]="@";
				gemilerYerlestiMi++;
			}
			// Birinci 3'l� geminin rastgele matris'e yerle�tirilmesi 
			gemi3x1=r.nextInt(places.length-1);
			gemi3y1=r.nextInt(places.length-1);
			
			which = r.nextInt(2);
			durum = r.nextInt(2);
			
			gemi3x2=gemi3x1;
			gemi3y2=gemi3y1;
			
			gemi3x3=gemi3x1;
			gemi3y3=gemi3y1;
			
			if(which==1)
			{
				gemi3x3=gemi3x1+krdnt[durum];
				gemi3x2=gemi3x1+krdnt2[durum];
			}
			else
			{
				gemi3y3=gemi3y1+krdnt[durum];
				gemi3y2=gemi3y1+krdnt2[durum];
			}
			
			if(gemi3x2<=places.length-1&&gemi3y2<=places.length-1&&places[gemi3x1][gemi3y1]=="."&&places[gemi3x2][gemi3y2]=="."&&places[gemi3x3][gemi3y3]==".")
			{
				places[gemi3x1][gemi3y1]="@";
				places[gemi3x2][gemi3y2]="@";
				places[gemi3x3][gemi3y3]="@";
				gemilerYerlestiMi++;
			}
			
			// E�er t�m gemiler ba�ar�yla yerle�tilerse oyun ba�lar...
			if(gemilerYerlestiMi>=3)
			{
				break;
			}
			else // aksi halde i�lem tekrarlan�r...
			{
				gemilerYerlestiMi=0;
			}
		}
		
		// S�ra kullan�c�da ... Sat�r ve S�t�n say�lar�n� girerek gemilerin yerlerini tahmin etmeye �al���r...
		for(int i=0;i<places.length*places.length;i++)
		{
			try // Say� haricinde bir de�er girdi�i takdirde program catch blo�una d��ecektir...
			{
				System.out.print("Sat�r Numaras� Giriniz: ");
				int row=sc.nextInt()-1;
				System.out.print("S�tun Numaras� Giriniz: ");
				int column=sc.nextInt()-1;
				
				// E�er matris boyutunun d���nda de�er girerse uyar� al�p Tekrar yeni de�erler istenecektir...
				if(row<=places.length-1&&column<=places.length-1) 
				{
					hamle++;
					if(places[row][column]!=".") // E�er kullan�c� herhangi bir gemiye isabet ettirirse
					{
						System.out.println("\nahanda kafas� yar�ld� ;)\n");
						places[row][column]="#";
					}
					else // Tabi bide �skalama �ans� var :)))
					{
						System.out.println("\nIskaa...:P\n");
						places[row][column]="x";
						iska++;
					}
					
					// E�er kullan�c� herhangi bir gemiye isabet ettirirse koordinattaki "." de�er "#" ile de�i�tirilir...
					for(int m=0;m<places.length;m++)
					{
						for(int j=0;j<places[m].length;j++)
						{
							System.out.print(places[m][j]+" ");
							if(places[m][j]=="#")
							{
								isabet++;
							}
						}
						System.out.println();
					}
					
					// E�er t�m gemiler bat�r�lm�� ise Oyun Biter ve ekranda t�m bilgiler listelenir...
					if(isabet>=7)
					{
						System.out.print("\nTebrikler b�t�n gemileri vurdunuz...");
						System.out.print("\nToplam At�� Say�n�z: "+hamle);
						System.out.print("\nToplam Iska Say�n�z: "+iska);
						System.out.print("\nToplam �sabet Say�n�z: "+isabet);
						break;
					}
					
					// E�er birinci 2'li gemi bat�r�l�rsa...
					else if(places[gemi1x1][gemi1y1]=="#"&&places[gemi1x2][gemi1y2]=="#"&&gemiBatti1==false)
					{
						batanGemiSayisi++;
						System.out.println("\nTebrikler..�uana kadar '"+batanGemiSayisi+"' tane Gemiyi Bat�rd�n�z...");	
						gemiBatti1=true;
					}
					
					// E�er ikinci 2'li gemi bat�r�l�rsa...
					else if(places[gemi2x1][gemi2y1]=="#"&&places[gemi2x2][gemi2y2]=="#"&&gemiBatti2==false)
					{
						batanGemiSayisi++;
						System.out.println("\nTebrikler..�uana kadar '"+batanGemiSayisi+"' tane Gemiyi Bat�rd�n�z...");
						gemiBatti2=true;
					}
					
					// E�er birinci 3'l� gemi bat�r�l�rsa...
					else if(places[gemi3x1][gemi3y1]=="#"&&places[gemi3x2][gemi3y2]=="#"&&places[gemi3x3][gemi3y3]=="#"&&gemiBatti3==false)
					{
						batanGemiSayisi++;
						System.out.println("\nTebrikler..�uana kadar '"+batanGemiSayisi+"' tane Gemiyi Bat�rd�n�z...");
						gemiBatti3=true;
					}
					else
					{}	
					isabet=0;
				}
				else // Kullan�c� ge�ersiz koordinat girdi�inde g�sterilecek hata mesaj�...
				{
					System.out.println("L�tfen Ge�erli Koordinat Giriniz...");
				}
			}
			catch(InputMismatchException Ex) // Say� haricinde girilecek bir de�er i�in g�sterilecek hata mesaj�...
			{
				System.out.println("L�tfen koordinatlar� say� olarak giriniz..");
			}
		}
	}
	//Fatih Y�ld�zhan
	//fatih@yildizhanlar.com
	//www.fatihyildizhan.com
}
