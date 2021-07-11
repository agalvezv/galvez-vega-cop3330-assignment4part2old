package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 alexandro galvez-vega
 */

//My original pseudocode is on the bottom.

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import static javafx.application.Application.launch;

public class ListController {

    public TextField nameField;
    public TextField descField;
    public TextField dateField;

    public String nameS;
    public String descS;
    public String dateS;

    public TextField edescField;
    public TextField edateField;
    public String edescS;
    public String edateS;

    public TextField sendField;
    public TextField recField;

    public String sendS;
    public String recS;

    public TextField remField;

    public String remS;



    public String dispS ="";
    public TextArea displayField;

    public ArrayList aList = new ArrayList();
    public ArrayList names = new ArrayList();
    public ArrayList complete = new ArrayList();
    public ListManagement lManage = new ListManagement();
   // public ListMoveOperations mManage = new ListMoveOperations();

    public TextField compField;
    public String compS;
    public TextField incompField;
    public String incompS;



    public void incompListValue(ActionEvent actionEvent) {
        displayField.clear();
        dispS = lManage.incompleteDisplay();
        displayField.setText(dispS);

    }

    public void totalListValue(ActionEvent actionEvent) {
        displayField.clear();
        dispS = lManage.allDisplay();
        displayField.setText(dispS);
    }

    public void compListValue(ActionEvent actionEvent) {
        displayField.clear();
        dispS = lManage.completeDisplay();
        displayField.setText(dispS);
    }



    //Making the List
    public void newListValue(ActionEvent actionEvent) {
        /*
        ArrayList myList = new ArrayList();
        myList.add(" ");
        Collections.copy(aList, myList);
        lManage = new ListManagement(aList);
         */
        aList.add(" ");
        lManage.setListInformation(aList);
    }

    public void newNameValue(ActionEvent actionEvent) {

        nameS = nameField.getText();
        lManage.addName(nameS);

        aList = lManage.updateList();
        names = lManage.updateNames();
        complete = lManage.updateComplete();
        nameField.setText("Current name: "+nameS);
        //nameField.setAccessibleText("Current name: "+nameS);

    }


    public void newDescValue(ActionEvent actionEvent) {
        /*
        descS = descField.getText();
        lManage.addDescription(descS);
        aList = lManage.updateList();
        descField.setText("Current desc: "+descS);

         */
        descS = descField.getText();
        int length = descS.length();
        if(length>0&&length<128)
        {
            lManage.addDescription(descS);
            aList = lManage.updateList();
            descField.setText("Current desc: "+descS);
        }
        else
        {
            descField.setText("Bad value. Enter a description between 1-128 characters.");
        }

    }

    public void newDateValue(ActionEvent actionEvent) {

        dateS = dateField.getText();
        Pattern pattern = Pattern.compile("[0-9][0-9][0-9][0-9][-][0-9][0-9][-][0-9][0-9]");
        Matcher match = pattern.matcher(dateS);

        if(!match.matches()){
            //response = "The employee ID must be in the format of AA-1234.";
            //printResult(response);
            dateField.setText("Bad value. Enter a date in the form YYYY-MM-DD");

        }
        else{
            lManage.addDate(dateS);
            aList = lManage.updateList();
            dateField.setText("Current date: "+dateS);
        }

    }



    //Sending info
    public void sendValue(ActionEvent actionEvent) {
        sendS = sendField.getText();
        ListMoveOperations mManage = new ListMoveOperations(aList,names,complete, sendS);
        mManage.sendListToText();
        sendField.setText("Filename: "+sendS);
    }

    public void recValue(ActionEvent actionEvent) {
        recS = recField.getText();
        ListMoveOperations mManage = new ListMoveOperations(aList,names,complete, recS);
        aList.clear();
        aList = mManage.recListFromText();

        names.clear();
        names = mManage.recNamesFromText();

        complete.clear();
        complete = mManage.recCompFromText();
        recField.setText("Filename: "+recS);

    }

    //remove function

    public void remValue(ActionEvent actionEvent) {
        remS = remField.getText();
        lManage.remList(remS);
        aList = lManage.updateList();
        names = lManage.updateNames();
        remField.setText("Remove: "+remS);
    }

