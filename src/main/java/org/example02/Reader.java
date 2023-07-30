package org.example02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class Reader {
    public void saveUser(String[]user){
      Path path = Paths.get(String.format(user[0], "txt"));

        if (Files.exists(path)){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile(),true))){
                writer.newLine();
                writer.write(Arrays.toString(user));
                writer.flush();
            } catch (IOException e) {
                e.getStackTrace();
            }
            System.out.println("ok");
      }else
            {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))){
                    writer.write(Arrays.toString(user));
                    writer.flush();
                } catch (IOException e) {
                    e.getStackTrace();
                }
                System.out.println("new ok");


            }
    }
}
