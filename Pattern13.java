/*
Pattern13
A
B B 
C C C
D D D D
E E E E E
*/

class Pattern13{
	public static void main(String[] args) {
		char Alp = 'A';

		for (int i = 1;i<=5 ; i++ ) {
					for (int j = 1; j<=i ; j++ ) {
						System.out.print(Alp + " ");
					}
					Alp++;
					System.out.println();
				}		
	}
}