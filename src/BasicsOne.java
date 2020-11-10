import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicsOne {
    //1. Write a Java program to print 'Hello' on screen and then print your name on a separate line
//    public static void main(String[] args) {
//        System.out.println("Hello" + "\nTudor Andrei");
//    }

    //2.Write a Java program to print the sum of two numbers
//    public static void main(String[] args) {
//        int a = 6;
//        int b = 3;
//        System.out.println(a/b);
//    }

    //3.Write a Java program to print the sum of two numbers.
    //   public static void main(String[] args) {
//        int a = 2;
//        int b = 33;
//        System.out.println(a+b);
//   }

    //4.Write a Java program to print the result of the following operations. Go to the editor
    //Test Data:
    //a. -5 + 8 * 6
    //b. (55+9) % 9
    //c. 20 + -3*5 / 8
    //d. 5 + 15 / 3 * 2 - 8 % 3

//    public static void main(String[] args) {
//        System.out.println(-5 + 8 * 6);
//        System.out.println((55 + 9) % 9);
//        System.out.println(20 + (-3 * 5) / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
//    }
//

    //5. Write a Java program that takes two numbers as input and display the product of two numbers

//    public static int multiplyNumbers(int a, int b) {
//        return a * b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(multiplyNumbers(25, 5));
//    }

    //6.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

//    public static void doMath(int a, int b){
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//    }
//
//    public static void main(String[] args) {
//        doMath(125,24);
//    }

    //7.Write a Java program that takes a number as input and prints its multiplication table upto 10.
//    public void doStuff() {
//        System.out.println("Please enter a number");
//        Scanner sc = new Scanner(System.in);
//        int temp = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(temp * i);
//        }
//    }
//
//    public static void main(String[] args) {
//        new BasicsOne().doStuff();
//
//    }

    //8.Write a Java program to display the following pattern.
    //
    //Sample Pattern :
    //
    //   J    a   v     v  a
    //   J   a a   v   v  a a
    //J  J  aaaaa   V V  aaaaa
    // JJ  a     a   V  a     a

//    public static void main(String[] args) {
//
//        System.out.println("   J    a   v     v  a");
//        System.out.println("   J   a a   v   v  a a");
//        System.out.println("J  J  aaaaa   v v  aaaaa");
//        System.out.println(" JJ  a     a   v  a     a");
//
//    }

    //9.Write a Java program to compute the specified expressions and print the output

//    public static void main(String[] args) {
//        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
//    }

    //11. Write a Java program to print the area and perimeter of a circle

//    public static double calculateRadius(double a){
//        return 2*3.14*a;
//    }
//
//    public static double calculateArea(double a){
//        return 3.14*a*a;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(calculateArea(7.5));
//        System.out.println(calculateRadius(7.5));
//
//    }

    //12.Write a Java program that takes three numbers as input to calculate and print the average of the numbers

//    public List doStuff() {
//        int one, two, three;
//        List<Integer> numbers = new ArrayList<Integer>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter the first number");
//        one = sc.nextInt();
//        System.out.println("please enter the second number");
//        two = sc.nextInt();
//        System.out.println("please enter the third number");
//        three = sc.nextInt();
//        numbers.add(one);
//        numbers.add(two);
//        numbers.add(three);
//
//        return numbers;
//    }
//
//    public static int calculateMean(List<Integer> list){
//        int count = 0;
//        for(int i=0;i<list.size();i++){
//            count += list.get(i);
//        }
//        return count/list.size();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(calculateMean(new BasicsOne().doStuff()));
//    }

    //13. Write a Java program to print the area and perimeter of a rectangle.

//    public static double calculateArea(double width, double height) {
//        return width * height;
//    }
//
//    public static double calculatePerimeter(double width, double height){
//        return 2*(width+height);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(calculateArea(5.5,8.5));
//        System.out.println(calculatePerimeter(5.5,8.5));
//    }

    //14.Write a Java program to print an American flag on the screen

//    public static void main(String[] args) {
//        System.out.println("* * * * * * ================================== ");
//        System.out.println("* * * * *  ================================== ");
//        System.out.println("* * * * * * ================================== ");
//        System.out.println("* * * * *  ================================== ");
//        System.out.println("* * * * * * ================================== ");
//        System.out.println("* * * * *  ================================== ");
//        System.out.println("* * * * * * ================================== ");
//        System.out.println("* * * * *  ================================== ");
//        System.out.println("* * * * * * ================================== ");
//        System.out.println("============================================== ");
//        System.out.println("============================================== ");
//        System.out.println("============================================== ");
//        System.out.println("============================================== ");
//        System.out.println("============================================== ");
//        System.out.println("============================================== ");
//    }
    //15. Write a Java program to swap two variables

//    public void swapVar(int a, int b) {
//        System.out.println("a is "+a);
//        System.out.println("b is "+b);
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("a is " + a);
//        System.out.println("b is " + b);
//    }
//
//    public static void main(String[] args) {
//        new BasicsOne().swapVar(2, 4);
//    }

}

