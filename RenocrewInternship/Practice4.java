import java.util.Scanner;

class RectOperations {
  int width;
  int height;
  int perimeter;
  int area;

  public int peri(int width, int height) {
    perimeter = 2 * (width + height);
    return perimeter;
  }

  public int areaOfReact(int width, int height) {
    area = width * height;
    return area;
  }

}

public class Practice4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter width of rectangle : ");
    int w = sc.nextInt();
    System.out.println("Enter height of rectangle : ");
    int h = sc.nextInt();
    sc.close();
    RectOperations rect = new RectOperations();
    System.out
        .println("Perimeter of Rectangle is " + rect.peri(w, h) + " and area of rectangle is "
            + rect.areaOfReact(w, h));

  }

}