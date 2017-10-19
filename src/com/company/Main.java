package com.company;

public class Main {

    public static void main(String[] args)
    {
        Head myHead = new Head();
        Mouth myMouth = myHead.getMouth();
        myMouth.setCry("WAAAAAH!");
        System.out.println(myHead.getMouth().getCry());



    }
}
