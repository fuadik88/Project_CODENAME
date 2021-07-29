package com.string_class;

public class StringImmutable {
    public static void main(String[] args) {
        String name = new String("Fuad");          //String class is IMMUTABLE .
        String sname = new String("Fuad");
        System.out.println(name==sname);
        System.out.println(name.equals(sname));

        String name1 = "Fuad";
        String name2 = "Fuad";
        System.out.println(name1==name1);
        System.out.println(name1.equals(name2));
        name1.concat(" Imanov");
        System.out.println(name1);
        String fname = name1.concat(" Imanov");
        System.out.println(fname);

    }
}
