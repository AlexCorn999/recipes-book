
public class Main {
    public static void main(String[] args) {
        int milkAmount = 200; // ml
        int powderAmount = 400; // g
        int eggsCount = 2; // items
        int sugarAmount = 10; // g
        int oilAmount = 20; // ml
        int appleCount = 1;

        // appleCount - 5
        if (appleCount > 5) {
            System.out.println("Apple Juice");
        }
        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        boolean powderForPancakes = powderAmount >= 400;
        boolean sugarForPancakes = sugarAmount >= 10;
        boolean milkForPancakes = milkAmount >= 1;
        boolean oilForPancakes = oilAmount >= 30;
        boolean doItPancakes = powderForPancakes && sugarForPancakes && milkForPancakes && oilForPancakes;

        if (doItPancakes) {
            System.out.println("Pancakes");
        }
        //milk - 300 ml, powder - 5 g, eggs - 5
        boolean milkForOmelette = milkAmount >= 300;
        boolean powderForOmelette = powderAmount >= 5;
        boolean eggsForOmelette = eggsCount >= 5;
        boolean doItOmelette = milkForOmelette && powderForOmelette && eggsForOmelette;
        if (doItOmelette) {
            System.out.println("Omelette");
        }
        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        boolean applesForApplePie = appleCount >= 3;
        boolean milkForApplePie = milkAmount >= 100;
        boolean powderForApplePie = powderAmount >= 300;
        boolean eggsForApplePie = eggsCount >= 4;
        boolean doItApplePie = applesForApplePie && milkForApplePie && powderForApplePie && eggsForApplePie;
        if (doItApplePie) {
            System.out.println("Apple pie");
        }

        boolean goToMagazine = appleCount > 5 || doItPancakes || doItOmelette || doItApplePie;
        if (!goToMagazine) {
            System.out.println("Пора сходить в магазин :)");
        }
    }
}
