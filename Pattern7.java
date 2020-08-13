/*
Pattern7
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1  */

class Pattern7{
	public static void main(String[] args) {
		
		int num = 5;

		for(int i = 1; i<= 5; i++){
			for (int j = 1; j <=5 ;j++) {
				System.out.print(num + " ");
				num--;
			}
			num = 5;
			System.out.println();
		}
	}
}