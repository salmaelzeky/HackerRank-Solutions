import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String substr, substr2, substr3;
    substr = s.substring(s.length()-2, s.length());
    substr2 = s.substring(0, 2);
    substr3 = s.substring(0,s.length()-2);
    int hour = Integer.parseInt(substr2);
    System.out.println(hour);
    String updatedDate = "";
    if(substr.equals("PM")){
        if(substr2.equals("12")){
                updatedDate =  "12"+substr3.substring(2,substr3.length()) ;

        }
        else{
        hour += 12;
        String hourString = Integer.toString(hour);
        System.out.println("h " + hourString);    
        updatedDate =  hourString+substr3.substring(2,substr3.length()) ;
    
        

    }
    }
    else{
          if(substr2.equals("12")){
                updatedDate =  "00"+substr3.substring(2,substr3.length()) ;

        }
        else{
                    updatedDate = substr3;

        }
    }
    
    return updatedDate;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
