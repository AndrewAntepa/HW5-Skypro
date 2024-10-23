import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1");
        System.out.println("Какая у вас операционная система? 0 - айфон, 1 - андроид");
        int operationSystem1 = scanner.nextInt();
        if(operationSystem1 == 0){
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\nЗадание 2");
        System.out.println("Какая у вас операционная система? 0 - айфон, 1 - андроид");
        int operationSystem2 = scanner.nextInt();
        System.out.println("В каком году был выпущен телефон?");
        int clientDeviceYear = scanner.nextInt();
        switch (operationSystem2){
            case 0: {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else System.out.println("Установите версию приложения для iOS по ссылке\n");
                break;
            }
            case 1: {
                if(clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }
        }

        System.out.println("\nЗадание 3");
        System.out.println("Введите год");
        int year = scanner.nextInt();
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("\nЗадание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if(deliveryDistance < 20){
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryDays + 1);
        } else if(deliveryDistance < 100){
            System.out.println("Потребуется дней: " + deliveryDays + 2);
        } else {
            System.out.println("Доставка невозможна");
        }

        System.out.println("\nЗадание 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:{
                System.out.println("1 месяц, то есть январь, принадлежит зиме");
                break;
            }
            case 2:{
                System.out.println("2 месяц, то есть февраль, принадлежит зиме");
                break;
            }
            case 3:{
                System.out.println("3 месяц, то есть март, принадлежит весне");
                break;
            }
            case 4:{
                System.out.println("4 месяц, то есть апрель, принадлежит весне");
                break;
            }
            case 5:{
                System.out.println("5 месяц, то есть май, принадлежит зиме");
                break;
            }
            case 6:{
                System.out.println("6 месяц, то есть июнь, принадлежит лету");
                break;
            }
            case 7:{
                System.out.println("7 месяц, то есть июль, принадлежит лету");
                break;
            }
            case 8:{
                System.out.println("8 месяц, то есть август, принадлежит лету");
                break;
            }
            case 9:{
                System.out.println("9 месяц, то есть сентябрь, принадлежит осени");
                break;
            }
            case 10:{
                System.out.println("10 месяц, то есть октябрь, принадлежит осени");
                break;
            }
            case 11:{
                System.out.println("11 месяц, то есть ноябрь, принадлежит осени");
                break;
            }
            case 12:{
                System.out.println("12 месяц, то есть декабрь, принадлежит зиме");
                break;
            }
            default:{
                System.out.println("Такого месяца не существует");
                break;
            }
        }
    }
}