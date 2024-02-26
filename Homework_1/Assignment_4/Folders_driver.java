package Homework_1.Assignment_4;

public class Folders_driver {
    public static void main(String[] args) {
        //Parent File
        Folder phpDemo1 = new Folder("php_demo1");

        //SubFiles of phpDemo1
        Folder SourceFiles = new Folder("Source Files");
        Folder IncludePath = new Folder("Include Path");
        Folder RemoteFiles = new Folder("Remote Files");

        //Subfiles of Source Files
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder public_folder = new Folder ("public");

        //Subfolders of app
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        //Files of public
        File htaccess = new File(".htaccess");
        File htrouter_php = new File(".hrouter.php");
        File index_html = new File("index.html");

        phpDemo1.addSubFolder(SourceFiles);
        phpDemo1.addSubFolder(IncludePath);
        phpDemo1.addSubFolder(RemoteFiles);

        SourceFiles.addSubFolder(phalcon);
        SourceFiles.addSubFolder(app);
        SourceFiles.addSubFolder(cache);
        SourceFiles.addSubFolder(public_folder);

        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        public_folder.addFile(htaccess);
        public_folder.addFile(htrouter_php);
        public_folder.addFile(index_html);

        phpDemo1.print();
        System.out.println();

        SourceFiles.getSubFolders().remove(app);
        phpDemo1.print();
        System.out.println();

        SourceFiles.getSubFolders().remove(public_folder);
        phpDemo1.print();
    }
}
