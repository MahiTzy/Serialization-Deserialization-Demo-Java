import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSer {
    public static void main(String[] args) throws Exception {

        FileInputStream file = new FileInputStream("student.txt");
        ObjectInputStream in = new ObjectInputStream(file);

        Student student = (Student) in.readObject();

        System.out.println("Deserialization done!");

        student.display();

        in.close();
        file.close();

    }

}
