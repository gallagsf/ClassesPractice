import javax.swing.JFileChooser;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PersonReader {
    public static void main(String[] args) throws FileNotFoundException{
        /*

    Use the JFileChooser to prompt the user to select the file you export in Part 1.
    Instantiate a Person Object for each record you read from the file.
    Store all the Person Objects in an ArrayList<Person>.
    Use the String.format or System.out.printf method to create a neatly formatted columnar display of the data.

         */
        ArrayList<Person> people = new ArrayList<>();

        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            in = new Scanner(selectedFile);
        }

        while (in.hasNextLine()) {
            people.add(new Person(in.next().substring(0, in.next().length() - 1),
                                  in.next().substring(0, in.next().length() - 1),
                                  in.next().substring(0, in.next().length() - 1),
                                  in.next().substring(0, in.next().length() - 1),
                                  in.nextInt()));
        }

        
    }
}
