import java.util.Scanner;

class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for (int tc = 1; tc <= testCase; tc++) {
			int [] earnings = new int [sc.nextInt()];
			double sum = 0;
			
			for (int i = 0; i < earnings.length; i++) {
				int earn = sc.nextInt();
				earnings[i] = earn;
				sum += earn;
			}
			
			int underCount = 0;
			double avg = sum / earnings.length;
			
			for (int i = 0; i < earnings.length; i++) {
				underCount += (earnings[i] <= avg) ? 1 : 0;
			}
			
			System.out.printf("#%d %d\n", tc, underCount);
		}
	}
}