public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    //     Дз 1 Задание 3
    void showCharacteristics() {
        System.out.println(toString());
    }

    // Дз 2 Задание 2

//    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
//        this.brand = brand;
//        this.model = model;
//        this.engineVolume = engineVolume;
//        this.color = color;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//    }

    //   ДЗ 3 Задание 2
    Car(double engineVolume, int productionYear) {
        this("default", "default", engineVolume, "белый", productionYear, "default");
    }

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        if (engineVolume > 0) {

            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (productionYear > 0) {

            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
    }

    public String toString() {
        return "Автомобиль " + brand + " " + model + ", " + productionYear + " года выпуска, сборка - " +
                productionCountry + ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + " литра.";
    }

}
