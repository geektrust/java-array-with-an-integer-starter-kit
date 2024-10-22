import java.util.Arrays;

public class Main {

    /* Implement your solution inside this method. */
    public int[] handle(int[] nums, int target) {
        // WRITE YOUR CODE HERE.
        return nums;
    }

    /*
     ***********************************************
     * This is the driver code. Don't change it!!!
     * *********************************************
     */
    public static void main(String[] args) {
        /*
         * Format of the 'args' array: [`"[10, 20, 30, 40, 50]", "90"`]
         */
        for (String arg : args) {
            processArgs(arg);
        }
    }

    /*
     * This method parses each input and assigns it to different variables.
     * The value of the function parameter "input" will be in the format 
     * "[10, 20, 30, 40, 50], 90".
     */
    private static void processArgs(String input) {
        String[] inputParts = input.replaceAll("\"", "").split(", ");
        String[] arrayString = inputParts[0].replaceAll("[\\[\\]]", "").split(", ");
        int[] numbers = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(inputParts[1]);

        int[] output = new Main().handle(numbers, target);
        System.out.println(Arrays.toString(output));
    }


}
