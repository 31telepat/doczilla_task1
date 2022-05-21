package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StartApplication {

    public static void main(String[] args) throws IOException {

        System.out.println(Files.walkFileTree(Paths.get("D:\\IT\\testfolder"), new MyFileVisitor()));
    }
}
