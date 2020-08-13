/*
A B C D E
A B C D
A B C
A B
A

*/

class Pattern19{
	public static void main(String[] args) {

		char Alp = 'A';
		
		for (int i =1; i<=5; i++) {
			for (int j = i; j<=5; j++) {
				System.out.print(Alp + " ");
				Alp++;
			}
			Alp = 'A';
			System.out.println();
		}
	}
}