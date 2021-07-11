package ucf.assignments;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 alexandro galvez-vega
 */
public class ListMoveOperations {
    //My original pseudocode is on the bottom.

    public ArrayList aList = new ArrayList();
    public ArrayList names = new ArrayList();
    public ArrayList complete = new ArrayList();
    String sendName;
    String sendInfo;
    public ListMoveOperations(ArrayList aList, ArrayList names, ArrayList complete, String sendS) {
        for (Object o : this.aList = aList) {
            
        }
        for (Object o : this.names = names) {
            
        }


        for (Object o : this.complete = complete) {
            
        }
        sendName=sendS;


    }

    public void sendListToText() {

        try
        {
            FileWriter writeFile = new FileWriter("lists_saved/" +sendName);
            writeFile.write(String.valueOf(aList));
            writeFile.close();
        }
        catch(Exception w)
        {
            System.out.println("There was an error.");
        }
        sendNameToText();
        sendCompleteToText();
    }

    private void sendCompleteToText() {
        try
        {
            FileWriter writeFile = new FileWriter("lists_saved/" +sendName+ "C");
            writeFile.write(String.valueOf(complete));
            writeFile.close();
        }
        catch(Exception w)
        {
            System.out.println("There was an error.");
        }
    }

    private void sendNameToText() {
        try
        {
            FileWriter writeFile = new FileWriter("lists_saved/" +sendName+ "N");
            writeFile.write(String.valueOf(names));
            writeFile.close();
        }
        catch(Exception w)
        {
            System.out.println("There was an error.");
        }
    }

    public ArrayList recListFromText() {
        File givenFile = new File("lists_saved/"+sendName);
        String readFile="";
        aList.clear();
        try{
            Scanner readgFile = new Scanner(givenFile);
            while(readgFile.hasNext())
            {
                readFile = readgFile.nextLine();
                aList.add(readFile);
            }
            readgFile.close();

        }
        catch(Exception e)
        {
            System.out.println("There was an error.");
        }
        return aList;
    }

    public ArrayList recNamesFromText() {
        File givenFile = new File("lists_saved/"+sendName+"N");
        String readFile="";
        names.clear();
        try{
            Scanner readgFile = new Scanner(givenFile);
            while(readgFile.hasNext())
            {
                readFile = readgFile.nextLine();
                names.add(readFile);
            }
            readgFile.close();

        }
        catch(Exception e)
        {
            System.out.println("There was an error.");
        }
        return names;
    }

    public ArrayList recCompFromText() {
        File givenFile = new File("lists_saved/"+sendName+"C");
        String readFile="";
        complete.clear();
        try{
            Scanner readgFile = new Scanner(givenFile);
            while(readgFile.hasNext())
            {
                readFile = readgFile.nextLine();
                complete.add(readFile);
            }
            readgFile.close();

        }
        catch(Exception e)
        {
            System.out.println("There was an error.");
        }
        return complete;
    }

    //array lists of
    //title, set description, list completion, date

    //constructor to take in specific information from interface
    //that adds to the array lists as needed

    //all of this functionality basically runs the same way.....
    //added functions for names and complete in both read and write
    //function that will function as the read file
    //uses a try catch to absorb specific error
    //while loop inside try catch in conjunction with scanner to take in info
    //catch prints out an error just in case
    //io.File, io.FileWriter will be in use
    //read function will specifically read in from an external storage array and
    //recreate lists that will be returned to inferface

    //function that will function as the writer area for one list
    //also uses a try catch to absorb potential errors
    //FileWriter writeFile that grabs from the source path where things will be written
    //information written to this output file
    //file close

    //print an exception if things don't go accordingly
    //this will /take in/ a set of array lists and send them to a specific external storage area


}