    public void clearList(ActionEvent actionEvent) {
        aList.clear();
        names.clear();
        lManage.clearList();

    }

    public void editDescValue(ActionEvent actionEvent) {
        /*
        edescS = edescField.getText();
        lManage.editDescription(edescS);
        aList = lManage.updateList();
        edescField.setText("Desc: "+edescS);


         */


        edescS = edescField.getText();
        int length = edescS.length();
        if(length>0&&length<128)
        {
            lManage.editDescription(edescS);
            aList = lManage.updateList();
            edescField.setText("Desc: "+edescS);
        }
        else
        {
            edescField.setText("Bad value. Enter a description between 1-128 characters.");
        }
    }

    public void editDateValue(ActionEvent actionEvent) {
        /*
        edateS = edateField.getText();
        lManage.editDate(edateS);
        aList = lManage.updateList();
        edateField.setText("Date: "+edateS);

         */


        edateS = edateField.getText();
        Pattern pattern = Pattern.compile("[0-9][0-9][0-9][0-9][-][0-9][0-9][-][0-9][0-9]");
        Matcher match = pattern.matcher(edateS);

        if(!match.matches()){
            //response = "The employee ID must be in the format of AA-1234.";
            //printResult(response);
            edateField.setText("Bad value. Enter a date in the form YYYY-MM-DD");

        }
        else{
            lManage.addDate(edateS);
            aList = lManage.updateList();
            edateField.setText("Current date: "+edateS);
        }
    }

    public void compValue(ActionEvent actionEvent) {
        compS = compField.getText();
        lManage.compItem(compS);
        complete = lManage.updateComplete();
    }

    public void incompValue(ActionEvent actionEvent) {
        incompS = incompField.getText();
        lManage.incompItem(incompS);
        complete = lManage.updateComplete();
    }


    //This will be for the launching of the UI----correction, this is the control class for all buttons and fields

    //fields are required, not just the array lists and strings
    //list of list variable will manage all lists in play
    //this is the application center
    //main will comme into existence here

    //the template of the UI will exist through this

    //This area will require a significant amount of research

    //function to take in field
    //turn it into a string
    //use the list management class to adjust list accordingly
    //this is true for making a list
    //naming a item on the list
    //description on the list
    //date on the list

    //Send and Write functions
    //open a MoveOperations object
    //send information via constructor
    //open and close functions accordingly

    //clear function
    //just use the clear option with the lists as needed

    //edit description and date will function similarly to the date and desc button

    //complete and incomplete function
    //string from field
    //send string to listmanagement function to adjust as needed.


    //display functions for incomp, comp and all
    //function to turn all incomp, comp or total items into a string
    //display the string in the same text area.





    //all previous pseudocode is mostly wrong, mainly in terms of location


    //this area will keep track of the gui interface
    //and will be location that holds variables, specifically list variables
    //(single lists to lists of lists) that move between list management and list mov operations.

    //one function will represent making a new object that represent a new list
    //this function will make use of the listmanagement function

    //one function will represent the button that allows to add new items to the list
    //again, this will make sue of a listmanagement function


    //one function will represent the button that allows to store single+ list
    //this function will use a loop to check how many lists will be checked
    //single and multiple read to external storage will use same function
    //List Move Operations class will be called with this list
    //appropriate text file will be created
    //appropriate information will be displayed on UI

    //one function will represent the button that allows to receive single+ list
    //single and multiple read to external storage will use same function
    //two functions, same esssential logic
    //list receiving from multiple list will use loop that grabs from each object to properly receive correct information
    //this will all go into the same list
    //display will be through UI

    //List Move Operations class will be called with this list
    //function that calls function from list move operations
    //will draw from the appropriate text file
    //asking for the name of the text file will come from this side using scanner
    //scan in a new with a string variable,
    //this will be sent to list move operations when the function is called
    //appropriate information will be displayed on UI

    /*

    newList() will exist here
    //this will use the function from list management to make a new list but will act as the middle man between there and the user interface
    addtoList()
     //this will use the function from list management to make add to a list but will act as the middle man between there and the user interface
    remfromList()
    //this will use the function from list management to make remove from a list but will act as the middle man between there and the user interface
     */
}
