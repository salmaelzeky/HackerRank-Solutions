import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.text.DecimalFormat;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
   
    
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double posCount = 0;
    double negCount = 0;
    double zeroCount = 0;
    
    int n = arr.size();
    if(n > 0 && n <= 100){
    for(int i = 0; i < arr.size(); i++){
       if(arr.get(i)<=100 && arr.get(i)>=-100){
        if(arr.get(i)<0 && arr.get(i) != 0 ){
            negCount++;
        }
        else if(arr.get(i)>0 && arr.get(i) != 0){
            posCount++;
        }
        else if (arr.get(i)==0){
            zeroCount++;
        }
      }
    } 
    }
    
    DecimalFormat df= new DecimalFormat("#0.000000");
    System.out.println(df.format(posCount/n));
    System.out.println(df.format(negCount/n));
    System.out.println(df.format(zeroCount/n));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
