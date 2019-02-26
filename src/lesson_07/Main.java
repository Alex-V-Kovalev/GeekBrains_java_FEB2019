package lesson_07;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.increaseFood(25);
        Cat[] cats = new Cat[10];
        catsInit(cats);
        printCatsInfo(cats);
        plate.info();
        catsEat(plate, cats);
        printCatsInfo(cats);
        plate.info();
    }

    private static void printCatsInfo(Cat[] cats) {
        for (Cat cat :
                cats) {
            cat.info();
        }
    }

    private static void catsEat(Plate plate, Cat[] cats) {
        for (Cat cat :
                cats) {
            cat.eat(plate);
        }
    }

    private static void catsInit(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
    }


}
