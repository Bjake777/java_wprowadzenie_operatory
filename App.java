
public class App {
    public static void main(String[] args) {
        
        //zad1
        
        double tf = 23.31;
        double tc;

        tc = (tf-32)*5/9;

        System.out.println("TF: "+tf);
        System.out.println("TC: "+tc);

        //zad2
        double promien =7;
        double pi = 3.14;
        double obwod =2*pi*promien;

        System.out.println("obwód koła wynosi: "+obwod);
        
        //zad3
        int kilometers = 10;
        int minutes = 5;
        int days = 0;
        double accountBalance = 70;

        System.out.println("kilometers: "+kilometers);
        System.out.println("minutes: "+minutes);
        System.out.println("accountBalance: "+accountBalance);

        //zad4
        int number1 = 5;
        int number2 = 9;
        int additionResult = number1 + number2;
        System.out.println("addition result: " + additionResult);

    }
    
}