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
        GradeHandler gradeHandler =  new GradeHandler();

        while (true){

            System.out.println("Type command");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            if (command.equals("exit")){
                break;
            }

            switch (command){
                case "save":
                    gradeHandler.saveSubjects();
                    break;                    
                default:
                    System.out.println("Not Found");
                    break;
            }
        }
        gradeHandler.saveSubjects();
    }
}
