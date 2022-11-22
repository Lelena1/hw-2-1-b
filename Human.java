public class Human {
    private int yearOfBirth;
    private final String name;
    private String town;
    private final String jobTitle;


    Human(int yearOfBirth, String town) {
        this(yearOfBirth, "Информация не указана", town, "Информация не указана");
    }

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        this.name = name;

        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }

        this.jobTitle = jobTitle;
    }

    void greetWithJob() {
        System.out.println(toStringWithJob());
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Будем знакомы!";
    }

    public String toStringWithJob() {
        return "Привет! Меня зовут " + name + ". Я из города: " + town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности: " + jobTitle + ". Будем знакомы!";
    }
}