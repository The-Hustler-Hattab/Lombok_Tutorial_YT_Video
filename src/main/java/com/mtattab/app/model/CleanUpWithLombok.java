package com.mtattab.app.model;


import lombok.Cleanup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CleanUpWithLombok {

    public static void main(String[] args) {
        String filePath = "testFile";
        outputFileContent(filePath);
        outputFileContentWithCleanUp(filePath);

    }

    public static void outputFileContent(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void outputFileContentWithCleanUp(String filePath) {
        try  {
            @Cleanup // use only with objects that implement java.io.Closeable interface
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
