package actions;

import components.DirectoryManager;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Made with love and passion by Mihai on 03.07.2016.
 * God Bless.
 */
public class CommTests {

    public static void main(String[] args) throws IOException {


        System.out.println(DirectoryManager.getCurrentDirectory());
        Command cd = new ChangeDirectory();

        try{

            cd.execute("");

        }catch (FileNotFoundException e ){

            System.err.println("Chosen directory does not exist");

        }

        System.out.println(DirectoryManager.getCurrentDirectory());

    }


}
