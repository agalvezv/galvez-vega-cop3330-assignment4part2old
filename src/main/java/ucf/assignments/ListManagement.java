package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 alexandro galvez-vega
 */

import java.util.ArrayList;
//My original pseudocode is on the bottom.

public class ListManagement {

    public String nameS= "";
    public String descS= "";
    public String dateS= "";



    public String sendS;
    public String recS;



    public String remS;
    public ArrayList aList = new ArrayList();
    public ArrayList names = new ArrayList();
    public ArrayList complete = new ArrayList();
    
    public ListManagement(ArrayList aList) {
        for (Object o : this.aList = aList) {
            
        }

        for (Object o : names = aList) {

        }
        complete.add("not applicable");

    }

    public ListManagement() {

    }

    public void addName(String nameS) {
        aList.add(nameS);

        names.add(nameS);

        complete.add("incomplete");

        this.nameS=nameS;

    }

    public void addDescription(String descS) {
        int size = aList.size();
        this.descS="  Description: " + descS;
        for(int i=0; i<size;i++)
        {
            if(nameS.equals(names.get(i)))
            {
                String description = nameS + this.descS + dateS;
                //aList.set(i,aList.get(i)+description);
                aList.set(i,description);
            }
        }

    }

    public void addDate(String dateS) {
        int size = aList.size();
        this.dateS="  Date: " + dateS;
        for(int i=0; i<size;i++)
        {
            if(nameS.equals(names.get(i)))
            {
                String lDate = nameS + descS + this.dateS;
                aList.set(i,aList.get(i)+lDate);
            }
        }

    }
    public void remList(String remS) {
        int size = aList.size();
        String removal="";
        for(int i=0; i<size;i++)
        {
            if(remS.equals(names.get(i)))
            {
                removal = (String)aList.get(i);
            }
        }
        aList.remove(removal);
        names.remove(remS);

    }

    public ArrayList updateList() {
        return aList;
    }

    public ArrayList updateNames() {
        return names;
    }

    public void clearList() {
        aList.clear();
        names.clear();
    }

    public void editDescription(String edescS) {
        /*
        int size = aList.size();
        for(int i=0; i<size;i++)
        {
            if(nameS.equals(names.get(i)))
            {
                String edescription = nameS+"  Description: " + edescS + dateS;
                aList.set(i,edescription);
            }
        }
        descS=edescS;

         */
        int size = aList.size();
        this.descS="  Description: " + edescS;
        for(int i=0; i<size;i++)
        {
            if(nameS.equals(names.get(i)))
            {
                String description = nameS + this.descS + dateS;
                //aList.set(i,aList.get(i)+description);
                aList.set(i,description);
            }
        }
    }

    public void editDate(String edateS) {
        /*
        int size = aList.size();
        for(int i=0; i<size;i++)
        {
            if(nameS.equals(names.get(i)))
            {
                String edate = nameS+descS+"  Date: " + edateS;
                aList.set(i,edate);
            }
        }
        dateS=edateS;

         */
        int size = aList.size();
        this.dateS="  Date: " + edateS;
        for(int i=0; i<size;i++)
        {
            if(nameS.equals(names.get(i)))
            {
                String description = nameS + descS + this.dateS;
                //aList.set(i,aList.get(i)+description);
                aList.set(i,description);
            }
        }
    }

    public void compItem(String compS) {
        int size = aList.size();
        for(int i=0; i<size;i++)
        {
            if(compS.equals(names.get(i)))
            {
                complete.set(i,"complete");
            }
        }
    }

    public void incompItem(String incompS) {
        int size = aList.size();
        for(int i=0; i<size;i++)
        {
            if(incompS.equals(names.get(i)))
            {
                complete.set(i,"incomplete");
            }
        }
    }

    public ArrayList updateComplete() {
        return complete;
    }

    public String incompleteDisplay() {
        String holder = "\n ";
        int size = complete.size();
        for(int i=0; i<size;i++)
        {
            if(complete.get(i).equals("incomplete"));
            {
                holder = holder + aList.get(i)+"\n";
            }
        }
        return holder;
    }

    public String allDisplay() {
        String holder = "\n ";
        int size = aList.size();
        for(int i=0; i<size;i++)
        {
                holder = holder + aList.get(i)+"\n";
        }
        return holder;
    }

    public String completeDisplay() {
        String holder = "\n ";
        int size = complete.size();
        for(int i=0; i<size;i++)
        {
            if(complete.get(i).equals("complete"));
            {
                holder = holder + aList.get(i)+"\n";
            }
        }
        return holder;
    }

    public void setListInformation(ArrayList aList) {
        for (Object o : this.aList = aList) {

        }

        for (Object o : names = aList) {

        }
        complete.add("not applicable");
    }


    //Preset set of array lists for
    //title
    //description
    //due date
    //bool to mark complete part of a list
    //dominating list of lists that represent the total package of items and info

    //Strings to intake information received from interface
    //constructor to receive in bulk
    //get and set for each type string to receive in a larger bulk

    //get and setter for each array list

    //get set in the vein of this:
    /*
        public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
     */
    //constructor is going to be taking in arrays of strings, lists
    //make variables as needed
    //no fields here

    //each of these should at least have a set
    //name list and total list should have a get function too


    //function to add this into array list
    //this can be implemented simply with using the add functionality
    //this add function will represent the add operations of multiple lists that are part of the title, description and so on.


    //this is completely out---------------------------------------------------------------
    //function to sort list
    //sort will be a private functino and used internally in list management
    //most likely I will bring in java.util.Collections
    //and sort using its sort option for the titles and
    //using a loop to adjust description and due date in conjunction with the alphabetically arranged titles
    //-----------------------------------------------------------------------------------

    //----------this is the same
    //function to remove from the array list
    //this will be implemented with the remove option that is part of the array list
    //this add function will represent the remove operations of multiple lists that are part of the title, description and so on.
    //obviously as an item is taken from the list everything else must be removed

    //function edit array lists
    //as the lists are going to be sorted a /binary/-----scratch that----traditional for loop
    // //to search will be used to search for the appropriate match
    //the list will be compared to a
    //scanned in string
    //if no match is found print that nothing is found
    //if a match /is/ found then edit the information of the specific variable
    //replace old variable with new variable
    //this is the basic structure of date,desc, editdate,editdesc

    //name function uses add to add a name to list to total list and names list
    //"incomplete" will be added to the complete list that functions as the check for complete and incomplete items

    //display will have a local string
    //use for loop to add list items into string and separate them by \n so it looks cleaner in display
    //basically the same for comp,incomp, total display


    //function for  lists completion
    //bool in the array list is set to false if the item is incomplete
    //use a loop to check for a specific match
    //as things will be organize it might be possible to use a binary search
    //if match found set item on array list to true
    //adjust other array lists according with loop method

    //function to print completed parts of list
    //loop to print out completed items with the bool parameter as a check

    //function to print non-completed parts of list
    //loop to print out non-completed items with the bool parameter as a check

}
