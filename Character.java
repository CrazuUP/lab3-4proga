import java.util.List;

public abstract class Character {
    protected String name;
    protected String role;

    public Character(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public abstract void performAction(Factory factory, List<Character> newCharacters) throws ActionNotAllowedException;

    @Override
    public String toString() {
        return role + " " + name;
    }
}
