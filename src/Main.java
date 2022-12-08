import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        // Звдание 1
        System.out.println("Задание 1");


        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        long clientDeviceYearI = 2013;
        if (clientDeviceYearI >= 2015) {
            System.out.println("Ваша версия подходит для установки");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задание 5
        System.out.println("Задание 5");
        int moth = 3;
        switch (moth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Номер месяца больше 13");

        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 77;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуются сутки + срок доставки");
        }
        if (deliveryDistance > 20) {
            if (deliveryDistance <60) {
                System.out.println("Потребуется 2 суток + срок доставки");
            }
        }
        if (deliveryDistance >=60) {
            if (deliveryDistance <100) {
                System.out.println("Потребуется 3 суток + срок доставки");
            }

            // Задание 3
            System.out.println("Задание 3");
            short year = 2023;
            boolean leapyear = (year>1584 &&((year%400 == 0) || (year %4 == 0 && year % 100 != 0))
            );
            if (leapyear)
                System.out.println("Год " + year + " високосный");
            else
                System.out.println("Год " + year + " не високосный");
        }
            }


        }




