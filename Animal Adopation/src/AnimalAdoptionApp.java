import java.util.List;
import java.util.Scanner;

public class AnimalAdoptionApp {
    public static void main(String[] args) {
        AnimalDAO animalDAO = new AnimalDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Animal Adoption Platform ===");
            System.out.println("1. Add a new animal");
            System.out.println("2. List all animals");
            System.out.println("3. Update animal status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter animal species: ");
                    String species = scanner.nextLine();
                    System.out.print("Enter animal age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter animal status (Available/Adopted): ");
                    String status = scanner.nextLine();
                    Animal newAnimal = new Animal(name, species, age, status);
                    animalDAO.addAnimal(newAnimal);
                    System.out.println("Animal added successfully!");
                    break;

                case 2:
                    List<Animal> animals = animalDAO.getAllAnimals();
                    System.out.println("\n=== Animal List ===");
                    for (Animal animal : animals) {
                        System.out.printf("ID: %d, Name: %s, Species: %s, Age: %d, Status: %s\n",
                                animal.getId(), animal.getName(), animal.getSpecies(), animal.getAge(), animal.getStatus());
                    }
                    break;

                case 3:
                    System.out.print("Enter animal ID to update: ");
                    int animalId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new status (Available/Adopted): ");
                    String newStatus = scanner.nextLine();
                    animalDAO.updateAnimalStatus(animalId, newStatus);
                    System.out.println("Animal status updated successfully!");
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
