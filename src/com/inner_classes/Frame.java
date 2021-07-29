package com.inner_classes;

public class Frame {
    int variable;
    static int staticVariable;
    public void method(){}
    static void sMethod(){}

    static class innerClass{
        int innerVariable;
        static int innerSVariable;

        public void innerMethod(){
        }
        static void innerSMethod(){
            staticVariable++;
            sMethod();
        }
    }
}
