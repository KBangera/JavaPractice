import  java.util.*;
/**
 * Created by yogendra on 29-09-2017.
 */
public class URLify {

    void replaceSpaces(char[] str, int length) {
        int spaceCounter=0;
        int newLength,i;
        for(i=0;i<length;i++){
            if(str[i]==' '){
                spaceCounter++;
            }
        }
        newLength=length+spaceCounter*2;
        if(length<str.length) str[length]='\0';
        //char[] arr=new char[newLength];
       // str[newLength]='\0';
        for(i=length-1;i>=0;i++){
            if(str[i]==' '){
                str[newLength-1]='0';
                str[newLength-2]='2';
                str[newLength-3]='%';
                newLength=newLength-3;
            }
            else{
                str[newLength-1]=str[i];
                newLength=newLength-1;
            }
        }
        for(i=0;i<length;i++){
            System.out.println(str[i]);
        }

        for(i=0;i<newLength;i++){
            System.out.println(str[i]);
        }
    }

    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        URLify obj=new URLify();
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        obj.replaceSpaces(arr, trueLength);
    }

}
