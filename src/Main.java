//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println( "Задача 1");
        byte variableOne = 1;
        System.out.println (" Значение переменной variableone с типом byte равно" + variableOne );
        short variableTwo = 300;
        System.out.println( "Значение переменной variableoTwo с типом short равно" + variableTwo );
        int variableThree = 35000;
        System.out.println( "Значение переменной variableoThree с типом int  равно" + variableThree );
        long variableFour = 3000000L;
        System.out.println( "Значение переменной variableoFour с типом long равно" + variableFour );
        float variableFive = 3.4f;
        System.out.println( "Значение переменной variableoFive с типом float равно" + variableFive );
        double variableSix = -1.7E+20;
        System.out.println( "Значение переменной variableoSix с типом double равно" + variableSix );

        System.out.println( "Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        byte f = 67;
        short g = 27897;

        System.out.println( "Задача 3");
        byte firstClassStudents = 23;
        byte secondClassStudents = 27;
        byte thirdClassStudents = 30;
        short totalPaper = 480;
        int totalStudents = firstClassStudents + secondClassStudents + thirdClassStudents;
        int sheetsForOneStudent = totalPaper / totalStudents;
        System.out.println( "На каждого ученика рассчитано " + sheetsForOneStudent + " листов бумаги" );

        System.out.println( "Задача 4");
        byte bottlesInTwoMinutes = 16;
        int bottlesInOneMinute = bottlesInTwoMinutes / 2;
        int  bottlesInTwentyMinutes = bottlesInOneMinute * 20;
        System.out.println( "За 20 минут машина произвела " + bottlesInTwentyMinutes + "штук бутылок");
        int bottlesPerHour = bottlesInTwentyMinutes * 3;
        int bottlesPerDay = bottlesPerHour * 24;
        System.out.println( "За сутки машина произвела " + bottlesPerDay + "штук бутылок");
        int bottlesInThreeDays = bottlesPerDay * 3;
        System.out.println( "За три дня машина произвела " + bottlesInThreeDays + "штук бутылок");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println( "За месяц машина произвела " + bottlesPerMonth + "штук бутылок");

        System.out.println( "Задача 5");
        short totalCansOfPaint = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        int forOneClassOfPaintCans = whitePaintForOneClass + brownPaintForOneClass;
        int totalGradesAtSchool = totalCansOfPaint / forOneClassOfPaintCans;
        int whitePaintForAllClasses = totalGradesAtSchool * whitePaintForOneClass;
        int brownPaintForAllClasses = totalGradesAtSchool * brownPaintForOneClass;
        System.out.println( " В школе, где 20 классов, нужно 40 банок белой краски и 80 банок коричневой краски");

        System.out.println( "Задача 6");


    }
}