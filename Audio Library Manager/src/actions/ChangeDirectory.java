package actions;

import components.DirectoryManager;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Made with love and passion by Mihai on 03.07.2016.
 * God Bless.
 */
public class ChangeDirectory implements Command {

    @Override
    public void execute(String... params) throws IOException {

        if (Paths.get(Arrays.toString(params)) != null) {

            DirectoryManager.setCurrentDirectory(params[0]);
            System.out.println("Current directory set to " + DirectoryManager.getCurrentDirectory());

        } else {
            throw new IOException("Cannot change to void directory!");
        }

    }
}
