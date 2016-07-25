package actions;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Made with love and passion by Mihai on 03.07.2016.
 * God Bless.
 */
public class Play implements Command {

    @Override
    public void execute(String... params) throws IOException {

        if (params!=null){

            Desktop.getDesktop().open(new File(params[0]));

        }
    }
}
