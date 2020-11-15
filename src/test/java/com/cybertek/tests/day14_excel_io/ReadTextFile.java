package com.cybertek.tests.day14_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) throws FileNotFoundException {
        //path to file that we want to read
        String path = "shopping_list.txt";
        //File's constructor required path to the file a san argument
        File file = new File(path);
        //check if file exists
        System.out.println(file.exists());

        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
