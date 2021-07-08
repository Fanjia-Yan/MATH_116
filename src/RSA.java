public class RSA {
    /** fast powering n^pow (mod) **/
    public static int fast_powering(int n, int pow, int mod){
        String binary = Integer.toBinaryString(pow);
        int result = 1;
        for (int i = binary.length() - 1; i >= 0 ; i = i - 1){
            if (binary.charAt(i) == '1') result = result * n % mod;
            n = n % mod  * n % mod;
        }
        return result % mod;
    }

    /** convert words to binary 8 digit bytes **/
    public static String word_to_byte(String word){
        String byte_sequence = "";
        for (int i = 0; i < word.length(); i = i + 1){
            int ascii = word.charAt(i);
            String asciiCode = Integer.toBinaryString(ascii);
            while (asciiCode.length() != 8) asciiCode = '0' + asciiCode;
            byte_sequence += asciiCode;
        }
        return byte_sequence;
    }

    /** convert 8 digit bytes string back to word **/
    public static String byte_to_word(String byte_sequence){
        if (byte_sequence.length() % 8 != 0) return null;
        String word = "";
        char[] temp = new char[8];
        for(int i = 0; i < byte_sequence.length();i = i + 8){
            byte_sequence.getChars(i,i+8,temp,0);
            word += (char)Integer.parseInt(String.valueOf(temp),2);
        }
        return word;
    }
}
