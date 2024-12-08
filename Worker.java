import java.util.List;
import java.util.Random;

public class Worker extends Character {
    private Random random = new Random();

    public Worker(String name) {
        super(name, "Рабочий");
    }

    @Override
    public void performAction(Factory factory, List<Character> newCharacters) throws ActionNotAllowedException {
        if (random.nextBoolean()) {
            System.out.println(name + " обеспечивает невесомость на заводе!");
            factory.changeState(FactoryState.ZERO_GRAVITY);
        } else {
            System.out.println(name + " пытается взять под контроль фабрику!");
            factory.changeState(FactoryState.WORKERS_RULE);
        }
    }
}
