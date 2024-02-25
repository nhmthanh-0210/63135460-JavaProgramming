package lab3;

public class bai2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương của " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
	}

}
