package hw5;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreateFile {
    public static ArrayList<FileObject>fileObjectArrayList = new ArrayList<>();
    public static final String pathFile = "src/hw5/test.csv";
    public static final String title = "value1" + ";" + "value2" + ";" + "value3" + ";" + System.getProperty("Line.separator ");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writer();
        AppData appData = readToObject();



    }
    public static void createFileObjects() {
        Random random = new Random();

        for(int i = 1; i < 1000; i++){
            fileObjectArrayList.add(new FileObject(i, random.nextInt(1000), random.nextInt(10000)));
        }

    }

    public static void writeStream() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathFile)) {
            for(byte b :title.getBytes(StandardCharsets.UTF_8)){
                fileOutputStream.write(b);
            }
            for(FileObject fileObject : fileObjectArrayList){
                String raw = fileObject.getValue() + ";" + fileObject.getValueFrom() + ";" + fileObject.getValueTo() + ";" + System.getProperty("Line.separator");
                for(byte b :raw.getBytes(StandardCharsets.UTF_8)) {
                    fileOutputStream.write(b);
                }
            }
        }
    }
    public static void writer()throws IOException {
        try(FileWriter writer = new FileWriter(pathFile);){
            writer.write(title);
            for(FileObject fileObject : fileObjectArrayList){
                writer.write(fileObject.getValue() + ";" + fileObject.getValueFrom() + ";" + fileObject.getValueTo() + ";" + System.getProperty("Line.separator") );
            }
        }
    }
    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String Line = br.readLine();
            appData.setHeader(Line.split(";"));
            while ((Line = br.readLine()) != null) {
                String[] values = Line.split(";");
                records.add(Arrays.asList(values));
            }
        }
        int[][] resultData = new int[records.size()][3];
        for(int i = 0; i < records.size(); i++){
            for(int j = 0; j < records.get(i).size(); j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;
    }




}
