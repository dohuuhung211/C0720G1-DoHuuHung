package case_study_tu_dien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static case_study_tu_dien.FileUtils.FILE_VOB;


public class Request {
    static Scanner scanner = new Scanner(System.in);
    public static final String COMMA = ",";
    static List<Dictionary> dictionaryList = new ArrayList<>();
    public static List<String> listLine = new ArrayList<>();
    public static void disPlayMainMenu(){
        int input;
        do {
            System.out.println("Vui long chon menu");
            System.out.println("1. Them tu vung \n" +
                                "2. Hien thi tu vung \n" +
                                "3. Tra cuu tu vung \n" +
                                "4. Xoa tu vung \n" +
                                "5. Sua tu vung");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input){
                case 1:
                    addNewVocabulary();
                    break;
                case 2:
                    showListVocabulary();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    deleteVocabulary();
                    break;
                case 5:
                    break;
                default:
                    disPlayMainMenu();
            }
        }while (input > 0 && input < 6);
    }
    public static void addNewVocabulary(){
        System.out.println("Nhap tu vung muon them");
        String vocabulary = scanner.nextLine();
        System.out.println("Tinh tu");
        String adjective = scanner.nextLine();
        System.out.println("Danh tu");
        String noun = scanner.nextLine();
        System.out.println("Nhap dong tu");
        String verb = scanner.nextLine();
        System.out.println("Nhap so tu tuong duong");
        int inp = scanner.nextInt();
        scanner.nextLine();
        String synonymous = "";
        for (int i = 0; i < inp; i++){
            String x = scanner.nextLine();
            synonymous = synonymous + x + ";";
        }

        String line = vocabulary + COMMA + adjective + COMMA + noun + COMMA + verb + COMMA + synonymous;
        FileUtils.writeFile(FILE_VOB,line);
        System.out.println("Them thanh cong");
    }
    public static void readFileVocabulary(){
        listLine = FileUtils.readFile(FILE_VOB);
        dictionaryList = new ArrayList<>();
        for (String s : listLine) {
            String[] splitComa = s.split(",");
            String[] splitSemicolon = splitComa[4].split(";");
            List<String> listSynonymousa = new ArrayList<>(Arrays.asList(splitSemicolon));
            Dictionary dictionary = new Dictionary(splitComa[0], splitComa[1], splitComa[2], splitComa[3], listSynonymousa);
            dictionaryList.add(dictionary);
        }
    }
    public static void showListVocabulary(){
        readFileVocabulary();
        System.out.println("Danh sach tu vung");
        int i = 1;
        for (Dictionary list: dictionaryList){
            System.out.println(i++ + ". " + list.toString());
        }
    }
    public static void search(){
        showListVocabulary();
        System.out.println("Nhap tu vung muon tim");
        String searchVob = scanner.nextLine();
        boolean flag = false;
        for (Dictionary vob: dictionaryList){
            if (vob.getVocabulary().contains(searchVob)){
                System.out.println(vob);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Tu vung khong co trong danh sach");
        }
    }

    public static void deleteVocabulary(){
        showListVocabulary();
        System.out.println("Chon vi tri sinh vien muon xoa");
        String pos = scanner.nextLine();
        listLine.remove(Integer.parseInt(pos) - 1);
        thi_thu.FileUtils.writeInFile(FILE_VOB, listLine);
        System.out.println("Xoa thanh cong");
    }
    public static void main(String[] args) {
        disPlayMainMenu();
    }
}
