package com.tbz.d3;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

public class GradeHandler {

    ArrayList<Subject> subjects = new ArrayList<Subject>();
    FileHandler fileHandler;


    public GradeHandler() {
        try {
            fileHandler = new FileHandler();
            String fileContent = fileHandler.getFileContent();
            subjects = new Gson().fromJson(fileContent, subjects.getClass());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void saveSubjects()  {
        String fileContent = new Gson().toJson(subjects);
        fileHandler.setFileContent(fileContent);
    }
    public ArrayList<String> getSubjects() {
        ArrayList<String> subjectNames = new ArrayList<String>();
        for (var subject : subjects) {
            subjectNames.add(subject.getName());
        }
        return subjectNames;
    }

}
