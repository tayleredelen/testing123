package exercises.Ch3;

//4) Imported class
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        //1) Create and initialize array
        int[] nums = {1, 1, 2, 3, 5, 8};

        //2a) Loop thru array & print each value
//        for (int i : nums) {
//            System.out.println(i);
//        }

        //2b) Modify to print only odd numbers
        for (int i = 0; i < nums.length; i++) { //iterate thru nums length
            if (nums[i] % 2 != 0) { //if nums index modulus 2 is not 0
                System.out.println(nums[i]);
            }
        }
        //3) Use split method to divide at each space & store in individual array
        String story = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
//        String[] splitStory = story.split(" "); //split at spaces

        //4) Print array of words
//        System.out.println(Arrays.toString(splitStory)); //imported Arrays class above

        //5) Split string into separate sentences
        String[] splitStory = story.split("\\."); //split at sentences
        System.out.println(Arrays.toString(splitStory)); //imported Arrays class above

    }
}
