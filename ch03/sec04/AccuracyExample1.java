package ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int totalPieces = 10;
		int piecesToEat = 7;
		
		int remainingPieces = totalPieces - piecesToEat;
		System.out.println("10조각에서 남은 조각: " + remainingPieces);
		
		double apple = 1.0;
		double pieceUnit = 0.1;
		
		double result = apple - piecesToEat * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}
}