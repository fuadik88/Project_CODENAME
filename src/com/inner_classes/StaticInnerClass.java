package com.inner_classes;

public class StaticInnerClass {
    public static void main(String[] args) {
        Frame fr = new Frame();
        fr.variable++;
        fr.method();
        fr.sMethod();
        Frame.sMethod(); Frame.staticVariable++;
        Frame.innerClass inner = new Frame.innerClass();
        Frame.innerClass.innerSMethod(); Frame.innerClass.innerSVariable++;
        System.out.println(inner.innerVariable + Frame.staticVariable + Frame.innerClass.innerSVariable);
    }
}
