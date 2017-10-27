package test;

import implementations.ReverseWords;

public class Main {

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        String s = rw.reverseWords("Hello world");
        System.out.println(s);
    }
}