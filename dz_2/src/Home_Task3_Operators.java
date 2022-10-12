import java.util.Scanner;
import java.lang.*;

public class Home_Task3_Operators {
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        {
            //Завдання №1:
            int a = 10, b = 5;
            int Sum = a + b;
            int Mnozh = a * b;
            int Dil = a / b;
            int Modulus = a % b;
            System.out.println("Задані числа: 10, 5");
            System.out.println("Сума: = " + Sum);
            System.out.println("Множення: = " + Mnozh);
            System.out.println("Ділення: = " + Dil);
            System.out.println("Залишок двох чисел: = " + Modulus);
        }
            System.out.println();
        {
            //Завдання №2:
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть будь-яке число, щоб перетворити його у двійкове: ");
            int x = sc.nextInt();
            System.out.println("Двійкова: " + Integer.toBinaryString(x));
        }
            System.out.println();
        {
            //Завдання №3:
            System.out.println("Введіть два цілих числа:");
            Scanner myScanner = new Scanner(System.in);
            int i = myScanner.nextInt();
            int i1 = myScanner.nextInt();
            if (i < i1) {
                System.out.println(i + " менше за " + i1);
            } else if (i > i1) {
                System.out.println(i + " більше за " + i1);
            } else {
                System.out.println("Задані числа рівні між собою");
            }
            System.out.println();
        }
            System.out.println();


        {
            //Завдання №4
            int s = 0;
            System.out.println("Ряд перших 10 натуральних чисел: ");
            for(int o = 1; o <= 10; o++){
                s += o;
                System.out.print(o + " ");
            }
                System.out.println();
                System.out.println("Sum is: " + s);
        }
            System.out.println();
        {
            //Завдання №5
            System.out.println("Введіть будь-яке число, для отримання суми цифр:");
            Scanner Scan = new Scanner(System.in);
            int summary = 0;
            int y;
            for(y = Scan.nextInt(); y != 0; y /= 10)
            {
                summary += (y % 10);
            }
            System.out.println(summary + " ");
        }
        {
            //Завдання №6
            System.out.println("Введіть будь-яке число, щоб отримати факторіал:");
            Scanner Fact = new Scanner(System.in);
            int j = Fact.nextInt();
            System.out.println("Результат: " + calculateFactorial(j));
        }
        }
}




