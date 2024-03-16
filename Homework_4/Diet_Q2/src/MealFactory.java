import java.util.Random;
public class MealFactory implements Macronutrient{
    private static MealFactory instance;

    private MealFactory() {}

    public static MealFactory getInstance(){
        if (instance == null){
            instance = new MealFactory();
        }
        return instance;
    }

    public Carbs createCarbs(DietType dietType) {
        Random rand = new Random();
        switch(dietType){
            case NoRestriction: return new CarbsFactory().create();
            case Paleo: return new Pistachio();
            case Vegan:
                switch(rand.nextInt(3)){
                    case 0: return new Bread();
                    case 1: return new Lentils();
                    case 2: return new Pistachio();
                }
            case NutAllergy:
                switch(rand.nextInt(3)){
                    case 0: return new Bread();
                    case 1: return new Lentils();
                    case 2: return new Cheese();
                }
        }

        return new CarbsFactory().create();
    }

    public Protein createProtein(DietType dietType) {
        Random rand = new Random();
        switch(dietType){
            case NoRestriction, NutAllergy: return new ProteinFactory().create();
            case Paleo:
                switch(rand.nextInt(3)){
                    case 0: return new Fish();
                    case 1: return new Chicken();
                    case 2: return new Beef();
                }
            case Vegan: return new Tofu();
        }
        return new ProteinFactory().create();
    }
    public Fats createFats(DietType dietType) {
        Random rand = new Random();
        switch(dietType){
            case NoRestriction: return new FatFactory().create();
            case Paleo, Vegan:
                switch (rand.nextInt(3)){
                    case 0: return new Avocado();
                    case 1: return new Tuna();
                    case 2: return new Peanut();
                }
            case NutAllergy:
                switch (rand.nextInt(3)){
                    case 0: return new Avocado();
                    case 1: return new Tuna();
                    case 2: return new SourCream();
                }
        }
        return new FatFactory().create();
    }
}
interface Carbs{
    String carbName();
}

class Cheese implements Carbs{
    @java.lang.Override
    public java.lang.String carbName() {
        return "Cheese";
    }
}

class Bread implements Carbs{
    @java.lang.Override
    public java.lang.String carbName() {
        return "Bread";
    }
}

class Lentils implements Carbs{
    @java.lang.Override
    public java.lang.String carbName() {
        return "Lentils";
    }
}

class Pistachio implements Carbs{
    @java.lang.Override
    public java.lang.String carbName() {
        return "Pistachio";
    }
}

class CarbsFactory{
    public Carbs create() {
        Random rand = new Random();
        int choice = rand.nextInt(4);
        return switch (choice) {
            case 0 -> new Cheese();
            case 1 -> new Bread();
            case 2 -> new Lentils();
            case 3 -> new Pistachio();
            default -> null;
        };
    }
}

interface Protein {
    String proteinName();
}


class Beef implements Protein {
    @Override
    public String proteinName() {
        return "Beef";
    }
}

class Chicken implements Protein {
    @Override
    public String proteinName() {
        return "Chicken";
    }
}

class Fish implements Protein {
    @Override
    public String proteinName() {
        return "Fish";
    }
}

class Tofu implements Protein {
    @Override
    public String proteinName() {
        return "Tofu";
    }
}


class ProteinFactory {
    public Protein create() {
        Random random = new Random();
        int choice = random.nextInt(4); // Number of available proteins
        switch (choice) {
            case 0: return new Beef();
            case 1: return new Chicken();
            case 2: return new Fish();
            case 3: return new Tofu();
            default: return null;
        }
    }
}
interface Fats {
    String fatName();
}


class Avocado implements Fats {
    @Override
    public String fatName() {
        return "Avocado";
    }
}

class SourCream implements Fats {
    @Override
    public String fatName() {
        return "Sour Cream";
    }
}

class Tuna implements Fats {
    @Override
    public String fatName() {
        return "Tuna";
    }
}

class Peanut implements Fats {
    @Override
    public String fatName() {
        return "Peanut";
    }
}


class FatFactory {
    public Fats create() {
        Random random = new Random();
        int choice = random.nextInt(4); // Number of available fats
        return switch (choice) {
            case 0 -> new Avocado();
            case 1 -> new SourCream();
            case 2 -> new Tuna();
            case 3 -> new Peanut();
            default -> null;
        };
    }
}