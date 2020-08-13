/*
Pattern18
A A A A A
B B B B
C C C 
D D 
E 

*/

class Pattern18 {
	public static void main(String[] args) {

		char Alp = 'A';
		for (int i = 1; i<=5 ; i++) {
			for (int j = i; j<=5; j++ ) {
				System.out.print(Alp + " ");
			}
			Alp++;
			System.out.println();
		}
	}
}