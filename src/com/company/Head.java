package com.company;

public class Head {
    private Mouth mouth;
    private Eyes eyes;
    private Nose nose;

    public Head()
    {
        System.out.println("A head has been created ");


        eyes = new Eyes();
        nose = new Nose();
        mouth = new Mouth();

    }
    public Mouth getMouth(){
        return mouth;
    }
    public void setMouth(Mouth mouth){
        this.mouth = mouth;
    }

}
