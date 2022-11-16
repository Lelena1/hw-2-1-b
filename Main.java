public class Main {
    public static void main(String[] args) {
//        doHw1Task3();
//        doHw2Task2();
        doHw3Task2();
    }

//    public static void doHw1Task3() {
//
//        System.out.println("Домашнее задание 1 Задание 3");
//        Car lada = new Car();
//        lada.brand = "Lada";
//        lada.model = "Grande";
//        lada.engineVolume = 1.7;
//        lada.color = "желтый";
//        lada.productionCountry = "Россия";
//        lada.productionYear = 2015;
//        lada.showCharacteristics();
//
//        Car audi = new Car();
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.engineVolume = 3.0;
//        audi.color = "черный";
//        audi.productionCountry = "Германия";
//        audi.productionYear = 2020;
//        audi.showCharacteristics();
//
//        Car bmw = new Car();
//        bmw.brand = "BMW";
//        bmw.model = "Z8";
//        bmw.engineVolume = 3.0;
//        bmw.color = "черный";
//        bmw.productionCountry = "Германия";
//        bmw.productionYear = 2021;
//        bmw.showCharacteristics();
//
//        Car kia = new Car();
//        kia.brand = "KIA";
//        kia.model = "Sportage 4 поколение";
//        kia.engineVolume = 2.4;
//        kia.color = "красный";
//        kia.productionCountry = "Южная Корея";
//        kia.productionYear = 2018;
//        kia.showCharacteristics();
//
//        Car hyundai = new Car();
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
//        Car lada = new Car("Lada", "Grande", 1.7, "желтый",
//                2015, "Россия");
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
//                2020, "Германия");
//        Car bmw = new Car("BMW", "Z8", 3.0, "черный",
//                2021, "Германия");
//        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4, "красный",
//                2018, "Южная Корея");
//        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
//                2016, "Южная Корея");
//
//        lada.showCharacteristics();
//        audi.showCharacteristics();
//        bmw.showCharacteristics();
//        kia.showCharacteristics();
//        hyundai.showCharacteristics();
//    }

    public static void doHw3Task2() {

        Car lada = new Car("Lada", "Grande", 1.7, "желтый",
                -2015, "Россия");
        Car audi = new Car(-3.0, 2020);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный",
                2021, "Германия");
        Car kia = new Car("KIA", "Sportage 4 поколение", -2.4, "красный",
                2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея");

        lada.showCharacteristics();
        audi.showCharacteristics();
        bmw.showCharacteristics();
        kia.showCharacteristics();
        hyundai.showCharacteristics();

    }
}
