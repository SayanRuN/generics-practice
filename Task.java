package lesson_4_1_generics.task_3;

import lesson_4_1_generics.task_3.fruit.Apple;
import lesson_4_1_generics.task_3.fruit.Banana;
import lesson_4_1_generics.task_3.fruit.Fruit;
import lesson_4_1_generics.task_3.vegetable.Cabbage;

public class Task {

    public static void run() {
        FruitBox<String, Banana> bananaBox = new FruitBox<>("banana", new Banana());
        bananaBox.getObj().printClass();

        FruitBox<String, Apple> appleBox = new FruitBox<>("apple", new Apple());
        appleBox.getObj().printClass();

        FruitBox<String, Fruit> fruitBox = new FruitBox<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }
}
