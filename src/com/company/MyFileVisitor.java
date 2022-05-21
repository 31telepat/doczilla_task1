package com.company;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

    List<String> textedFiles = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {

        if(path.toString().endsWith(".txt") || path.toString().endsWith(".doc") || path.toString().endsWith(".docx"))
            textedFiles.add(path.toString());
        System.out.println(textedFiles);
        return FileVisitResult.CONTINUE;
    }
}
