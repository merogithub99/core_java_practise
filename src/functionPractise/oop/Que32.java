package functionPractise.oop;
//Write a Java method to display the current date and time.


import java.text.SimpleDateFormat;
import java.util.Date;

public class Que32 {

    static String displayTodayDate(){
        Date d= new Date();
        SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss");
        return sd.format(d);
    }

    public static void main(String[] args) {


        System.out.println("Today date and time is:"+displayTodayDate());
    }
}
