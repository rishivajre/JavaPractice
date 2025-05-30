public class reverseStringSB {
    // Reverse a string using StringBuilder in Java
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");

        for (int i=0; i<sb.length()/2; i++){
            //swap characters at index i and length-i-1
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1, temp);
        }
        System.out.println(sb); // Output: olleH

        for (int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb); // Output: Hello

        // OR || Alternatively, you can use the following method:
        StringBuilder sb2 = new StringBuilder("World");
        sb2.reverse();
        System.out.println(sb2); // Output: dlroW

        // OR || Alternatively, you can use the following method:
        String str2 = "World 2";
        String reversedstr2 = new StringBuilder(str2).reverse().toString();
        System.out.println(reversedstr2); // Output: dlroW

    }
}
