import hcfCaculator.HCF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HCFMain {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number did you want check their Highest common factor");
        int noOfNumbers = scanner.nextInt();
        for (int index = 0; index < noOfNumbers; index++) {
            System.out.println("Enter the " + (index + 1) + " number");
            int number = scanner.nextInt();
            values.add(number);
        }

        int[] variableLengthArgument = HCF.convertListToArray(values);
        System.out.println(Arrays.toString(HCF.highestCommonFactor(variableLengthArgument)));
    }

}
