/*public class reverseStr{
     public static String reverse(String s){
        String word[]=s.trim().split("\\s+");
        StringBuilder ans=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            ans.append(word[i]).append(" ");
        }
        return ans.toString().trim();
    }
    public static  void main(String[]args){
        String s="Today is Sunday";
        System.out.print(reverse(s));
    }
   
}*/
public class reverseStr {

    public static String reverseWords(String s) {

        char[] arr = s.trim().toCharArray();

        // Step 1: Reverse entire string
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Step 2: Reverse individual words
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {

            if (i == arr.length || arr[i] == ' ') {

                left = start;
                right = i - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Java is easy"));
    }
}