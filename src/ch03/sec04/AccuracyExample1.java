package ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple =10;
		int pieceUnit = 1;
		int number = 7;
		
		int remain = apple - number* pieceUnit;
		System.out.println(remain);
		double result = (double)remain/10;
		System.out.println("사과 1개에서 남은 양: " + result);
	}
}