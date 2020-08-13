/*
Pattern14
A 
A B
A B C
A B C D
A B C D E
*/

class Pattern14{
	public static void main(String[] args) {
		
		char Alp = 'A';

		for (int i = 1; i<=5 ; i++ ) {
			for (int j =1; j<=i; j++) {
				System.out.print(Alp +  " ");
				Alp++;
			}
			Alp = 'A';
			System.out.println();
		}
	}
}