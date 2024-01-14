import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class App {

    final static String FILENAME = "input.txt";

    public static void main(String[] args) {
        String result = "";
        try {
            File myObj = new File(FILENAME);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                if (data != null && !data.trim().isEmpty()) {
                    result += "\"" + data + "\", ";
                }
            }
            myReader.close();
            System.out.println(result);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}