import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputStr = "hwfdawhwhcoomddfgwdc";
        int count = countVietnameseChars(inputStr);
        System.out.println("Output: " + count);
    }

    public static int countVietnameseChars(String inputStr) {
        List<String> vietnameseChars = new ArrayList<>();
        vietnameseChars.add("aw");
        vietnameseChars.add("aa");
        vietnameseChars.add("dd");
        vietnameseChars.add("ee");
        vietnameseChars.add("oo");
        vietnameseChars.add("ow");
        vietnameseChars.add("uw");
        vietnameseChars.add("w");

        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            for (int j = i + 1; j <= inputStr.length(); j++) {
                String substring = inputStr.substring(i, j);
                if (vietnameseChars.contains(substring)) {
                    count++;
                    i = j - 1;
                    break;
                }
            }
        }

        return count;
    }
}