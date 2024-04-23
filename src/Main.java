//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println( "Задача 1");
        byte variableOne = 1;
        System.out.println("Значение переменной variableOne с типом byte равно" + variableOne);
        short variableTwo = 300;
        System.out.println("Значение переменной variableTwo с типом short равно" + variableTwo);
        int variableThree = 35000;
        System.out.println("Значение переменной variableThree с типом int равно" + variableThree);
        long variableFour = 3000000L;
        System.out.println("Значение переменной variableFour с типом long равно" + variableFour);
        float variableFive = 3.4f;
        System.out.println("Значение переменной variableFive с типом float равно" + variableFive);
        double variableSix = -1.7E+20;
        System.out.println("Значение переменной variableSix с типом double равно" + variableSix);

        System.out.println( "Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        byte f = 67;
        short g = 27897;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        System.out.println( "Задача 3");
        byte firstClassStudents = 23;
        byte secondClassStudents = 27;
        byte thirdClassStudents = 30;
        short totalPaper = 480;
        int totalStudents = firstClassStudents + secondClassStudents + thirdClassStudents;
        int sheetsForOneStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsForOneStudent + " листов бумаги.");

        System.out.println( "Задача 4");
        byte bottlesInTwoMinutes = 16;
        int bottlesInOneMinute = bottlesInTwoMinutes / 2;
        int  bottlesInTwentyMinutes = bottlesInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinutes + "штук бутылок.");
        int bottlesPerHour = bottlesInTwentyMinutes * 3;
        int bottlesPerDay = bottlesPerHour * 24;
        System.out.println("За сутки машина произвела " + bottlesPerDay + "штук бутылок.");
        int bottlesInThreeDays = bottlesPerDay * 3;
        System.out.println("За три дня машина произвела " + bottlesInThreeDays + "штук бутылок.");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + "штук бутылок.");

        System.out.println( "Задача 5");
        short totalCansOfPaint = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        int forOneClassOfPaintCans = whitePaintForOneClass + brownPaintForOneClass;
        int totalGradesAtSchool = totalCansOfPaint / forOneClassOfPaintCans;
        int whitePaintForAllClasses = totalGradesAtSchool * whitePaintForOneClass;
        int brownPaintForAllClasses = totalGradesAtSchool * brownPaintForOneClass;
        System.out.println(" В школе, где" + totalGradesAtSchool + "классов, нужно" + whitePaintForAllClasses + "банок белой краски и " + brownPaintForAllClasses + " банок коричневой краски.");

        System.out.println( "Задача 6");
        byte weightOfOneBanana = 80;
        byte weightOfOneMilk = 105;
        byte weightOfOneiceCream = 100;
        byte weightOfOneEgg = 70;
        int massOfAllBananas = weightOfOneBanana * 5;
        int massOfAllMilk = weightOfOneMilk * 2;
        int massOfAllEgg = weightOfOneEgg * 4;
        int massOfAllIceCream = weightOfOneiceCream * 2;
        float massOfAllProducts = massOfAllBananas + massOfAllMilk + massOfAllEgg + massOfAllIceCream;
        System.out.println("Общая масса продуктов" + massOfAllProducts);
        float kgMassAllPoducts = massOfAllProducts / 1000;
        System.out.println("Вес спортзавтрака в граммах составляет " + massOfAllProducts);
        System.out.println("Вес спортзавтрака в килограммах составляет" + kgMassAllPoducts);

        System.out.println(" Задача 7");
        short kiloNeedToBeLost = 7;
        short gramPerDay = 250;
        int gramNeededToBeLost = kiloNeedToBeLost * 1000;
        int days = gramNeededToBeLost / gramPerDay;
        System.out.println(days + "дней потребуется спортсмену для того чтобы скинуть 7 кг.");
        short gramDay = 500;
        int gramNeedToBeLost = kiloNeedToBeLost * 1000;
        int justDays = gramNeedToBeLost / gramDay;
        System.out.println(justDays + "дней потребуется спортсмену для того чтобы скинуть 7 кг.");

        System.out.println(" Задача 8");
        int salaryMasha = 67760;
        System.out.println("Зарплата Маши " + salaryMasha);
        int salaryDenis = 83690;
        System.out.println("Зарплата Маши " + salaryDenis);
        int salaryKristina = 76230;
        System.out.println("Зарплата Маши " + salaryKristina);
        double procentIncrease = 10;
        double procentIncreaseSalary = procentIncrease / 100;
        double increasedSalaryM = salaryMasha * procentIncreaseSalary;
        double increasedSalaryD = salaryDenis * procentIncreaseSalary;
        double increasedSalaryK = salaryKristina * procentIncreaseSalary;
        double newSalaryM = salaryMasha + increasedSalaryM;
        double newSalaryD = salaryDenis + increasedSalaryD;
        double newSalaryK = salaryKristina + increasedSalaryK;
        double TotalSalaryExYearM = salaryMasha * 12;
        double TotalSalaryNewYearM = newSalaryM * 12;
        System.out.println("Маша будет получать" + newSalaryM + "рублей после увеличения зарплаты");
        System.out.println("Денис будет получать" + newSalaryD + "рублей после увеличения зарплаты");
        System.out.println("Кристина будет получать" + newSalaryK + "рублей после увеличения зарплаты");
        double salaryDifferenceM = TotalSalaryNewYearM - TotalSalaryExYearM;
        double TotalSalaryExYearD = salaryDenis * 12;
        double TotalSalaryNewYearD = newSalaryD * 12;
        double salaryDifferenceD = TotalSalaryNewYearD - TotalSalaryExYearD;
        double TotalSalaryExYearK = salaryKristina * 12;
        double TotalSalaryNewYearK = newSalaryK * 12;
        double salaryDifferenceK = TotalSalaryNewYearK - TotalSalaryExYearK;
        System.out.println(" Маша теперь получает" + newSalaryM + "рублей. Годовой доход вырос на " + salaryDifferenceM + "рублей.");
        System.out.println(" Денис теперь получает" + newSalaryD + "рублей. Годовой доход вырос на " + salaryDifferenceD + "рублей.");
        System.out.println(" Кристина теперь получает" + newSalaryK + "рублей. Годовой доход вырос на " + salaryDifferenceK + "рублей.");


    }
}