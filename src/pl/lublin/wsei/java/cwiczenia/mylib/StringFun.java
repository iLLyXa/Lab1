package pl.lublin.wsei.java.cwiczenia.mylib;

public class StringFun {
    public static boolean isPalindrome(String word)
    {
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public static String anarhize(String text)
    {
        String[] tokens = text.split(" ");
        for (int i = 0; i < tokens.length; i++)
        {
            int il_symb = tokens[i].length();
            for(int j = 0; j < il_symb; j++)
            {
                //char symb = tokens[i].charAt(j + 1);
                tokens[i] = tokens[i].substring(j + 1).toUpperCase();
            }
        }
        return tokens[1];
    }
}
