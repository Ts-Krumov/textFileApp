import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file you want to open: ");
        String fileName = scanner.nextLine();

        try {
            FileReader fileToRead = new FileReader(fileName);
            int data = fileToRead.read();
                while (data != -1){
                    System.out.print((char)data);
                    data = fileToRead.read();
                }
                fileToRead.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }

    }
}