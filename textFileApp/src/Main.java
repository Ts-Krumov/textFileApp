
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file you want to open: ");
        String fileName = scanner.nextLine();
        TextFile openedFile = new TextFile(fileName);
        openedFile.readFile();
        System.out.println("Choose a command: (swapLines/swapWords)");
        String command = scanner.nextLine();
        if(command.equals("swapLines")){
            System.out.println("Enter index of lines to swap: ");
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            openedFile.swapLines(Integer.parseInt(line1), Integer.parseInt(line2));
        }else  if(command.equals("swapWords")){
            System.out.println("Enter index of lines to swap: ");
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            System.out.println("Enter index of words to swap: ");
            String word1 = scanner.nextLine();
            String word2 = scanner.nextLine();
            openedFile.swapWords(Integer.parseInt(line1), Integer.parseInt(line2), Integer.parseInt(word1), Integer.parseInt(word2));
        }else{
                System.out.println("Not a valid command!");
            }
        openedFile.readFile();
        }
    }