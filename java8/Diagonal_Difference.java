import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int leftSum = 0;
    int rightSum =0;
    for(int i =0; i<arr.size(); i++){
        for(int j =0; j<arr.size(); j++){
            if(arr.get(i).get(j) <=100 && arr.get(i).get(j) >=-100){
                if(i==j){
                //    System.out.println("n = " + arr.get(i).get(j));
                leftSum += arr.get(i).get(j);
                //System.out.println("l = " + leftSum);
            }
            if((i + j) == (arr.size() - 1)){
                 rightSum += arr.get(i).get(j);
            }
            }
         }
    }
    int totalSum = 0;
    if(rightSum>leftSum){
        totalSum = rightSum - leftSum;
    }
    else{
        totalSum = leftSum - rightSum;
    }
    return totalSum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}