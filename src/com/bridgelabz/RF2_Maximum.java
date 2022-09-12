package com.bridgelabz;

public class RF2_Maximum<T extends Comparable<T>> {
    T x;
    T y;
    T z;

    RF2_Maximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum () {

        if (x.compareTo(y) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        } else {
            return z;
        }
    }


    public static void main(String[] args) {
        RF2_Maximum compareInteger = new RF2_Maximum(2345, 12, 7);
        System.out.println("Maximum number out of three integers is: " + compareInteger.maximum());
        RF2_Maximum  comapreFloat = new RF2_Maximum(123.f, 345f, 678f);
        System.out.println("Maximum number out of three float is: " + comapreFloat.maximum());
        RF2_Maximum compareString = new RF2_Maximum("Apple", "Orange", "potato");
        System.out.println("Maximum among three string is: " + compareString.maximum());
    }

}
