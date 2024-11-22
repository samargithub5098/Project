public class Animal {
    private int id;
    private String name;
    private String species;
    private int age;
    private String status;

    // Constructors
    public Animal(int id, String name, String species, int age, String status) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.status = status;
    }

    public Animal(String name, String species, int age, String status) {
        this(0, name, species, age, status);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
