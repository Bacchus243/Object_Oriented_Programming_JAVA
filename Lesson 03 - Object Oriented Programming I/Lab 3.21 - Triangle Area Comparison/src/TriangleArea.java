import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      double t1Base = scnr.nextDouble();
      double t1Height = scnr.nextDouble();
      
      triangle1.setBase(t1Base);
      triangle1.setHeight(t1Height);
      
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      double t2Base = scnr.nextDouble();
      double t2Height = scnr.nextDouble();
      
      triangle2.setBase(t2Base);
      triangle2.setHeight(t2Height);
      
      System.out.println("Triangle with smaller area:");
      
      // TODO: Determine smaller triangle (use getArea())
      double areaT1 = triangle1.getArea();
      double areaT2 = triangle2.getArea();
      
      //int smallerTriangle;
      
      if(triangle1.getArea() < triangle2.getArea()) {
         triangle1.printInfo();
      }
      else {
         triangle2.printInfo();
      }
      
      
      
      //       and output smaller triangle's info (use printInfo())
      
   }
}
