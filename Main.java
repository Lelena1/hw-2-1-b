import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        doHw1Task3();
//        doHw2Task2();

        doHw1EncapsulationTask1();
        doHw1EncapsulationTask2();
        doHw2Task3Encapsulation();

    }

//    public static void doHw1Task3() {
//
//        System.out.println("Домашнее задание 1 Задание 3");
//        transport.Car lada = new transport.Car();
//        lada.brand = "Lada";
//        lada.model = "Grande";
//        lada.engineVolume = 1.7;
//        lada.color = "желтый";
//        lada.productionCountry = "Россия";
//        lada.productionYear = 2015;
//        lada.showCharacteristics();
//
//        transport.Car audi = new transport.Car();
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.engineVolume = 3.0;
//        audi.color = "черный";
//        audi.productionCountry = "Германия";
//        audi.productionYear = 2020;
//        audi.showCharacteristics();
//
//        transport.Car bmw = new transport.Car();
//        bmw.brand = "BMW";
//        bmw.model = "Z8";
//        bmw.engineVolume = 3.0;
//        bmw.color = "черный";
//        bmw.productionCountry = "Германия";
//        bmw.productionYear = 2021;
//        bmw.showCharacteristics();
//
//        transport.Car kia = new transport.Car();
//        kia.brand = "KIA";
//        kia.model = "Sportage 4 поколение";
//        kia.engineVolume = 2.4;
//        kia.color = "красный";
//        kia.productionCountry = "Южная Корея";
//        kia.productionYear = 2018;
//        kia.showCharacteristics();
//
//        transport.Car hyundai = new transport.Car();
//        hyundai.brand = "Hyundai";
//        hyundai.model = "Avante";
//        hyundai.engineVolume = 1.6;
//        hyundai.color = "оранжевый";
//        hyundai.productionCountry = "Южная Корея";
//        hyundai.productionYear = 2016;
//        hyundai.showCharacteristics();
//    }

//    public static void doHw2Task2() {
//
//        transport.Car lada = new transport.Car("Lada", "Grande", 1.7, "желтый",
//                2015, "Россия");
//        transport.Car audi = new transport.Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
//                2020, "Германия");
//        transport.Car bmw = new transport.Car("BMW", "Z8", 3.0, "черный",
//                2021, "Германия");
//        transport.Car kia = new transport.Car("KIA", "Sportage 4 поколение", 2.4, "красный",
//                2018, "Южная Корея");
//        transport.Car hyundai = new transport.Car("Hyundai", "Avante", 1.6, "оранжевый",
//                2016, "Южная Корея");
//
//        lada.showCharacteristics();
//        audi.showCharacteristics();
//        bmw.showCharacteristics();
//        kia.showCharacteristics();
//        hyundai.showCharacteristics();
//    }

    //        ДЗ 1. Инкапсуляция. Задание 1
    public static void doHw1EncapsulationTask1() {

        System.out.println("Домашнее задание 1 Инкапсуляция Задача 1");

        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(1993, "Москва");
        Human katya = new Human(-1992, "Катя", " ", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", "сейчас нигде не работаю");

        maxim.setYearOfBirth(-2000);
        maxim.setTown(null);
        maxim.greetWithJob();
        anya.greetWithJob();
        katya.greetWithJob();
        artem.greetWithJob();
        vladimir.greetWithJob();

    }

    public static void doHw1EncapsulationTask2() {
        System.out.println("\nДЗ 1. Инкапсуляция. Задание 2");

        Flower rose = new Flower("Роза обыкновенная", " ", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "желтый", "", 15, 5);
        Flower pion = new Flower("Пион", "красный ", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", " ", "Турция", 19.5, 10);


        rose.printAllInfoAboutFlowers();
        chrysanthemum.printAllInfoAboutFlowers();
        pion.printAllInfoAboutFlowers();
        gypsophila.printAllInfoAboutFlowers();

        calculateCostOfBouquet(rose, rose, rose, gypsophila, gypsophila, gypsophila, gypsophila);
    }

    private static void calculateCostOfBouquet(Flower... flowers) {
        double costOfBouquet = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
            costOfBouquet += flower.getCost();
        }
        costOfBouquet = costOfBouquet * 1.1;
        System.out.println("\nСтоимость букета " + costOfBouquet + "\n" + "Срок стояния букета " + minLifeSpan);
    }


    public static void doHw2Task3Encapsulation() {

        Car.Insurance insuranceLada = new Car.Insurance(LocalDate.now(),
                3500.2, "001234567");
        Car.Insurance insuranceAudi = new Car.Insurance(LocalDate.now(),
                4900.10, "001234567");
        Car.Insurance insuranceBmw = new Car.Insurance(LocalDate.now(),
                5600.10, "011234567");
        Car.Insurance insuranceKia = new Car.Insurance(LocalDate.now(),
                4600.80, "021234567");
        Car.Insurance insuranceHyundai = new Car.Insurance(LocalDate.now(),
                6700.20, "031234567");


        Car lada = new Car("Lada", "Grande", 1.7, "желтый",
                -2015, "Россия", "механика", "седан",
                "А123БВ456", 4, true,
                new Car.Key(true, false), insuranceLada);
        Car audi = new Car(-3.0, 2020, "А234БВ567");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021,
                "Германия", "автомат", "внедорожник", "",
                6, true, new Car.Key(true, true), insuranceBmw);
        Car kia = new Car("KIA", "Sportage 4 поколение", -2.4, "красный",
                2018, "Южная Корея", "механика", " ",
                "А345АА678", 5, false, new Car.Key(), insuranceKia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея", "механика", "седан",
                "Б123ББ678", 5, false, new Car.Key(false,
                true), insuranceHyundai);

//        Инкапсуляция. Домашнее задание 3 Задание 1 - Вложенный класс Key. Тестирование объектов
        kia.setKey(new Car.Key(true, true));
        bmw.setKey(new Car.Key(false, false));

        System.out.println("\nИнкапсуляция. Домашнее задание 3 Задание 1 - Вложенный класс Insurance");
        System.out.println(insuranceKia.getNumberOfInsurance());
        System.out.println(insuranceLada.getValidityPeriodOfInsurance());
        System.out.println(insuranceLada.getNumberOfInsurance());
        System.out.println(insuranceHyundai.getValidityPeriodOfInsurance());
        bmw.getInsurance().checkPeriodOfInsurance();
        lada.getInsurance().checkNumberOfInsurance();

        System.out.println("\nИнкапсуляция. Домашнее задание 2 - задание 1");
//        тестирование
        lada.setEngineVolume(-2);
        lada.setColor("  ");
        lada.setTransmission("  ");
        lada.setRegistrationNumber("");
        audi.setIsSummerTires(false);
        lada.replaceTires(true);
        lada.setRegistrationNumber("a123cd456");
        System.out.println(lada.isValidationRegNum());
        audi.setRegistrationNumber("ff123g456");
        System.out.println(audi.isValidationRegNum());


        lada.showCharacteristics();
        audi.showCharacteristics();
        bmw.showCharacteristics();
        kia.showCharacteristics();
        hyundai.showCharacteristics();
    }
}
