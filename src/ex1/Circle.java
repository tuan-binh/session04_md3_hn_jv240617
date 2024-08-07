package ex1;

import java.util.Scanner;

public class Circle
{
	
	private float radius;
	private String color;
	
	public Circle()
	{
	}
	
	public Circle(float radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	public float getRadius()
	{
		return radius;
	}
	
	public void setRadius(float radius)
	{
		this.radius = radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * this.radius;
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public void inputData(Scanner scanner)
	{
		System.out.println("Nhập vào radius: ");
		this.radius = Float.parseFloat(scanner.nextLine());
		System.out.println("Nhập vào màu sắc: ");
		this.color = scanner.nextLine();
	}
	
	public void displayData()
	{
		System.out.printf("radius: %.3f color: %s perimeter: %.3f area: %.3f\n", radius, color, getPerimeter(), getArea());
	}
	
	
}
