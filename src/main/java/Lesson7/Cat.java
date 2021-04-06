package Lesson7;


public class Cat {
    private  final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    void info() {
        System.out.println(name + " хочет есть " + appetite + ".\n" + name + " начинает есть");
        String hungry = !satiety ? " еды хватило" : " еды не хватило";
        System.out.println(name + hungry);
    }

    public void eat(Plate p) {
        if (satiety && p.decreaseFood(appetite)) {
            satiety = false;
        }


    }
}