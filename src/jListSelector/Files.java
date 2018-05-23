
package jListSelector;

import java.io.File;


public class Files {
    
    public String locationOfSaveFiles = "C:/Users/Tom/Documents/Java Projects/RandomListSelector/List Saves";
    
    public File folder = new File(locationOfSaveFiles);
    public File[] listOfFiles = folder.listFiles();

    
    //returns the number of lists (i.e. txt files) in the folder
    int numberOfLists() {
        
        int numberOfLists = listOfFiles.length;
        return numberOfLists;
        
    }
    
   
    //returns the name of the list from an integer (to be used in a loop)
    String findFiles(int i) {
        
        String nameOfFile = listOfFiles[i].getName();
        String nameOfList = removeExtension(nameOfFile);
        return nameOfList;
    }
    
    
    //returns the file location from a list name
    String fileLocation(String listName) {
        
        String filePath = "";
            
        for (int i = 0; i < numberOfLists(); i++) {
            
            if (listName.equals(findFiles(i))) {
                filePath = listOfFiles[i].getPath();
            }     
        }
        return filePath;
    }    
    
    
    //removes the ".txt" extension from a file name
    String removeExtension(String nameOfFile) {
        
        String nameOfList = "";
        if (nameOfFile.indexOf(".txt") > 0) {
            nameOfList = nameOfFile.substring(0, nameOfFile.lastIndexOf(".txt"));
        }
        return nameOfList;
        
    }  

    
}
