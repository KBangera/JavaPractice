import  java.util.*;
/**
 * Created by yogendra on 29-09-2017.
 */
public class PalindromePermutation {

    public static int getCharNumber(Character c){
        int a=Character.getNumericValue('a');
        int z=Character.getNumericValue('z');

        int val=Character.getNumericValue(c);
        if(a<=val&&val<=z){
            return val-a;
        }
        else{

            return -1;
        }
    }

    public static boolean isPermutationOfPalindrome(String phrase) {
        int countOdd=0;
        int[] table=new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for(char c:phrase.toCharArray()){
            int x=getCharNumber(c);
            if(x!=-1){
                table[x]++;
                if(table[x]%2==1){
                    countOdd++;
                }
            }
            else
            {
                countOdd--;
            }
        }

        return countOdd<=1;
    }


    public static void main(String[] args) {
        String pali = "Ratzs live on no evil starz";
        System.out.println(isPermutationOfPalindrome(pali));
        String pali2 = "Zeus was deified, saw Suez";
        System.out.println(isPermutationOfPalindrome(pali2));
    }
}
