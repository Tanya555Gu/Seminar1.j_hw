// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        task0();
    }
    static void task0(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n -> ");
        int n = scanner.nextInt();
        scanner.close();
        int triang_num = 0;
        int triang_num_fact = 1;
        for (int i = 1; i <= n; i++) {
            triang_num += i;
            triang_num_fact *= i;
        }
        System.out.println("n-ое треугольное число равно -> " + triang_num);
        System.out.println("n! равно -> " + triang_num_fact);
    }
}