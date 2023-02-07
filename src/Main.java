public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temp = 5;
        if (temp < 5){
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println("\n");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("\n");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 25;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if(age > 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        System.out.println("\n");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int ageChild = 15;
        boolean adult = true;

        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild < 14 && adult) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (ageChild >= 5 && ageChild < 14 && !adult) {
            System.out.println("Если возраст ребенка равен " + ageChild + " и нет взрослого, то ему нельзя кататься на аттракционе");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("\n");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int place = 103;
        if (place <= 60){
            System.out.println("Есть место в вагоне, ваше место " + place + " - сидячее");
        }
        else if (place > 60 && place <= 102){
            System.out.println("Есть место в вагоне, ваше место стоячее");
        }
        else {
            System.out.println("В вагоне нет мест");
        }
        System.out.println("\n");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 17;
        int two = 23;
        int three = 14;
        if (one > two){
            if (one > three){
                System.out.println("Первое число " + one + " наибольшее");
            }
            else {
                System.out.println("Третье число " + three + " наибольшее");
            }
        }
        else {
            if (two > three){
                System.out.println("Второе число " + two + " наибольшее");
            }
            else {
                System.out.println("Третье число " + three + " наибольшее");
            }
        }

    }
}