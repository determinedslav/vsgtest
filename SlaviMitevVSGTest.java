import java.util.ArrayList;
import java.util.List;

public class SlaviMitevVSGTest{
    public static void main(String[] args) {
        /**Question 1*/
        System.out.println("---------- Question 1");

        System.out.println("Enter word:");
        String word = System.console().readLine();;

        char c1 = word.charAt(word.length()-1);
        char c2 = word.charAt(word.length()-2);

        String lastLetters = c1 + " " + c2;

        System.out.println(lastLetters);


        /**Question 2*/
        System.out.println("---------- Question 2");

        System.out.println("Enter number:");
        int n = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= n; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%3==0){
                System.out.println("Fizz");
            } else if (i%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        /**Question 3*/
        System.out.println("---------- Question 3");

        System.out.println("Enter array size:");
        int size = Integer.parseInt(System.console().readLine());
        int numbers[] = new int[size];

        System.out.println("Enter array numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(System.console().readLine());
        }

        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    if (!duplicates.contains(numbers[i])) {
                        duplicates.add(numbers[i]);
                    }
                }
            }
        }
        System.out.println("Number of non-unique values: " + duplicates.size());
    }
}