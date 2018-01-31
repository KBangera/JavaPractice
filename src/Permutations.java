import  java.util.*;
/**
 * Created by yogendra on 29-09-2017.
 */
public class Permutations {
    boolean permutation(String s1, String s2){
        if(s1.length()!=s2.length()) {
        return false;
        }
        int[] letters=new int[128];

        char[] s1_array=s1.toCharArray();

        for(char c:s1_array) {
            //ASCII values get incremented
            letters[c]++;
            System.out.println(letters[c]);
        }

        char[] s2_array=s2.toCharArray();

        for(char c:s2_array) {
            //ASCII values get incremented
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
            System.out.println(letters[c]);
        }
        /**for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }*/

        return true;
    }
    public static void main(String args[]){
        Permutations obj=new Permutations();
        String input1="Gekss";
        String input2="skGee";


        if(obj.permutation(input1, input2)){
            System.out.println(input2 + " is a permutation of " + input1);
        }
        else
        {
            System.out.println(input2 + " is not a permutation of " + input1);
        }

    }
}
