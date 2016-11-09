public class Warunki {
	public static void main(String[]args){
		int liczbaA=15;
		if(liczbaA>=2){
			System.out.println("Liczba jest wieksza od 2 lub jest rowna 2");
		}else{
			System.out.println("Liczba jest mniesjza od 2");
		}
		int liczbaB=-5;
		if(liczbaB > 0){
			if(liczbaB < 5){
				System.out.println("Liczba jest wieksza od 0 ale mniejsza od 5");
			}else{
				System.out.println("Wieksza od 5");
			}
		}else{
			System.out.println("Liczba jest mniejsza od 0");
		}
		int liczbaC =10;
		switch(liczbaC){
		case 25:
			System.out.println("liczba = 25");
			break;
		case 10: 
			System.out.println("liczba = 10");
			break;
		default:
			System.out.println("zmienna nie jest rowna ani 25 ani 10");
		}
		 int liczba1 = 2;
		 int liczba2 = liczba1<5 ? -1:1;
		 System.out.println(liczba2);
	}
}
