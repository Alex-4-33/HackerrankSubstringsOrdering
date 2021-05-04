import java.util.Scanner;

public class Hackerrank_Substrings_Ordering {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int s_length = s.length();
        smallest = s.substring(0,k);

        for (int i = 0; i < s_length-k+1; i++) {
            if (s.substring(i, i + k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i + k);
                //If current substring is smaller than the current 'smallest' then make it smallest
            }
                if (s.substring(i, i + k).compareTo(largest) > 0) {
                    largest = s.substring(i, i + k);
                    //If current substring is larger than the current 'largest' then make it largest
                }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scan.next();
        System.out.println("Enter the length of the substrings to find:");
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}