package com.PROJECT_veterinary_simulation;

abstract class People {
    private final String name;
    private final String IDNum;

    public People(String name, String IDNum){
        this.name = name;
        this.IDNum = IDNum;
    }

    abstract void hInfo();         ////////////
    abstract <Stuff> void assign(Stuff obj); ////////////


    protected String getName() {
        return name;
    }

    protected String getIDNum() {
        return IDNum;
    }

    @Override
    public String toString() {
        return "Name: " + name + "  |  ID: " + IDNum;
    }
}
