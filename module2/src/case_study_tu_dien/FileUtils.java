package case_study_tu_dien;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static final String FILE_VOB = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_tu_dien\\Vocabulary.csv";
    public static void writeFile(String filePath, String line) {
        BufferedWriter bw = null;
        try {
            FileWriter fileWriter = new FileWriter(FILE_VOB,true);
            bw = new BufferedWriter(fileWriter);
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeInFile(String pathFile, List<String> listLine) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(pathFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: listLine) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> readFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader br = null;
        try {
            fileReader = new FileReader(FILE_VOB);
            br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }
}
