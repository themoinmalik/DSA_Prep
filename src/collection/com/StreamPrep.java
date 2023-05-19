package src.collection.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamPrep {




    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(4,6,3,4,6,8,2,5,8);

        // find sum of all the numbers

        Optional<Integer> and = list.stream()
                .reduce((a,b) -> a+b);

        System.out.println(and.get());


        // find the average of list...

        double avg = list.stream().mapToInt(a->a).average().getAsDouble();
        System.out.println(avg);


        //


    }

}
