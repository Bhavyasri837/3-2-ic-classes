public class frequency_of_character  {
    public static void main(String[] args) {
        String str = "hello world";

        // Assuming ASCII characters
        int[] freq = new int[256]; // Array size 256 to cover all ASCII

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // Skip spaces if desired
                freq[ch]++;
            }
        }

        // Print frequency of characters
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}

