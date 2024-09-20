package capgemini.coding.practice;

/*Problem Statement –
You have to write a function that accepts, a string which length is “len”, the string has some “#”, in it you have to move all the hashes to the front of the string and return the whole string back and print it.
char* moveHash(char str[],int n);
Sample Test Case
Input:
Move#Hash#to#Front
Output:
###MoveHashtoFront*/

public class MoveHash {
    public static void moveHash(String str,int n){
        StringBuilder str1= new StringBuilder();
        StringBuilder str2= new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='#'){
                str1.append(ch);
            } else str2.append(ch);
        }
        System.out.println(str1.toString().concat(str2.toString()));
    }
    public static void main(String[] args) {
        String str="222#";
        moveHash(str,str.length());
    }
}
