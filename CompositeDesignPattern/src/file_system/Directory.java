package file_system;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj) {
        this.fileSystemList.add(fileSystemObj);
    }

    @Override
    public void ls() {
        System.out.println("Directory name " + this.directoryName);

        for (FileSystem fileSystemObj : this.fileSystemList) {
            fileSystemObj.ls();
        }
    }
}
