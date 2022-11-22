public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    private final int lifeSpan;


    Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {

        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Хризантема";
        }

        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }

        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }

    }

    void printAllInfoAboutFlowers() {
        System.out.println(toString());
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Хризантема";
        }
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }
    }

    @Override
    public String toString() {
        return flowerName + ", цвет - " + flowerColor + ", страна происхождения - " + country
                + ", стоимость 1 штуки (рублей): " + String.format("%.2f", cost) + ", срок стояния (дней): "
                + lifeSpan + ".";
    }
}

