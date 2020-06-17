import java.util.Scanner;

public class FullDate {
    public static void main (String[] args){
        Scanner monthscann = new Scanner(System.in);
        String month = "";
        System.out.println("Please enter the month");
        int usermont = monthscann.nextInt();
        if(usermont == 1){
            month = "January";
        }
        else if(usermont == 2)
        {
            month = "Feberary";
        }
        else if(usermont == 3)
        {
            month = "March";
        }
        else if(usermont == 4)
        {
            month = "Apri";
        }
        else if(usermont == 5)
        {
            month = "May";
        }
        else if(usermont == 6)
        {
            month = "June";
        }
        else if(usermont == 7)
        {
            month = "July";
        }
        else if(usermont == 8)
        {
            month = "August";
        }
        else if(usermont == 9)
        {
            month = "September";
        }
        else if(usermont == 10)
        {
            month = "October";
        }
        else if(usermont == 11)
        {
            month = "November";
        }
        else if(usermont == 12)
        {
            month = "December";
        }
System.out.println("Please Enter the day");
        Scanner dayofmonth = new Scanner(System.in);
        int daymo = dayofmonth.nextInt();

        dayofmonth.nextLine();
        String year = "20";
        System.out.println("Enter the last digit year");
        String inputyear = dayofmonth.nextLine();
        year = year + inputyear;
        String message = month + " " + daymo + " " + year;
         System.out.println(message);



    }
}
