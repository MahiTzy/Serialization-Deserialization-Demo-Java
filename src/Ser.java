import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ser {
    public static void main(String[] args) throws Exception {

        Student student = new Student("John", 20, "123 Main St");

        FileOutputStream file = new FileOutputStream("student.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(student);

        System.out.println("Serealization done!");

        out.close();
        file.close();

    }
}
