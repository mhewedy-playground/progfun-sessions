package week6;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by mhewedy on 7/28/15.
 */
public class Recall {

    public static void main(String[] args){
        Stream<Integer> xs = Arrays.asList(1, 3, 5, 6, 7, 10).stream();
        xs.map(x -> x * x).filter (x -> x > 15).forEach(System.out::println);
    }
}
