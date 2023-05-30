package src.collection.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPrep {


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(4,6,3,46,63,8,2,5,8,45,7,78,4,67,18,43,96);

        // find sum of all the numbers

        Optional<Integer> and = list.stream()
                .reduce(Integer::sum);   // a -> a+b can be replace.

        System.out.println(and.get());


        // find the average of list...

        double avg = list.stream().mapToInt(a->a).average().getAsDouble();
        System.out.println(avg);


        // square filter > 100 and average of nubers .

        double sqr = list.stream()
                .map(a->a*a)
                .filter(a->a>10)
                .mapToInt(a->a)
                .average().getAsDouble();

        System.out.println(sqr);


        // find odd even numbers from list

        // 1. even

        List<Integer> even = list.stream()
                .filter(a->a%2==0)
                .collect(Collectors.toList());

        System.out.println(even);


        // 2. odd.

        List<Integer> odd = list.stream()
                .filter(a->a%2!=0)
                .collect(Collectors.toList());

        System.out.println(odd);

        int a=10;

        a-=3;

        System.out.println(a);


    }

    public void patternPrint() {
        for (int i=0;i<-5;i++)
        {
            for (int j = 1;j<=i;j++) {
                System.out.println(j+"");
            }
        }
        System.out.println();

    }

}
