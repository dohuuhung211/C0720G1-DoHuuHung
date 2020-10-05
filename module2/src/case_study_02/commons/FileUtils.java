package case_study_02.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeFile(String filePath, String line){
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> readFile(String filePath){
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
