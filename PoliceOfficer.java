import java.util.List;
import java.util.Random;

public class PoliceOfficer extends Character {
    private Random random = new Random();

    public PoliceOfficer(String name) {
        super(name, "Полицейский");
    }

    @Override
    public void performAction(Factory factory, List<Character> newCharacters) {
        if (random.nextBoolean()) {
            System.out.println(name + " пытается восстановить порядок.");
            if (factory.getState() == FactoryState.ZERO_GRAVITY) {
                System.out.println(" Не удалось действовать из-за хаоса невесомости!");
            } else {
                System.out.println(name + " удалось успокоить ситуацию.");
            }
        } else {
            System.out.println(name + " решил отказаться от своих обязанностей и присоединиться к рабочим!");
            newCharacters.add(new Worker(name + " (бывший полицейский)"));
        }
    }
}
