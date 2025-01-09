package fourteenClass;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("Local Disk");
        System.out.println("Does it exits? " + file.exists());
        System.out.println("The file has? " + file.length());
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is? " + file.getAbsolutePath());
        System.out.println("last Modified on? " + new java.util.Date(file.lastModified()));

    }
}