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
    public static void task1(){
        byte a = 127;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 32767;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 123456;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 123456789L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.2f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1.3;
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2(){
       float a =  27.12f;
        System.out.println(a);
       long l = 987678965549L;
        System.out.println(l);
        double d = 2.786;
        System.out.println(d);
        short s = 569;
        System.out.println(s);
        short s1 = -159;
        System.out.println(s1);
        int i = 27897;
        System.out.println(i);
        byte b =67;
        System.out.println(b);

    }
    public static void task3(){
        byte ludPetr = 23;//ученики
        byte anSerg = 27;
        byte ekAndr = 30;
        byte totalStudents = (byte)(ludPetr+anSerg+ekAndr);
short paper = 480;
int paperToPupil = paper/totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperToPupil +" листов бумаги");
    }
    public static void task4(){
        byte bottlesInMinute = 16/2;
        byte time = 20;
        System.out.println("За "+time+" мин машина произвела " + bottlesInMinute*time +" штук бутылок");
        short minutesInDay = 24*60;
        System.out.println("За сутки машина произвела " + bottlesInMinute*minutesInDay +" штук бутылок");
        short minutesIn3Days = (short) (minutesInDay*3);
        System.out.println("За 3 дня машина произвела " + bottlesInMinute*minutesIn3Days +" штук бутылок");
    int minutesInMonth = minutesInDay*30;
        System.out.println("За месяц машина произвела " + bottlesInMinute*minutesInMonth +" штук бутылок");
    }
    public static void task5(){
        byte totalCans = 120;
        byte whitePaintInClass = 2;
        byte brownPaintInClass = 4;
        byte totalCansInClass = (byte)(whitePaintInClass+brownPaintInClass);
        byte totalClassRooms = (byte)(totalCans/totalCansInClass);
        byte totalWhite = (byte) (totalClassRooms*whitePaintInClass);
        byte totalBrown = (byte) (totalClassRooms*brownPaintInClass);
        System.out.println("«В школе, где " + totalClassRooms+" классов, нужно "+ totalWhite+" банок белой краски и "+totalBrown+" банок коричневой краски»");
    }
    public static void task6() {
    byte bananas = 5;
    byte bananasWeight = 80;
byte banTotalWeight = (byte) (bananas*bananasWeight);
byte milkWeight = 105;//вес 100гр молока
        short milkTotalWeight = (short) (milkWeight*2);
        short iceCreamTotalWeight = 2*100;
        byte eggs = 4;
        byte eggsWeight = 70;
        short eggsTotalWeight = (short) (eggsWeight*eggs);
        short weightGr = (short) (eggsTotalWeight+iceCreamTotalWeight+milkTotalWeight+banTotalWeight);
        System.out.println("Масса завтрака в граммах равна - "+weightGr + " гр");
float weightKg = weightGr/ 1000f;
        System.out.println("Масса завтрака в килограммах равна - "+weightKg + " кг");;
    }
    public static void task7() {
     short weighInGrams =7*1000;
     short lostWeight1 = 250;
     short lostWeight2=500;
     short daysWith250 = (short) (weighInGrams/lostWeight1);
        System.out.println(daysWith250+ " дней понадобится, если терять по 250 гр");
     short daysWith500 = (short) (weighInGrams/lostWeight2);
        System.out.println(daysWith500+ " дней понадобится, если терять по 500 гр");
     short middleDays = (short) ((daysWith500+daysWith250)/2);
        System.out.println(middleDays+ " дней понадобится в среднем");
    }
    public static void task8(){
       int masha = 67760;//зп до повышения
       int denis = 83690;//зп до повышения
       int kristina = 76230;//зп до повышения
       int mashaYearOld = masha*12; // годовой доход до повышения
       int denisYearOld = denis*12;// годовой доход до повышения
       int kristinaYearOld = kristina*12;// годовой доход до повышения
        int riseMasha = (int)(masha*0.1); // на сколько повысили
        int riseDen = (int) (denis*0.1);// на сколько повысили
        int riseKris = (int)(kristina*0.1);// на сколько повысили
        int mashaNewSalary = masha+riseMasha;// новая зп
        int denisNewSalary = denis+riseDen;// новая зп
        int kristinaNewSalary = kristina+riseKris;// новая зп
        int mashaDifference = (mashaNewSalary*12)-mashaYearOld;//разница за 12 месяцев
        int denisDifference = (denisNewSalary *12)-denisYearOld;//разница за 12 месяцев
        int krisDifference = (kristinaNewSalary*12)-kristinaYearOld;//разница за 12 месяцев
        System.out.println("Маша теперь получает "+mashaNewSalary+" рублей. Годовой доход вырос на "+mashaDifference+" рублей");
        System.out.println("Денис теперь получает "+denisNewSalary+" рублей. Годовой доход вырос на "+denisDifference+" рублей");
        System.out.println("Кристина теперь получает "+kristinaNewSalary+" рублей. Годовой доход вырос на "+krisDifference+" рублей");
    }
}