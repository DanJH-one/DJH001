package itheima21;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Random random = new Random();

        //HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            int s = random.nextInt(30) % (30 - 20 + 1) + 20;
            if (set.size()<10){
                set.add(s);
            }else {
                break;
            }
        }
        for (Integer i:set){
            System.out.println(i);
        }
    }
}
