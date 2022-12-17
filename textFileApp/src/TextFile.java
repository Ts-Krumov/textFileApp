
import java.io.*;
import java.util.ArrayList;

public class TextFile {
    private String fileName;
    private ArrayList<String> linesArray;

    public TextFile(String fileName){
        this.fileName = fileName;
        linesArray = new ArrayList<>();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void readFile() {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));){
            String line = reader.readLine();
            while (line!=null){
                System.out.println(line);
                linesArray.add(line);
                line = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void saveChange(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for(String data : linesArray){
                writer.write(data);
                writer.newLine();
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void swapLines(int firstLineIndex, int SecondLineIndex) {
        String tempLine;
        tempLine = linesArray.get(firstLineIndex);
        linesArray.set(firstLineIndex, linesArray.get(SecondLineIndex));
        linesArray.set(SecondLineIndex, tempLine);
        saveChange();
    }



    public void swapWords(int firstLineIndex, int secondLineIndex, int firstLineWord, int secondLineWord) {
        String[] firstLine = linesArray.get(firstLineIndex).split("\\s+" );
        String[] secondLine = linesArray.get(secondLineIndex).split("\\s+" );
        String tempWord;
        tempWord = firstLine[firstLineWord];
        firstLine[firstLineWord] = secondLine[secondLineIndex];
        secondLine[secondLineIndex] = tempWord;
        linesArray.set(firstLineIndex,String.join(" ", firstLine));
        linesArray.set(secondLineIndex,String.join(" ", secondLine));
        saveChange();
        //string array to string HW
        //try with resources
        //bufferedwriter HW
    }
}
