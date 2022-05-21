package com.company;

import java.io.IOException;
import java.nio.file.*;

public class CreateFile {

     Path pathOfResultDirectory = Paths.get("D:\\resultfolder");
     Path pathOfResultFile = Paths.get("D:\\resultfolder\\resultfile.txt");

    public  Path getPathOfResultFile() {
        return pathOfResultFile;
    }

    public void createFile(){
        // create directory
        boolean pathDirectoryExists = Files.exists(pathOfResultDirectory, new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
        if (!pathDirectoryExists) {
            try {
                Files.createDirectory(pathOfResultDirectory);
            } catch (FileAlreadyExistsException e) {
                System.out.println("Directory already created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // create file
        boolean pathFileExists = Files.exists(pathOfResultDirectory, new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
        if (pathFileExists) {
            try {
                Files.createFile(pathOfResultFile);
            } catch (FileAlreadyExistsException e) {
                System.out.println("File already created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
