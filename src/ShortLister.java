import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public static void main(String[] args) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showOpenDialog(null);
    File selectedFile = fileChooser.getSelectedFile();
    if (selectedFile != null) {
        try {
            Scanner scanner = new Scanner(selectedFile);
            ArrayList<Object> words = new ArrayList<>();
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();
            ShortWordFilter shortWordFilter = new ShortWordFilter();
            ArrayList<Object> shortWords = Interfaces.collectAll(words.toArray(), shortWordFilter);
            System.out.println("Short words: " + shortWords);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}