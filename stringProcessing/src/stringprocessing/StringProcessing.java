/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author wesleylong
 */
public class StringProcessing {
    private static void readFile(String filename) {

        try {
            Scanner reader = new Scanner(new File(filename));
            int count = 0;
            String[] data = new String[100];
            while (reader.hasNext()) {
                String[] fileInfo = reader.nextLine().split(",");
                String output = String.format("%-15s%-20s%-10s%-10s%-20s%-30s", fileInfo[0], fileInfo[1], fileInfo[2], fileInfo[3], fileInfo[4], fileInfo[5]);
                data[count] = output;
                System.out.println(data[count]);
                count++;
                
            }
        } catch (FileNotFoundException ex) {
            System.err.print("text data file not found");

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        readFile(args[0]);
    }
    
}
