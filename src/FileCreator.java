import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "testFile.txt";//tworzenie pliku
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);//odczytywanie pliku


        boolean fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Nie udało się utworzyć pliku.");
            }
        }
        if (fileExists) {
            System.out.println("Plik " + fileName + " istnieje lub został utworzony.");
        }
        int lines = 0;
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("Liczba wierszy w pliku to : " + lines);
        scanner.close();
    }
}
