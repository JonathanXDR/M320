package com.tbz.d3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class D3 {
    public void Start() {

        try {
            FileHandler fileHandler = new FileHandler();

            fileHandler.getFileContent();

            String fileContent = fileHandler.getFileContent();

            fileContent+= "";


        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
