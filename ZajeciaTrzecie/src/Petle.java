public class Petle {
	public static void main (String [] args){
		for(int i=0 ; i<10; i++){
			System.out.println("[i=" +i+"]Kolo Java");
		}
		int i=0;
		while(i<10){
			System.out.println("Kolo Java2");
			i++;
		}
		int licznik =0;
		do{
			System.out.println("To jest petla");
			licznik++;
		}
		while (licznik <10);
		System.out.println("Koniec petli ");
		
		int []tab ={1,2,5,4,7,8,9,5,4,7,5,4};
		for(int val: tab){
			System.out.println(val);
		}
		
	}
}
