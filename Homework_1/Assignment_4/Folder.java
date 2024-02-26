package Homework_1.Assignment_4;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<Folder> sub_folders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.sub_folders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Folder> getSubFolders() {
        return sub_folders;
    }

    public List<File> getFiles() {
        return files;
    }

    public void addSubFolder(Folder folder) {
        sub_folders.add(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void print() {
        printFolderStructure(this, 0);
    }

    private void printFolderStructure(Folder folder, int depth_space) {
        StringBuilder indents = new StringBuilder();
        for (int i = 0; i < depth_space; i++) {
            indents.append("  ");
        }

        System.out.println(indents.toString() + folder.getName());

        for (File file : folder.getFiles()) {
            System.out.println(indents.toString() + "  " + file.getName());
        }
        
        for (Folder subFolder : folder.getSubFolders()) {
            printFolderStructure(subFolder, depth_space + 1);
        }
    }
}
