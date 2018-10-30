import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static boolean flip(){
        Random randomNum = new Random();
        int max = 100;    // Min not required, is default 0
        int x = randomNum.nextInt(max);
        if(x >= 50){
            //System.out.println("Test1" + x);

            return true;
        }
        else{
            //System.out.println("Test2" + x);

            return false;
        }

    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        reader.close();
        String result = "";
        int heads = 0;
        int tails = 0;

        for(int i = 0; i < n; i++  ){
            if(flip() == true){
                heads += 1;
                result += "H";
            }
            else{
                tails += 1;
                result += "T";
            }

        }
        System.out.println("no of heads = " + heads);
        System.out.println("no of tails = " + tails);
        System.out.println(result);

    }
}
