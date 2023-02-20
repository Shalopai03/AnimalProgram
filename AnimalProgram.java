abstract class Chert {
    abstract void eat();
    abstract void sleep();
    abstract void talk();
}

class Hare extends Chert {
    public void eat() {
        System.out.println("Заяц ест.");
    }

    public void sleep() {
        System.out.println("Заяц спит.");
    }

    public void talk() {
        System.out.println("Заяц визжит как человек!");
    }
}

class Tiger extends Chert {
    public void eat() {
        System.out.println("Тигр ест.");
    }

    public void sleep() {
        System.out.println("Тигр спит.");
    }

    public void talk() {
        System.out.println("Тигр:рычит");
    }
}

class Cat extends Tiger {
    public void talk() {
        System.out.println("Кот мяукает");
    }
}

public class AnimalProgram {
    public static void main(String[] args) {
        Chert chert = new Chert() {
            public void eat() {
                System.out.println("Черт жрет.");
            }

            public void sleep() {
                System.out.println("Черт спит.");
            }

            public void talk() {
                System.out.println("Черт ревет");
            }
        };

        Hare hare = new Hare();
        Tiger tiger = new Tiger();
        Cat cat = new Cat();

        chert.eat();
        chert.sleep();
        chert.talk();

        hare.eat();
        hare.sleep();
        hare.talk();

        tiger.eat();
        tiger.sleep();
        tiger.talk();

        cat.eat();
        cat.sleep();
        cat.talk();
    }
}