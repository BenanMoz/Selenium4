package arraysAndListsAndAyncWork;

import com.google.common.base.Ascii;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TT
{

    @Test
    public static void main0() {
        char c1 = '\n' ;
        String c2 = " \\\303\\255\\ " ;
        char c3 = '\u0255';

        //char c3 = '\400'; // A compile-time error. Octal 400 is out of range
       // char c3 = '\42';
        char c4 = '\10';  // Same as '\n'

        //System.out.println(c1);/*from   w w  w. j a va2 s  .  co m*/
       //System.out.println(c2);
        System.out.println(c3);
       // System.out.println("\\u0251 + \\u0301");

       //System.out.println(c3);
     //  System.out.println(c4);
    }
    @Test
    public void main1(){
        String rawString = "Entwickeln Sie mit Vergnügen ¢ È)";
        System.out.println(rawString);
        ByteBuffer buffer = StandardCharsets.UTF_8.encode(rawString);
        String utf8EncodedString = StandardCharsets.UTF_8.decode(buffer).toString();
        System.out.println(utf8EncodedString);
        System.out.println("Libert\\303\\251 Greek Yogourt");
    }
    @Test
    public void main2() {
        String rawString = "Nut Cheerios, Libert\303\251 Greek Yogourt";
        String octal = Integer. toOctalString(Integer. parseInt(rawString,16));
       // byte[] byte2 = rawString.getBytes(StandardCharsets.UTF_8);
        System.out.println(rawString);
        System.out.println(octal);

       // System.out.println(byte2.toString());

        byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(utf8EncodedString);
    }

    @Test
    public void main3(){
        String rawString = "text: General Mills Honey Nut Cheerios, Libert\303\251 Greek Yogourt, Selected Varieties, $4.98 Ea.";
        byte[] bytes6 = rawString.getBytes(StandardCharsets.UTF_8);


        // Scanner sc = new Scanner(System.in);
       // String str = sc.next();
        StringBuffer sb = new StringBuffer();
        //Converting string to character array
       //for(int i = 0; i < ch.length; i++) {
           // String hexString = Integer.toHexString(ch[i]);
        //    sb.append(hexString);

      //  String result = sb.toString();
     //   System.out.println(result);



            char[] decoded = new char[rawString.length()];
            char[] newmessage = rawString.toCharArray();
        System.out.println(newmessage);
            int ascii;
        byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);
        String value = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(value);

        char [] output = StandardCharsets.US_ASCII.decode(ByteBuffer.wrap(bytes)).array();
        //char [] output2 = StandardCharsets.US_ASCII.decode(ByteBuffer.wrap(bytes.getBytes(StandardCharsets.UTF_8))).array();
        System.out.println(output);
       // System.out.println(output2);
        System.out.println(bytes.toString());

}}
