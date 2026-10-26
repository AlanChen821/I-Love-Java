package basics;

import java.util.Scanner;

/**
 * 參考答案請見 IfElseAnswer.java
 */
public class IfElseQuestion {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi! My Dear Dani, welcome to my Java homework project.");

        question1();
//        question2();
//        question3();
//        question4();
    }

    //  Q1 : 請輸入一個整數 a, 判斷是否大於 10. 若 a 大於 10 則輸出 "true"; 否則輸出 "false".
    //  ex 1 : 輸入 a = 12, 輸出 "true"
    //  ex 2 : 輸入 a = 8 , 輸出 "false"
    //  ex 3 : 輸入 a = 10, 輸出 "false"
    private static void question1() {
        System.out.println("\n第一題 : \n請輸入一個數字 a, 判斷是否大於 10.");
        System.out.println("請輸入數字 a : ");
        int a = scanner.nextInt();

        // 請將答案寫在這裡

    }

    //  Q2 : 請輸入一個整數 a, 判斷是否大於 10. 若 a 大於 10 則輸出 "a > 10"; 若 a < 10 則輸出 "a < 10"; 若 a 剛好等於 10 則輸出 "a = 10".
    //  ex 1 : 輸入 a = 12, 輸出 "a > 10"
    //  ex 2 : 輸入 a = 8 , 輸出 "a < 10"
    //  ex 3 : 輸入 a = 10, 輸出 "a = 10"
    private static void question2() {
        System.out.println("\n第二題 : \n請輸入一個數字 a, 判斷 a 是大於 10, 小於 10 或等於 10.");
        System.out.println("請輸入數字 a : ");
        int a = scanner.nextInt();

        // 請將答案寫在這裡

    }

    //  Q3 : 請輸入兩個整數 a 和 b, 判斷當 a > b , 輸出 "a 大於 b" ; 若 a < b , 輸出 " a 小於 b "; 若 a 和 b 相等 , 則輸出 " a 等於 b ".
    //  ex 1 : 輸入 a = 5 , b = 3, 則輸出 : "a > b"
    //  ex 2 : 輸入 a = 3 , b = 5, 則輸出 : "a < b"
    //  ex 3 : 輸入 a = 2 , b = 2, 則輸出 : "a = b"
    private static void question3() {
        System.out.println("\n第三題 : 請輸入兩個整數 a 和 b 並比較它們的大小.");

        System.out.println("請輸入第一個數字 a");
        int a = scanner.nextInt();
        System.out.println("請輸入第二個數字 b");
        int b = scanner.nextInt();

        // 請將答案寫在這裡

    }

    //  Q4 : 請輸入三個整數 a, b 和 c, 判斷當 a 加 b 的總和大於 c, 輸出 "a + b > c" ; 若 a 加 b 的總和小於 c , 輸出 "a + b < c"; 若 a 加 b 的總和等於 c , 則輸出 "a + b = c".
    //  ex 1 : 輸入 a = 5 , b = 3, c = 6 , 則輸出 : "a + b > c"
    //  ex 2 : 輸入 a = 3 , b = 5, c = 10, 則輸出 : "a + b < c"
    //  ex 3 : 輸入 a = 2 , b = 2, c = 4,  則輸出 : "a + b = c"
    private static void question4() {
        System.out.println("\n第四題 : 請輸入三個整數 a, b 和 c, 判斷當 a 加 b 的總和與 c 的大小.");
        System.out.println("請輸入第一個數字 a");
        int a = scanner.nextInt();
        System.out.println("請輸入第二個數字 b");
        int b = scanner.nextInt();
        System.out.println("請輸入第三個數字 c");
        int c = scanner.nextInt();

        // 請將答案寫在這裡

    }
}
