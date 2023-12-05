import java.util.LinkedList;
import java.util.List;

public class Player {

    private final String name;
    private final String emoji = "🕵🏽‍♂️️";

    List<Object> detectiveBag = new LinkedList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmoji() {
        return emoji;
    }
}
