package TwoPointers;
// Valid Palindrome
import java.util.ArrayList;
import java.util.Scanner;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        ArrayList<String> myList1 =new ArrayList<>();
        ArrayList<String> myList2 =new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isAlphabetic(c)){
                myList1.add(String.valueOf(Character.toLowerCase(c)));
            }
            if(Character.isDigit(c)){
                myList1.add(String.valueOf((c)));
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            char c= s.charAt(i);
            if(Character.isAlphabetic(c)){
                myList2.add(String.valueOf(Character.toLowerCase(c)));
            }
            if(Character.isDigit(c)){
                myList2.add(String.valueOf((c)));
            }
        }
        return myList1.equals(myList2);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(isPalindrome(s));
    }
}
