public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
            }
    public static void task4 () {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var totalWeight = boxerFirst + boxerSecond;
        System.out.println("общий вес двух бойцов " + totalWeight);
        var weightDifference = boxerSecond - boxerFirst;
        System.out.println("разница между весами двух бойцов " + weightDifference);
    }
    public static void task7 () {
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var weightDifference = boxerSecond - boxerFirst;
        System.out.println(weightDifference);
        weightDifference = boxerSecond % boxerFirst;
        System.out.println("разница в весе двух боксеров " + weightDifference);
    }
    public static void task8 () {
        var totalWorkingTime = 640;
        var employeeWorkingHours = 8;
        var totalEmployees = totalWorkingTime / employeeWorkingHours;
        System.out.println("Всего работников в компании-" + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println("Всего работников в компании стало-" + totalEmployees + " человек");
        totalWorkingTime = totalEmployees * employeeWorkingHours;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalWorkingTime + "часов работы может быть поделено между сотрудниками");

    }
}




