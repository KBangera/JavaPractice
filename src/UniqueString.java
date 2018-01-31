import java.util.*;
/**
 * Created by yogendra on 29-09-2017.
 */
public class UniqueString {
   boolean uniqueChar(String str){
        for(int i=0;i<str.length();i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]){

        UniqueString obj=new UniqueString();
        String input="Geks";

        if(obj.uniqueChar(input)){
            System.out.println(input + " has all unique characters");
        }
        else
        {
            System.out.println(input + " doesn't have unique characters");
        }
    }

}
