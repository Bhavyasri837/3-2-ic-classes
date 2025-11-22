public class character_repetition_in_a_string {
    public static void main(String[] args) {
        String str = "programming";

        System.out.println("Repeating characters are:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if this character was already printed
            if (str.indexOf(ch) != i) continue;

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(ch + " : " + count);
            }
        }
    }
}

