package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;

public class StartApplication {

    public static void main(String[] args) throws IOException {

        //choose the folder for searching:
        String selectFolder = "D:\\IT\\testfolder";

        //create folder and result file if not exist
        CreateFile createFile = new CreateFile();
        createFile.createFile();

        //select folder to find files
        Path source = Paths.get(selectFolder);

        //select texted files
        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(source, visitor);

        //sort path by name
        Collections.sort(visitor.getListPathTextFiles(), new Comparator<Path>() {
            @Override
            public int compare(Path o1, Path o2) {
                Path namePath1 = o1.getFileName();
                Path namePath2 = o2.getFileName();
                return namePath1.compareTo(namePath2);
            }
        });

        //write file content to result file
        BufferedWriter writer = new BufferedWriter(new FileWriter(createFile.getPathOfResultFile().toFile()));
        for (Path path : visitor.getListPathTextFiles()){
            BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)));

            while (reader.ready()){
                writer.write(reader.readLine());
                writer.newLine();
            }
            reader.close();
        }
        writer.close();
    }
}
