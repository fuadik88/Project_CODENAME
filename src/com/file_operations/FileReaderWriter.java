package com.file_operations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileReaderWriter {
    public static void main(String[] args) {
        generate();
    }

    private static void generate() {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("file.txt",true))){
            wr.write(getString()+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getString() {
        String shit = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ5479632108.!@%#$*^&)(+=-|?<>";
        List<String> characters = Arrays.asList(shit.split(""));
        Collections.shuffle(characters);
        String afterShuffle = "";
        for (String r : characters)
            afterShuffle += r;
        return afterShuffle;
    }
}
