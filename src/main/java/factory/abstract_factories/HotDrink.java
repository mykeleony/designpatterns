package factory.abstract_factories;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HotDrink {
    void consume();
}

interface HotDrinkFactory {
    HotDrink prepare(int amount);
}

class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put in the tea bag, boil water, pour " + amount + "ml, add lemon, enjoy!");

        return new Tea();
    }
}

class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil water, pour " + amount + "ml, add cream and sugar, enjoy!");

        return new Coffee();
    }
}

class Tea implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is delicious!");
    }
}

class Coffee implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious!");
    }
}

class HotDrinkMachine {
    List<HashMap<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() {
    }
}