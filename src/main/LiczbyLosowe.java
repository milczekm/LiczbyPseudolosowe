package main;

import java.util.Random;

public class LiczbyLosowe {

    public static void main(String[] args) {

        Random r = new Random();

        String str = "sdljfod456!!sf??hdosiufhsduoifhsokfjdsljkfsdlkjdjdfdfnwejcx,mxcnxcvb";

        int dlugoscStr = str.length();

        System.out.println("Długość łańcucha: " + dlugoscStr);

        String kod = "";

        for (int x = 0; x<12; x++){
            int pos = r.nextInt(dlugoscStr);
            kod = kod + str.charAt(pos);
        }

        System.out.println("Wygenerowany kod: " + kod);

    }
}
