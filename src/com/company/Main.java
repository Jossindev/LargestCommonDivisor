package com.company;

import java.math.BigInteger;

public class Main {

    public BigInteger gcd(BigInteger a, BigInteger b) {
        while(true){
            if(a.equals(BigInteger.ZERO)) return b;
            if(b.equals(BigInteger.ZERO)) return a;

            if(a.compareTo(b) >= 0) {
                a = a.mod(b);
            } else  {
                b =b.mod(a);
            }

        }
    }
    public static void main(String[] args) {
    Main m = new Main();
     BigInteger a = new BigInteger("1234564564564564564564565678998743453454557567567567657562352354646578");
     BigInteger b = new BigInteger("987654325189312892953812574748867346346561283565664565645645645641232558");

        long start = System.currentTimeMillis();
        System.out.println(m.gcd(a,b));

        long end = System.currentTimeMillis();
        System.out.println(end-start + " ms");
    }
}
