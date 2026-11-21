import java.util.Scanner;
//import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int testCase = sc.nextInt(); 
		
		for(int tc = 1; tc <= testCase; tc++) {
			int huddleCount = sc.nextInt();
			int upLevel = 0, downLevel = 0;
			int prevHuddle = sc.nextInt();
			
			for(int i = 1; i < huddleCount; i++) {
				int nextHuddle = sc.nextInt();
				if (prevHuddle < nextHuddle) {
					upLevel = upLevel < (nextHuddle - prevHuddle) ? (nextHuddle - prevHuddle) : upLevel;
				} else if (prevHuddle > nextHuddle) {
					downLevel = downLevel < (prevHuddle - nextHuddle) ? (prevHuddle - nextHuddle) : downLevel;
				}
				prevHuddle = nextHuddle;
			}
			System.out.printf("#%d %d %d\n", tc, upLevel, downLevel);
		}
	}
}