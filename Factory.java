import java.util.ArrayList;
import java.util.List;

public class Factory {
    private String name;
    private FactoryState state;
    private List<Character> characters;

    public Factory(String name) {
        this.name = name;
        this.state = FactoryState.NORMAL;
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character + "присоединился к фабрике" + name);
    }

    public void changeState(FactoryState newState) {
        this.state = newState;
        System.out.println("Фабрика " + name + "сейчас находится в состоянии: " + state);
    }

    public FactoryState getState() {
        return state;
    }

    public void simulateActions() {
        // Создаем копию списка для безопасной итерации
        List<Character> currentCharacters = new ArrayList<>(characters);
        List<Character> newCharacters = new ArrayList<>();

        for (Character character : currentCharacters) {
            try {
                character.performAction(this, newCharacters);
            } catch (ActionNotAllowedException e) {
                System.out.println("Ошибка:" + e.getMessage());
            }
        }

        // Добавляем всех новых персонажей после завершения итерации
        characters.addAll(newCharacters);
    }
}
