/* 
Pattern5
A B C D E
A B C D E 
A B C D E
A B C D E
A B C D E */


class Pattern5{
	public static void main(String[] args) {
		
		char Alp = 'A';

		for(int i = 1; i <=5; i++){
			for(int j =1; j <=5; j++){
				System.out.print(Alp + " ");
				Alp++;
			}
			Alp = 'A';
			System.out.println();
		}
	}
}