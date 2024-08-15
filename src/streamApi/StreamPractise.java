package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractise {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<11;i++){
            list.add(i);
        }

        //filter odd number using stream api

     List<Integer> evenNumber   =list.stream().filter(i->i%2==0).toList();
        System.out.println(evenNumber);
        int[] arr= {1,2,3,4,6,8,10,12,13,14};
        System.out.println(Arrays.toString(Arrays.stream(arr).map(i -> i * i).toArray()));
    }





}
