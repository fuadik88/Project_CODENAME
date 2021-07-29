package com.inner_classes;

public class Collector {               // Outter class (EXTERNAL)
    private int variable = 1;
    int dvariable = 2;
    protected int pvariable = 3;
    public int pubvariable = 4;

    private void method(){
        wStrArray c1 = new wStrArray();}
    void dmethod(){}
    protected void pmethod(){}
    public void pubmethod(){}


    class wStrArray{           //Inner class (INTERNAL)
        private int variableiii = 1;
        int dvariableiii = 2;
        protected int pvariableiii = 3;
        public int pubvariableiii = 4;

        public void wArray(String[] strArray){
            for(String r : strArray)
                System.out.println(r);
            method(); pmethod(); dmethod();; pubmethod();
        }
    }
}
