// Вывести все простые числа от 1 до 1000

public class task_2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = stringBuilder.append("1");
        for (int i = 2; i <= 1000; i++){
            if (simpNum(i))
            stringBuilder = stringBuilder.append(", ").append(i);
        }  
        System.out.print(stringBuilder);   
    }
    static boolean simpNum(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}


