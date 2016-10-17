package fr.paris10.td4.AbstractFile.Factory;

import fr.paris10.td4.AbstractFile.AbstractFile;
import fr.paris10.td4.AbstractFile.AbstractFileFactory;
import fr.paris10.td4.AbstractFile.Directory.LinuxDirectory;
import fr.paris10.td4.AbstractFile.File.LinuxOrdinaryFile;

/**
 * Created by galax on 17/10/2016.
 */
public class LinuxFactory implements AbstractFileFactory {
    private LinuxDirectory myDirectory;
    private LinuxOrdinaryFile myFile;

    public LinuxFactory(int object) {
        if(object == 0){
            LinuxDirectory tmp = new LinuxDirectory();
            myDirectory=tmp;
        }else{
            LinuxOrdinaryFile tmp = new LinuxOrdinaryFile();
            myFile=tmp;
        }
    }

    public AbstractFile createAbstractFile() {
        return null; //// TODO: 17/10/2016
    }
}
