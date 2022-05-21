package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StartApplication {

    public static void main(String[] args) throws IOException {

        CreateFile createFile = new CreateFile();
        createFile.createFile();

        Path source = Paths.get("D:\\IT\\testfolder");

        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(source, visitor);
        for (Path listPath : visitor.getListPathTextFiles())
        {
            System.out.println(listPath);
        }
    }
}
