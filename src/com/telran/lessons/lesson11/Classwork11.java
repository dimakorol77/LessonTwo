package com.telran.lessons.lesson11;

import java.util.Scanner;

public class Classwork11 {

//        public static void main(String[] args) {
//            int day = 2; // Указываем день
//            String dayString;
//
//            switch (day) {
//                case 1:
//                    dayString = "Понедельник";
//                    break;
//                case 2:
//                    dayString = "Вторник";
//                    break;
//                case 3:
//                    dayString = "Среда";
//                    break;
//                case 4:
//                    dayString = "Четверг";
//
//                case 5:
//                    dayString = "Пятница";
//                    break;
//                case 6:
//                    dayString = "Суббота";
//                    break;
//                case 7:
//                    dayString = "Воскресенье";
//                    break;
//                default:
//                    dayString = "Некорректный день";
//                    break;
//            }
//            System.out.println("День недели: " + dayString);
//        }
//public static void main(String[] args) {
    // java 13+
//    int dayOfTheWeek = 7;
//    String value = switch (dayOfTheWeek) {
//        case 1 -> "Monday";
//        case 2 -> "Tuesday";
//        case 3 -> {
//            System.out.println("It is wednesday");
//            yield "Wednesday";
//        }
//        case 4 -> "Thursday";
//        case 5 -> "Friday";
//        case 6 ->"Saturday";
//        case 7 -> {
//            System.out.println("Sunday");
//            yield "Sunday";
//        }
//        default -> {
//            throw new RuntimeException("Wrong day");
//        }
//    };
//    System.out.println(value);
//}



//        public static void main(String[] args) {
//            String day = "Четверг";
//            String dayType;
//
//            switch (day) {
//                case "Понедельник":
//                case "Вторник":
//                case "Среда":
//                case "Четверг":
//                case "Пятница":
//                    dayType = "Рабочий день";
//                    break;
//                case "Суббота":
//                case "Воскресенье":
//                    dayType = "Выходной день";
//                    break;
//                default:
//                    dayType = "Нет такого дня";
//                    break;
//            }
//            System.out.println(day +" "+ dayType);
//        }
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String dayString = scanner.nextLine();
//    switch (dayString) {
//        case "Monday":
//        case "Tuesday":
//        case "Wednesday":
//        case "Thursday":
//        case "Friday":
//            dayString="рабочий";
//            break;
//        case "Saturday":
//        case "Sunday":
//            dayString="выходной";
//            break;
//        default:
//            System.out.println("Wrong day");
//            break;
//    }
//    System.out.println(dayString);
//}


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер дня недели (1-7):");
            int day = scanner.nextInt();
            String dayString;


            if (day >= 1 && day <= 5) {
                dayString = "рабочий";
            } else if (day == 6 || day == 7) {
                dayString = "не рабочий";
            } else {
                dayString = "Wrong day";
            }


            System.out.println(dayString);


            dayString = (day >= 1 && day <= 5) ? "рабочий" :
                    (day == 6 || day == 7) ? "не рабочий" :
                            "Wrong day";


            System.out.println(dayString);
        }
    }




//