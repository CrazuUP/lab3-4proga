import java.util.List;

public class Owner extends Character {
    public Owner(String name) {
        super(name, "Владелец");
    }

    @Override
    public void performAction(Factory factory, List<Character> newCharacters) throws ActionNotAllowedException {
        if (factory.getState() == FactoryState.WORKERS_RULE) {
            throw new ActionNotAllowedException(name + " не может контролировать фабрику под властью рабочих!");
        }
        System.out.println(name + " пытается сохранить контроль...");
    }
}
