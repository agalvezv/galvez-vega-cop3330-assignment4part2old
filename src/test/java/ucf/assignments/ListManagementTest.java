package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListManagementTest {
    @Test
    void addName() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        String expected = "poop";
        String actual = (String)tManage.aList.get(0);
        assertEquals(expected, actual);



    }

    @Test
    void addDescription() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        tManage.addDescription("the scoop");
        String expected = "poop  Description: the scoop";
        String actual = (String)tManage.aList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void addDate() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        tManage.addDescription("the scoop");
        tManage.addDate("2020-10-30");
        String expected = "poop  Description: the scoop  Date: 2020-10-30";
        String actual = (String)tManage.aList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void remList() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        tManage.addDescription("the scoop");
        tManage.addDate("2020-10-30");
        tManage.remList("poop");
        tManage.addName(" ");
        String expected = " ";
        String actual = (String)tManage.aList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void clearList() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        tManage.addDescription("the scoop");
        tManage.addDate("2020-10-30");
        tManage.remList("poop");

        tManage.addName("poop2");
        tManage.addDescription("the scoop2");
        tManage.addDate("2020-10-05");
        tManage.clearList();
        tManage.addName(" ");
        String expected = " ";
        String actual = (String)tManage.aList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void editDescription() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        tManage.addDescription("the scoop");
        tManage.addDate("2020-10-30");
        tManage.editDescription("this scoop");
        String expected = "poop  Description: this scoop  Date: 2020-10-30";
        String actual = (String)tManage.aList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void editDate() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        tManage.addDescription("the scoop");
        tManage.addDate("2020-10-30");
        tManage.editDescription("this scoop");
        tManage.editDate("2020-10-28");
        String expected = "poop  Description: this scoop  Date: 2020-10-28";
        String actual = (String)tManage.aList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void compItem() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");


        tManage.addName("poop2");


        tManage.compItem("poop");
        String expected = "complete";

        //System.out.println(tManage.aList);
        //System.out.println(tManage.complete);
        String actual = (String)tManage.complete.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void incompItem() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");


        tManage.addName("poop2");


        tManage.compItem("poop");
        tManage.incompItem("poop");
        String expected = "incomplete";

        //System.out.println(tManage.aList);
        //System.out.println(tManage.complete);
        String actual = (String)tManage.complete.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void allDisplay() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");


        tManage.addName("poop2");


        String expected = "\n" +
                "poop\n" +
                "poop2\n";
        String actual=tManage.allDisplay();
        assertEquals(expected, actual);
    }

    @Test
    void completeDisplay() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        tManage.compItem("poop");


        tManage.addName("poop2");

        //System.out.print(tManage.complete);
        String expected = "\n" +
                "poop\n";
        String actual=tManage.completeDisplay();
        assertEquals(expected, actual);
    }

    @Test
    void incompleteDisplay() {
        ListManagement tManage = new ListManagement();
        tManage.addName("poop");
        tManage.compItem("poop");


        tManage.addName("poop2");


        String expected = "\n" +
                "poop2\n";
        String actual=tManage.incompleteDisplay();
        assertEquals(expected, actual);
    }


    //6)function that adds to array list

    //create object with presets for list management
    //place wrong information into add function
    //use an expected and actual variable to check.


    //7)function that removes from array list
    //create object with presets for list management
    //use add function to add in some things
    //use the remove function
    //use expected and actual to test what is at the end of the list

    //8)function that allows editing of title
    //create object with presets for list management
    //use function to search the list for a specific title
    //function uses a loop to check
    //function scans to take in new title
    //old title is replaced with the new title
    //expected and actual test whether all of the function went according to plan

    //9)function that adds to an existing array list
    //this is is fairly straight forward and should move very similarly to six.

    //create object with presets for list management
    //place wrong information into add function
    //use an expected and actual variable to check.

    //10) again, this is fairly straight forward
    // function that removes from existing array list
    //create object with presets for list management
    //use add function to add in some things
    //use the remove function
    //use expected and actual to test what is at the end of the list

    //11)function that allows editing of description
    //this will move in a similar manner to 8
    //create object with presets for list management
    //use function to search the list for a specific title
    //function uses a loop to check
    //function scans to take in new title
    //old title is replaced with the new title
    //expected and actual test whether all of the function went according to plan

    //12)function that allows editing of date
    //this will move in a similar manner to 9
    //create object with presets for list management
    //use function to search the list for a specific title
    //function uses a loop to check
    //function scans to take in new title
    //old title is replaced with the new title
    //expected and actual test whether all of the function went according to plan

    //13)mark something on a list as completed
    //make object for listmanagement with presets
    //make sure these presets mark each item as incomplete
    //function to mark item as complete is activated
    //expected and actual check to make sure things are working fully


    //14)display a list
    //make object for listmanagement with presets
    //create expected string
    //use display function
    //actual will be a string that takes in the results of display function
    //compare the results to make sure all is working


    //15)display an incomplete list
    //make object for listmanagement with presets
    //some parts of the list will be marked as complete
    //some will be marked as incomplete
    //create expected string
    //use display function
    //actual will be a string that takes in the results of display function
    //compare the results to make sure all is working
    //this checks specifically for the incomplete

    //16)display an incomplete list
    //make object for listmanagement with presets
    //some parts of the list will be marked as complete
    //some will be marked as incomplete
    //create expected string
    //use display function
    //actual will be a string that takes in the results of display function
    //compare the results to make sure all is working
    //this checks specifically for the complete

    //Tests of 17,18,19,20 are representative of ListMoveOperations class


}