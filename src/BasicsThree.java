import java.util.Scanner;

public class BasicsThree {
    //31. Write a Java program to check whether Java is installed on your computer
//    public static void main(String[] args) {
//        System.out.println("\nJava Version: "+System.getProperty("java.version"));
//        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
//        System.out.println("Java Home: "+System.getProperty("java.home"));
//        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
//        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
//        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
//    }

    //32.Write a Java program to compare two numbers

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("PLease enter first number");
//        int first = sc.nextInt();
//        System.out.println("Please enter second number");
//        int second = sc.nextInt();
//
//        if (first == second) {
//            System.out.println(first + " = " + second);
//        } else {
//            System.out.println(first + " != " + second);
//        }
//
//        if (first < second) {
//            System.out.println(first + " < " + second);
//        } else {
//            System.out.println(first + " >" + second);
//        }
//
//        if (first <= second) {
//            System.out.println(first + " <= " + second);
//        } else {
//            System.out.println(first + " >= " + second);
//        }
//
//        System.out.println("end");
//    }

    //33. Write a Java program and compute the sum of the digits of an integer.

//    public static void main(String[] args) {
//        System.out.println("Enter a number");
//        Scanner sc = new Scanner(System.in);
//        long nr = sc.nextInt();
//        System.out.println("sum is " + sumDigits(nr));
//    }
//
//
//    //Fiindca suntem in baza 10 facem urmatorul lucru.Obtinem restul impartitii lui n la 10 (n%10)si il aduna la suma
//    // dupa care impartim n la 10.Atata timp cat n nu e 0 loopul face treaba asta.Si ce se intampla mai departe este ca
//    // obtinem restul din urmatorul n pe care il adunam iar la suma si tot asa pana se termina loopul.Asta ne permite
//    //sa obtinem restul pe fiecare unitate/zeci/sute/mii etc si sa le adunam impreuna.Dat fiind ca suntem in baza zece
//    //restul este totdeauna ceea ce inmultim la 10^n.De exemplu avem 192 in baza 10 care inseamna 2 × 10^0 + 9 × 10^1 + 1 × 10^2.
//    //facand facand % din sute obtinem 1, % din zeci obtinem 9 iar din unitati 2.Dupa ce terminam cu sutele impartim la 10
//    //ca sa ajungem la zeci si dupa inca o data la 10 ca sa ajungem la unitati.Iar resturile se aduna intre ele dand suma
//    //de 12.
//
//    public static int sumDigits(long n) {
//        int sum = 0;
//        while (n != 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return sum;
//    }
//
    //34.Write a Java program to compute the area of a hexagon.

//    public static double calculateAreaHexagon(double side) {
//        return (3 / Math.sqrt(3) * Math.pow(side, 2)) / 2;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(calculateAreaHexagon(6));
//    }

    //35. Write a Java program to compute the area of a polygon

//    public static double computeAreaOfPolygon(double lenghtOfSide, double nrOfSides){
//        return (nrOfSides*Math.pow(lenghtOfSide,2))/(4*Math.tan(3.14/nrOfSides));
//    }
//
//    public static void main(String[] args) {
//        System.out.println(computeAreaOfPolygon(6,7));
//    }

    //36.Write a Java program to compute the distance between two points on the surface of earth.

    public static void main(String[] args) {

    }


}
