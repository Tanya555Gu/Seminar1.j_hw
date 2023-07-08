// Реализовать простой калькулятор
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a -> ");
        int a = scanner.nextInt();
        System.out.print("Введите число b -> ");
        int b = scanner.nextInt();
        System.out.println("Введите номер интересующей операции:");
        System.out.println("1 -> сложение,"); 
        System.out.println("2 -> вычитание,");
        System.out.println("3 -> умножение,");
        System.out.println("4 -> деление");
        System.out.print("Укажите интересующий пункт меню -> ");
        int choice = scanner.nextInt();
        scanner.close();
        if (choice == 1){
            System.out.print(a + " + " + b + " = " + getSum(a, b));
        }
        else if(choice == 2){
            System.out.print(a + " - " + b + " = " + getDif(a, b));
        } 
        else if (choice == 3){
            System.out.print(a + " * " + b + " = " + getMult(a, b));
        }
         else if (choice == 4){
            System.out.print(a + " / " + b + " = " + getDiv(a, b));
        }
        else {
            System.out.println("Неверный запрос");
          }
        }
    
    static int getSum(int a, int b){
        return a + b;
    }
    static int getDif(int a, int b){
        return a - b;
    }
    static int getMult(int a, int b){
        return a * b;
    }
    static double getDiv(int a, int b){
        return (double) a / (double) b;
    }

}
