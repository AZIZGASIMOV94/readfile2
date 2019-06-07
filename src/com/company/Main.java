package com.company;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
    //    System.out.println(readFileAsString("sample.txt"));
        File file = new File("d:\\test");
       // fetchFiles(file, f -> System.out.println(f.getAbsoluteFile()));

        fetchFiles(file, f -> System.out.println(f.getName()));

    }

    public static void fetchFiles(File dir, Consumer<File> fileConsumer){
        if(dir.isDirectory()){
            for(File file1 : dir.listFiles()){
                fetchFiles(file1, fileConsumer);
            }
        }else{
            fileConsumer.accept(dir);
        }
    }
    public static void throughFileFind(){
        File file = new File("d:\\test");
    }

  /*  public static String readFileAsString(String fileName) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get("sample.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(data.contains("/^([A-ZÁÉÚŐÓÜÖÍ]([a-záéúőóüöí.]+\\s?)){2,}$/"))
            System.out.println("it contains");
        else
            System.out.println("it does not");

        return data;
    }*/
}
