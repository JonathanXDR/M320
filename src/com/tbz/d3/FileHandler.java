package com.tbz.d3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandler {
    private static Path appdata = Paths.get(System.getenv("APPDATA"), "D3");
    private static File _file;

    public FileHandler() throws IOException{
        Files.createDirectories(appdata);

       _file =  createFileIfNotExist();
    }
    private File createFileIfNotExist() throws IOException{
        Path d3 = Paths.get(appdata.toString(), "values.json");
        File file = new File(d3.toUri().getPath());
        if (!file.exists())
            file.createNewFile();
        return file;
    }

    public String getFileContent() throws IOException {

        Scanner scanner = null;
        scanner = new Scanner(_file);

        return "Not Implemented";
    }
}
