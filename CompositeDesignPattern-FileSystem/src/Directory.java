import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String DirectoryName;
    List<FileSystem> fileSytemList;  //learning set Filesystem object means it collab both file and directory because it is parent class
    public Directory(String name){
        this.DirectoryName=name;
        fileSytemList=new ArrayList<>();
    }
    public void add(FileSystem fileSystemobj){
        fileSytemList.add(fileSystemobj);
    }
    public void ls(){
        System.out.println("Directory Name  "+DirectoryName);
        for(FileSystem fileSystem: fileSytemList){
            fileSystem.ls();  //learning it calling method of child type for example when welcome type call then it call ls of File
        }
    }
}
