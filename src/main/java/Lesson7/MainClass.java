package Lesson7;

public class MainClass {

    public static void main(String[] args) {
        Cat[] arrCats = new Cat[3];
        arrCats[0] = new Cat("Мурзик", 50);
        arrCats[1] = new Cat("Асик", 30);
        arrCats[2] = new Cat("Рыжик", 20);


        Plate plate = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        plate.addFood(50);
        plate.info();
    }
}