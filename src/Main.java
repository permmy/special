public class Main {

    private static void reverse(char str[])
    {
        // Initialize start and end indexes as start (s)input_string.length-1, end(k) = 0
        int s = str.length - 1, k = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (k < s)
        {
            // Ignore special characters
            if (!Character.isAlphabetic(str[k]))
                k++;
            else if(!Character.isAlphabetic(str[s]))
                s--;

                // Both str[l] and str[r] are not special
            else
            {
                //swap str[l] and str[r]
                char handler = str[k];
                str[k] = str[s];
                str[s] = handler;
                k++;
                s--;
            }
        }
    }

    public static void main(String[] args) {

        String str = "a,b$c";
        char[] charArray = str.toCharArray();
        System.out.println("Original string: " + str);
        reverse(charArray);
        System.out.println("Output string: " + new String(charArray));
    }
}
