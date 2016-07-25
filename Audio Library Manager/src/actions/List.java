package actions;

import java.io.IOException;

/**
 * Made with love and passion by Mihai on 03.07.2016.
 * God Bless.
 */
public class List implements Command {
    @Override
    public void execute(String... params) throws IOException {
        for(String s : params)
            System.out.println(s);
    }
}
