import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Linter {
    public static void main(String[] args){

    }

    public static void alertSemicolons(){
        Charset charset = Charset.forName("US-ASCII");
        try(BufferedReader fileReader = Files.newBufferedReader(FileSystems.getDefault().getPath("./resources/gates.js"))){

            String newLine = "";
            // while()
            // read through the file

        } catch (IOException e){
            System.out.println("this is the error that occurred when trying to read our file: " + e);
        }
    }
}