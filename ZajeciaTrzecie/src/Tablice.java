public class Tablice {
	public static void main(String[]args){
		int [] tab = new int [100]; //pierwszy sposob tworzenia tablicy
		tab[2]=19;
		System.out.println(tab[2]);
		int [] tab1 ={1,2,7,8};
		System.out.println(tab1[1]);
		
		int[]tab2 = new int[30];
		for(int i=1 ;i<30;i++){
			tab2[i]=i;
		System.out.println(tab2[i]);
		}
		double [] pomiary = {1.0,21.5,5.6,3.14,2.7,8.9};
		for(int i=0 ; i<pomiary.length;i++){
			System.out.println("indeks: "+i+" "+"wartosc"+" "+pomiary[i]);
		}
		int []k=new int[2];
		k[15]=8;
		System.out.println(k[15]);
	}
}
