/* 
Pattern8
E E E E E
D D D D D
C C C C C
B B B B B
A A A A A   */

class Pattern8{
	public static void main(String[] args) {
		
		char Alp = 'E';

		for (int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++){
				System.out.print(Alp + " ");
			}
			Alp--;
			System.out.println();
		}
	}
}