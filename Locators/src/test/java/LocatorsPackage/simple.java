package LocatorsPackage;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

@Test
public class simple {
    public void test01() {
        String s1 = "2022-03-01";
        String s2 = "2022-03-02";
        String s3 = "August 9, 2022";
        Date a = StringToDate(s1);
        Date b = StringToDate(s2);
        System.out.println((b.getTime()-a.getTime())/8.64e+7);

    }
  //////use this use this use this use this
    @Test
    public void calculateDiscrepancyBetweenTodayDateAndApiDate() throws ParseException {
            Date mtoday = new Date(); //today
            Double result;
           //date from web
           SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
          String actualDate = "July 16, 2022";
           Date date = sdf.parse(actualDate);

         System.out.println((date.getTime()- mtoday.getTime())/8.64e+7);
       // result = (date.getTime()- mtoday.getTime())/8.64e+7;
     //   return result;
        }


    @Test
    public void test05(){
        LocalDateTime n = LocalDateTime.now();
        DateToString(n);
    }


    public Date StringToDate(String s){

        Date result = null;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            result  = dateFormat.parse(s);
           // DateTimeFormatter a =
        }

        catch(ParseException e){
            e.printStackTrace();

        }
        return result ;
    }

    @Test
    public void getTodayDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM 9, 2022");
        LocalDateTime now = LocalDateTime.now();
        String dateString = dtf.format(now);
       // System.out.println(dateString);
    }

    @Test
    public void gogo() throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
       // SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String actualDate = "August 9, 2022";
        Date date = sdf.parse(actualDate);
        /// NOW I H VAE REAL DATE TO COMPARE
        System.out.println(date);
    }

    public String DateToString(LocalDateTime date) {
        String result = date.toString();
        System.out.println(result);
        return result;

    }

}