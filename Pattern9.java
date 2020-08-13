/* 
Pattern9
E D C B A
E D C B A 
E D C B A
E D C B A
E D C B A */

class Pattern9{
	public static void main(String[] args) {
		
		char Alp = 'E';

		for (int i =1; i<=5; i++){
			for (int j = 1; j<=5; j++){
				System.out.print(Alp + " ");
				Alp--;
			}
			Alp = 'E';
			System.out.println();
			
		}
	}
}