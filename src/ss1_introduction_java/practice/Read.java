package ss1_introduction_java.practice;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc (n>0, n<1000): ");
        int number = scanner.nextInt();
        String hundred = null;
        String dozen = null;
        String unit = null;
        int temp = 0;
        if (number < 1000 && number > 99) {
            switch (number / 100) {
                case 1:
                    hundred = "One hundred";
                    break;
                case 2:
                    hundred = "Two hundred";
                    break;
                case 3:
                    hundred = "Three hundred";
                    break;
                case 4:
                    hundred = "Four hundred";
                    break;
                case 5:
                    hundred = "Five hundred";
                    break;
                case 6:
                    hundred = "Six hundred";
                    break;
                case 7:
                    hundred = "Seven hundred";
                    break;
                case 8:
                    hundred = "Eight hundred";
                    break;
                case 9:
                    hundred = "Nine hundred";
                    break;
            }
            temp = number;
            number %= 100;
            System.out.print(hundred + " ");
        }
        if (number < 100 && number > 9) {
            switch (number / 10) {
                case 1:
                    switch (number) {
                        case 10:
                            dozen = "ten";
                            break;
                        case 11:
                            dozen = "eleven";
                            break;
                        case 12:
                            dozen = "eleven";
                            break;
                        case 13:
                            dozen = "thirteen";
                            break;
                        case 14:
                            dozen = "fourteen";
                            break;
                        case 15:
                            dozen = "fifteen";
                            break;
                        case 16:
                            dozen = "sixteen";
                            break;
                        case 17:
                            dozen = "seventeen";
                            break;
                        case 18:
                            dozen = "eighteen";
                            break;
                        case 19:
                            dozen = "nineteen";
                            break;
                    }
                    break;
                case 2:
                    dozen = "twenty";
                    break;
                case 3:
                    dozen = "thirty";
                    break;
                case 4:
                    dozen = "forty";
                    break;
                case 5:
                    dozen = "fifty";
                    break;
                case 6:
                    dozen = "sixty";
                    break;
                case 7:
                    dozen = "seventy";
                    break;
                case 8:
                    dozen = "eighty";
                    break;
                case 9:
                    dozen = "ninety";
                    break;
            }
            temp = number;
            number %= 10;
            System.out.print(dozen + " ");
        }
            if (number < 10) {
                if ((temp % 100 != 0) && temp % 10 != 0 && temp > 20 || temp == 0) {
                    switch (number) {
                        case 0:
                            unit = "zero";
                            break;
                        case 1:
                            unit = "one";
                            break;
                        case 2:
                            unit = "two";
                            break;
                        case 3:
                            unit = "three";
                            break;
                        case 4:
                            unit = "four";
                            break;
                        case 5:
                            unit = "five";
                            break;
                        case 6:
                            unit = "six";
                            break;
                        case 7:
                            unit = "seven";
                            break;
                        case 8:
                            unit = "eight";
                            break;
                        case 9:
                            unit = "nine";
                            break;
                    }

                }

                if (unit != null) {
                    System.out.print(unit + " ");
                }
            }
        }
    }
//        if (number >= 0 && number < 10) {
//            switch (number) {
//                case 0:
//                    System.out.println("Zero");
//                    break;
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//
//            }
//        }




//            }
//        }
//        else {
//            System.out.println("GTA");
//        }

