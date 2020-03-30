import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName="testFile3.txt";


        try(
                FileWriter fileWriter = new FileWriter(fileName,true);//true- dopisywanie do pliku, false- nadpisywanie pliku.
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
                ) {


            bufferedWriter.write("Bolek");
            bufferedWriter.newLine();
            bufferedWriter.write("Lolek");
            bufferedWriter.newLine();
            bufferedWriter.write("Atomek");
            bufferedWriter.newLine();

            //bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
