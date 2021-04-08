
public class App {
    public static void main(String[] args) {
        
        //zad1
        System.out.println("zad1");
        double tf = 23.31;
        double tc;

        tc = (tf-32)*5/9;

        System.out.println("TF: "+tf);
        System.out.println("TC: "+tc);
        System.out.println();
        
        //zad2
        System.out.println("zad2");
        double promien =7;
        double pi = 3.14;
        double obwod =2*pi*promien;
        System.out.println("obwód koła wynosi: "+obwod);
        System.out.println();
        
        //zad3
        System.out.println("zad3");
        int kilometers = 10;
        int minutes = 5;
        int days = 0;
        double accountBalance = 70;

        System.out.println("kilometers: "+kilometers);
        System.out.println("minutes: "+minutes);
        System.out.println("accountBalance: "+accountBalance);
        System.out.println();

        //zad4
        System.out.println("zad4");
        int number1 = 5;
        int number2 = 9;
        int additionResult = number1 + number2;
        System.out.println("addition result: " + additionResult);
        System.out.println();

        //zad5
        System.out.println("zad5");
        int a = 7;
        int b = 9;
        int c = 12;
        int triangleRegion;
        triangleRegion=a+b+c;
        System.out.println("perimeter of triangle: "+triangleRegion);
        System.out.println();

        //zad6
        System.out.println("zad6");
        int number = -5;

        int absoluteValue = (number<0)?(-1*number):number;
        System.out.println("absoluteValue: "+absoluteValue);
        System.out.println();

        //zad7
        System.out.println("zad7");
        double number3 = 47;
        double number4 = 35.5;
        number3%=10;
        number4%=6;
        System.out.println("remainder1: "+number3);
        System.out.println("remainder: "+number4);

    }
    
}