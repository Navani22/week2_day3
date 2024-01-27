package week2_day3;

import java.util.Scanner;

class CircleOperations {
  float radii;
  float perimeter;
  float area;

  public float peri(float radii) {
    perimeter = 2 * 3.14f * radii;
    return perimeter;
  }

  public float area(float radii) {
    area = 3.14f * radii * radii;
    return area;
  }

}

public class Practice6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radii of the circle : ");
    float r = sc.nextFloat();

    sc.close();
    CircleOperations circle = new CircleOperations();
    System.out
        .println("Perimeter of circle is " + circle.peri(r) + " and area of circle is "
            + circle.area(r));

  }

}
