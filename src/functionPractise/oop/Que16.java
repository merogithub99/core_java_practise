package functionPractise.oop;
//Write a java program to count all the words of a string . Example : I want to be a software engineer. Output : 7

public class Que16 {
    int countAllWordsOfString(String demo){
        int count =0;
        for(int i=0;i<demo.length();i++){
            if(demo.charAt(i)==' '){
                count++;
            }
        }

        return count+1;
    }


    public static void main(String[] args) {

        Que16 obj= new Que16();
        System.out.println(obj.countAllWordsOfString("Hello world how are you"));
    }
}
