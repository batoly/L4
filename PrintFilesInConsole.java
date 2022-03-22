import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Lenovo on 1/30/2022.
 */
public class PrintFilesInConsole {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayQueue<String>q=new ArrayQueue<>(3);
        Scanner in=new Scanner(System.in);
        System.out.println("Input file names with path");
        for (int i = 0; i <3 ; i++) {
            q.enqueue(in.next());

        }
        while (!q.isEmpty())
        {
            System.out.println(q.dequeue());
            Scanner f=new Scanner(new File(q.dequeue()));
            while (f.hasNextLine())
                System.out.println(f.nextLine());
        }
    }
}
