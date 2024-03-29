public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte b = 5;
        short s = 200;
        int i = 10000;
        long l = 1000000L;
        float f = 1.0f;
        double d = 23.46;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        //Задача 2
        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;
        //Задача 3
        byte studentsLudPav = 23;
        byte studentsAnnSerg = 27;
        byte studentsEkatAndr = 30;
        int studentsTotal = studentsEkatAndr + studentsAnnSerg + studentsLudPav;
        short paperSheetCount = 480;
        int paperSheetCountPerStudent = paperSheetCount / studentsTotal;
        System.out.println("На каждого ученика рассчитано " + paperSheetCountPerStudent + " листов бумаги");
        //Задача 4
        byte extruderSpeedPerMin = 16 / 2;
        int bottlesPer20Min = extruderSpeedPerMin * 20;
        int bottlesPerDay = bottlesPer20Min * 3 * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 31;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        //Задача 5
        byte PaintCanQuantTot = 120;
        byte PaintCanQuantPerClassWhite = 2;
        byte PaintCanQuantPerClassBrown = 4;
        int ClassQuant = PaintCanQuantTot / (PaintCanQuantPerClassBrown + PaintCanQuantPerClassWhite);
        int PaintCanQuantWhiteTot = ClassQuant * PaintCanQuantPerClassWhite;
        int PaintCanQuantBrownTot = PaintCanQuantWhiteTot * 2;
        System.out.println("В школе, где " + ClassQuant + " классов, нужно " + PaintCanQuantWhiteTot + " банок белой краски и " + PaintCanQuantBrownTot + " банок коричневой краски");
        //Задача 6
        byte bananaWeight = 80;
        byte bananaQuant = 5;
        byte milkWeightPer100Ml = 105;
        byte milkQuant = 2;
        byte icecreamWeight = 100;
        byte icecreamQuant = 2;
        byte eggWeight = 70;
        byte eggQuant = 4;
        int totalWeightGrams = bananaWeight * bananaQuant + milkWeightPer100Ml * milkQuant + icecreamWeight * icecreamQuant + eggWeight * eggQuant;
        float totalWeightKilo = totalWeightGrams / 1000f;
        System.out.println("Вес завтрака " + totalWeightGrams + " грамм, или " + totalWeightKilo + " килограмм");
        //Задача 7
        short dietSpeedMax = 500;
        short dietSpeedMin = 250;
        int dietSpeedMid = (dietSpeedMax + dietSpeedMin) / 2;
        short weighLoss = 7000;
        int dietDaysMax = weighLoss / dietSpeedMin;
        int dietDaysMin = weighLoss / dietSpeedMax;
        int dietDaysMid = weighLoss / dietSpeedMid;
        System.out.println("На похудение уйдет от " + dietDaysMin + " до " + dietDaysMax + " дней, в среднем - " + dietDaysMid + " дней");
        //Задача 8
        //старые зп
        int mashaSalaryOld = 67760;
        int denSalaryOld = 83690;
        int kristSalaryOld = 76230;
        //новые зп
        int mashaSalaryNew = mashaSalaryOld + mashaSalaryOld / 10;
        int denSalaryNew = denSalaryOld + denSalaryOld / 10;
        int kristSalaryNew = kristSalaryOld + kristSalaryOld / 10;
        //годовой прирост
        int mashaYearDiff = (mashaSalaryNew - mashaSalaryOld) * 12;
        int denYearDiff = (denSalaryNew - denSalaryOld) * 12;
        int kristYearDiff = (kristSalaryNew - kristSalaryOld) * 12;
        //выводим
        System.out.println("У Маши зарплата стала " + mashaSalaryNew + " рублей в месяц, а годовой доход вырос на " + mashaYearDiff + " рублей");
        System.out.println("У Дениса зарплата стала " + denSalaryNew + " рублей в месяц, а годовой доход вырос на " + denYearDiff + " рублей");
        System.out.println("У Кристины зарплата стала " + kristSalaryNew + " рублей в месяц, а годовой доход вырос на " + kristYearDiff + " рублей");





    }
}