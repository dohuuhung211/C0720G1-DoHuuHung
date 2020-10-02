package iofile_16.bai_tap.optional_national;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class National {
    public static final String FILE_NAME = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\iofile_16\\bai_tap\\national.csv";
    String code1;
    String code2;
    String code3;
    String code4;
    String codeNational;
    String nameNational;
    public National(){
    }

    public National(String code1, String code2, String code3, String code4, String codeNational, String nameNational) {
        this.code1 = code1;
        this.code2 = code2;
        this.code3 = code3;
        this.code4 = code4;
        this.codeNational = codeNational;
        this.nameNational = nameNational;
    }

    public static List<National> readFile(){
        List<National> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] temp;
            String line = null;
            National national;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                national = new National(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
                list.add(national);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public String toString() {
        return "National{" +
                "code='" + code1 + '\'' +
                ", code='" + code2 + '\'' +
                ", code='" + code3 + '\'' +
                ", code='" + code4 + '\'' +
                ", State='" + codeNational + '\'' +
                ", National='" + nameNational + '\'' +
                '}';
    }
}
