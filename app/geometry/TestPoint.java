package com.app.geometry;

import java.lang.Math;
import java.util.Scanner;


class Point2D {
  
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    public boolean isEqual(Point2D otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }
    
    public double calculateDistance(Point2D otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x and y for point 1:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.print("Enter x and y for point 2:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
		System.out.println("Point 1: "+p1.getDetails());
		System.out.println("Point 2: "+p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("Both points are at same location");
		}
		else {
			System.out.println("Points are different");
			double distance = p1.calculateDistance(p2);
			System.out.println("Distance : "+distance);
		}
		sc.close();
		
	}

}
