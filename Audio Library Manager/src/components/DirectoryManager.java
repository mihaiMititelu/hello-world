package components;

/**
 * Made with love and passion by Mihai on 03.07.2016.
 * God Bless.
 */
public class DirectoryManager {

    public static String getCurrentDirectory() {
        return CURRENT_DIRECTORY;
    }

    public static void setCurrentDirectory(String currentDirectory) {
        CURRENT_DIRECTORY = currentDirectory;
    }

    private static String CURRENT_DIRECTORY = "E:/Muzică";

}
