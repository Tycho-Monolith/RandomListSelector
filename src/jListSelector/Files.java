
package jListSelector;

import java.io.File;
//import org.apache.commons.io.FilenameUtils;


public class Files {
    
//    private File File_Location;
//    private File[] List_Of_Files;
    
    public String locationOfSaveFiles = "C:/Users/Tom/Documents/Java Projects/RandomListSelector/List Saves";
    public File folder = new File("C:/Users/Tom/Documents/Java Projects/RandomListSelector/List Saves");
    public File[] listOfFiles = folder.listFiles();

    
    
    int numberOfLists() {
        int numberOfLists = listOfFiles.length;
        return numberOfLists;
    }
        
    //returns the file location from the list/file name
    String fileLocationFromFileName(String fileName) {
        
        String location = locationOfSaveFiles + "/" + fileName + ".txt";
        return location;
        
    }
    
    String findFiles(int i) {
        
        String nameOfFile = listOfFiles[i].getName();
        String nameOfList = removeExtension(nameOfFile);
        return nameOfList;
    }
    
    //returns the file location from a 
    String fileLocation(String fileName) {
        
        String filePath = "";
            
        for (int i = 0; i < numberOfLists(); i++) {
            
            if (fileName.equals(findFiles(i))) {
                filePath = listOfFiles[i].getPath();
            }  
            
        }
        return filePath;
        
    } 
 
    
    void printListNames() {
        
        int i;
        for (i = 0; i < listOfFiles.length; i++) {
            String fileName = findFiles(i);
            System.out.println(fileName);
             
            
//            String nameOfFile = String.valueOf(listOfFiles[i]);
//            String nameOfList = removeExtension(nameOfFile);
//            System.out.println(nameOfList);
        }
    }
    
    
    
    String removeExtension(String nameOfFile) {
        
        String newNameOfFile = "";
        if (nameOfFile.indexOf(".txt") > 0) {
            newNameOfFile = nameOfFile.substring(0, nameOfFile.lastIndexOf(".txt"));
        }
        return newNameOfFile;
        
    }
    

    
    
//    void findFiles() {
//    
//        int i;
//        for (i = 0; i < listOfFiles.length; i++) {
//            if (listOfFiles[i].isFile()) {
//                System.out.println("File " + listOfFiles[i].getName());
//            }
//            else if (listOfFiles[i].isDirectory()) {
//                System.out.println("Directory " + listOfFiles[i].getName());
//            }
//        }    
//    }
    

        
}    
    

