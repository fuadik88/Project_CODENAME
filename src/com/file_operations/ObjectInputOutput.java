package com.file_operations;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ObjectInputOutput {
    public static void main(String[] args) throws IOException {
        wFile();
    }

    private static void readFile() throws IOException {
        Bulk bulk;
        boolean endLoop = false;
        try(ObjectInputStream rd = new ObjectInputStream(new FileInputStream("objects.dat"))) {
            while (!endLoop) {
                try {
                    bulk = (Bulk) rd.readObject();
                    System.out.println(bulk);
                } catch (EOFException | ClassNotFoundException ece) {
                    System.out.println("Reached End of File!");
                    endLoop = true;
                }
            }
        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }
    }

    private static void wFile() {

            try (ObjectOutputStream wr = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("objects.dat")))) {

                for(;;) {
                    wr.writeObject(new Bulk());
                    wr.writeObject(new SubBulk());
                }

            } catch (IOException ie) {
                ie.getCause();
            }
            System.out.println("*");
    }
}

class Bulk implements Serializable {
    String shit = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ5479632108.!@%#$*^&)(+=-|?<>";
    String tit = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ5479632108.!@%#$*^&)(+=-|?<>";
    String pulpit = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ5479632108.!@%#$*^&)(+=-|?<>";

    public Bulk() {
        shit = shuffle(shit);
        tit = shuffle(tit);
        pulpit = shuffle(pulpit);
    }

    public String shuffle(String s) {
        List<String> characters = Arrays.asList(s.split(""));
        Collections.shuffle(characters);
        String afterShuffle = "";
        for (String r : characters) {
            afterShuffle += r;
        }
        return afterShuffle;
    }

    @Override
    public String toString() {
        return shit + " | " + tit + " | " + pulpit;
    }
}

class SubBulk extends Bulk {
    String tick = "abcdDEFGHIJKLMNefghiqr$*^&)(+=-|?<QRSTUVW>stuvwxyzABCOPXYZ54jklmnop79632108.!@%#";
    String peek = "abcdefgJKLMNOPQ.!@%RSTUVWhijklmnoHIXDEFG321YZ54796pqrstuvwxyzABC0)(+=-|?<8#$*^&>";
    String vick = "abcdeHIJKLMNOPQRSTUlmnopqrsXYZ5479632108.!@%#$tuvwxyzABCVW*^fghijkDEFG&)(+=-|?<>";

    public SubBulk() {
        shit = shuffle(shit);
        tit = shuffle(shit);
        pulpit = shuffle(pulpit);
        tick = shuffle(tick);
        peek = shuffle(peek);
        vick = shuffle(vick);
    }

    @Override
    public String toString() {
        return shit + " | " + tit + " | " + pulpit + " | " + tick + " | " + peek + " | " + vick;
    }
}