import java.util.Scanner;

class SquareOperations {
  int sides;
  int area;
  int perimeter;

  public int peri(int side) {
    perimeter = 4 * side;
    return perimeter;
  }

  public int areaOfSquare(int side) {
    area = side * side;
    return area;
  }

}

public class Practice3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Side of square : ");
    int n = sc.nextInt();
    sc.close();
    SquareOperations squ = new SquareOperations();
    System.out.println("Perimeter of Square is " + squ.peri(n) + " and area of square is " + squ.areaOfSquare(n));

  }

}