import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(" Скупердяя");

        Random random = new Random();
        int workersCount = random.nextInt(3) + 2; // 2-4 рабочих
        int ownersCount = random.nextInt(2) + 1; // 1-2 хозяина
        int policeCount = random.nextInt(2) + 1; // 1-2 полицейских

        for (int i = 0; i < workersCount; i++) {
            factory.addCharacter(new Worker("Рабочий" + (i + 1)));
        }

        for (int i = 0; i < ownersCount; i++) {
            factory.addCharacter(new Owner("Владелец" + (i + 1)));
        }

        for (int i = 0; i < policeCount; i++) {
            factory.addCharacter(new PoliceOfficer("Полицейский" + (i + 1)));
        }

        // Симуляция действий
        System.out.println("\n--- Симуляция Сценария ---");
        factory.simulateActions();
    }
}
