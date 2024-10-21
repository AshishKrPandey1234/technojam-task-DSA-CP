public class Q4 {
    public static int compress(char[] chars) {
        int index = 0; 
        int i = 0;     
        while (i < chars.length) {
            char currentChar = chars[i]; 
            int count = 0;

            
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

           
            chars[index++] = currentChar;

            
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; 
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newSize = compress(chars);
        System.out.println("New length: " + newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}
