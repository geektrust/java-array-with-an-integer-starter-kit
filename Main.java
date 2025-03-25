import java.util.Arrays;

public class Main {
    /*
     ***********************************************
     * This is the driver code. Don't change it!!!
     * *********************************************
     */
    public static void main(String[] args) {
        for (String arg : args) {
            processArgs(arg);
        }
    }
    /*
     * This method parses each input and assigns it to different variables.
     * The value of the function parameter "input" will be in the format 
    * "2, 7, 11, 15 | 9".
     */
    private static void processArgs(String input) {
        String[] parts = input.split(" \\| ");
        String[] numStrs = parts[0].split(", ");
        int target = Integer.parseInt(parts[1]);
        int[] nums = Arrays.stream(numStrs)
                           .mapToInt(Integer::parseInt)
                           .toArray();
        int[] output = new Solution().handle(nums, target);
        System.out.println(Arrays.toString(output));
    }
}
