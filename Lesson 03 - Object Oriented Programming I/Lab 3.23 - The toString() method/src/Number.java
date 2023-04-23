public class Number {
   private int num;
   
   public Number(int n) {
      num = n;
   }

   public String toString() {
      Integer newNum = this.num;
      String output = "The value is " + newNum.toString();
      return output;
   }
   
   public int getNum() {
      return num;
   }
   
   public void setNum(int n) {
      num = n;
   }

   public static void main(String [] args) {
      Number yourNum = new Number(723);
      System.out.print(yourNum);
   }
}