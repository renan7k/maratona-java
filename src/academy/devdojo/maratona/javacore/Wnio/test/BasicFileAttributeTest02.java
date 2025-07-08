package academy.devdojo.maratona.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributeTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("creationTime: "+creationTime);
        System.out.println("lastAccessTime: "+lastAccessTime);
        System.out.println("lastModifiedTime: "+lastModifiedTime);
        System.out.println("----------------------------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("creationTime: "+creationTime);
        System.out.println("lastAccessTime: "+lastAccessTime);
        System.out.println("lastModifiedTime: "+lastModifiedTime);
    }
}
