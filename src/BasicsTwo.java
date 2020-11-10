import javafx.beans.binding.IntegerBinding;

import java.util.Scanner;

public class BasicsTwo {
    //7. Write a Java program to add two binary numbers.
    //Input Data:
    //Input first binary number: 10
    //Input second binary number: 11
    //Expected Output
    //
    //Sum of two binary numbers: 101


//    public String addBinary(String a, String b) {
//        StringBuilder sb = new StringBuilder();
//        int i = a.length() - 1;
//        int j = b.length() - 1;
//        int carry = 0;
//        while (i >= 0 || j >= 0) {
//            int sum = carry;
//            if (i >= 0) {
//                sum += a.charAt(i--) - '0';
//            }
//            if (j >= 0) {
//                sum += b.charAt(j--) - '0';
//            }
//
//            sb.insert(0, sum % 2);
//            carry = sum / 2;
//        }
//        if (carry>0){
//            sb.insert(0,1);
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new BasicsTwo().addBinary("001010","0111010"));
//    }


//    public static void main(String[] args) {
//        String first = "101";
//        String second = "001";
//
//        int one = Integer.parseInt(first,2);
//        int two = Integer.parseInt(second,2);
//        int addition = one+two;
//
//        System.out.println(Integer.toBinaryString(addition));
//    }

    //18 18. Write a Java program to multiply two binary numbers.

//    public static void main(String[] args) {
//        String first = "10";
//        String second = "11";
//
//        int one = Integer.parseInt(first,2);
//        int two = Integer.parseInt(second,2);
//
//        int multiplication = one * two;
//
//        System.out.println(Integer.toBinaryString(multiplication));
//
//    }

    //19.Write a Java program to convert a decimal number to binary number.

//    public static void main(String[] args) {
//        System.out.println("PLease enter a number");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        String converted = Integer.toBinaryString(number);
//
//        System.out.println(converted);
//
//    }

    //20.Write a Java program to convert a decimal number to hexadecimal number.
//    public static void main(String[] args) {
//        System.out.println("Please enter a number");
//        Scanner sc = new Scanner(System.in);
//        int number =sc.nextInt();
//
//        String converted = Integer.toHexString(number);
//        System.out.println(converted);
//    }

    //21.Write a Java program to convert a decimal number to octal number. Go to the editor
    //Input Data:15
//    public static void main(String[] args) {
//        System.out.println("Please enter a number");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        String octal = Integer.toOctalString(number);
//        System.out.println(octal);
//        int abc = Integer.parseInt(octal);
//        System.out.println(abc);
//    }

    //22. Write a Java program to convert a binary number to decimal number

//    public static void main(String[] args) {
//        System.out.println("Please enter a binary number");
//        Scanner sc = new Scanner(System.in);
//        String binary = sc.nextLine();
//
//        int number = Integer.parseInt(binary,2);
//        System.out.println(number);
//    }

    //23Write a Java program to convert a binary number to hexadecimal number.

//    public static void main(String[] args) {
//        String binary = "1101";
//        int value = Integer.parseInt(binary,2);
//        String hex = Integer.toHexString(value);
//
//        System.out.println(hex);
//    }

    //24. Write a Java program to convert a binary number to a Octal number
//
//    public static void main(String[] args) {
//        String binary = "111";
//        int value =Integer.parseInt(binary,2);
//        System.out.println(value);
//        String octa = Integer.toOctalString(value);
//        System.out.println(octa);
//    }

    //25.Write a Java program to convert a octal number to a decimal number.

//    public static void main(String[] args) {
//        String octal = "10";
//        int nr = Integer.parseInt(octal,8);
//        System.out.println(nr);
//    }

    //26 Write a Java program to convert a octal number to a binary number.

//    public static void main(String[] args) {
//        String octal = "7";
//        int binary = Integer.parseInt(octal, 8);
//        String abc = Integer.toBinaryString(binary);
//        System.out.println(abc);
//    }

    //27. Write a Java program to convert a octal number to a hexadecimal number.

//    public static void main(String[] args) {
//        String octal = "100";
//        int nr = Integer.parseInt(octal, 8);
//        String hexa = Integer.toHexString(nr);
//        System.out.println(hexa);
//    }

    //28.Write a program to convert a haxadecimal to decimal

//    public static void main(String[] args) {
//        String hexa = "25";
//        int nr = Integer.parseInt(hexa,16);
//        System.out.println(nr);
//    }

    //29.Write a Java program to convert a hexadecimal to a binary number

//    public static void main(String[] args) {
//        String hexa = "37";
//        int nr = Integer.parseInt(hexa,16);
//        String binary = Integer.toBinaryString(nr);
//        System.out.println(binary);
//    }

    //30. Write a Java program to convert a hexadecimal to a octal number

//    public static void main(String[] args) {
//        String hexa = "40";
//        int nr = Integer.parseInt(hexa,16);
//        String octa = Integer.toOctalString(nr);
//        System.out.println(octa);
//    }

}