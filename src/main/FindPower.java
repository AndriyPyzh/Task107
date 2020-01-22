package main;

import java.util.logging.Logger;

public class FindPower {

    private static Logger log = Logger.getLogger(FindPower.class.getName());

    public static void main(String... args) {

        log.info(Integer.toString(findK(1000)));

    }

    public static int findK(int m) {
        int k = 1;
        while (Math.pow(4, k + 1) < m) {
            k++;
        }
        return k;
    }


}
