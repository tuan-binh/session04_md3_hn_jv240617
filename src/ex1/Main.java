package ex1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle(); // 1 ô nhớ @123123
		Circle circle2 = new Circle(3f,"red"); // 1 ô nhớ @312432
		circle.inputData(sc);
		circle.displayData();
		circle2.displayData();
		

	}
}
