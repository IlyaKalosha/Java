import java.io.*;
import java.util.*;

public class Main {

    public static void readFiles(File baseDirectory, PrintStream out){
        if (baseDirectory.isDirectory()){
            out.println("----------"+baseDirectory.getName()+"--------------");
            for (File file : baseDirectory.listFiles()) {
                if(file.isFile()){
                    out.println("  "+file.getName() + " файл");
                }else {
                    out.println("  "+file.getName() + " каталог");
                    readFiles(file,out);
                }
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("D:/output1.txt");
        File output = new File("D:/output.txt");
        PrintStream ps;

        if (file.isDirectory()) {
            try {
                ps = new PrintStream(output);
                readFiles(file,ps);

            } catch (FileNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }
        else{
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringBuilder builder = new StringBuilder();
                String currentLine = reader.readLine();
                while (currentLine != null) {
                    builder.append(currentLine);
                    builder.append("n");
                    currentLine = reader.readLine();
                }
                reader.close();
                System.out.println(builder.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
