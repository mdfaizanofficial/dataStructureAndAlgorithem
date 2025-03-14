package src.Questions;
import java.util.Arrays;
/**
 * LeetCode1233
 */
public class LeetCode1233 {

    public static void main(String[] args) {
        System.out.println("LeetCode1233.main()");
        String folder[] = {"/a","/a/b/c","/a/b/d"};
        System.out.println(Arrays.toString(folder));
        Arrays.sort(folder);
        System.out.println(Arrays.toString(folder));
    }
    
}