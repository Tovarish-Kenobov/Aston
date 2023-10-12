import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String name = scanner.next();
       if (name.equals("Вячеслав")) {
           System.out.println("Привет, Вячеслав");
       } else {
           System.out.println("Нет такого имени");
       }
   }
}
