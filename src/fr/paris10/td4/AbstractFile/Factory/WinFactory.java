package fr.paris10.td4.AbstractFile.Factory;


import fr.paris10.td4.AbstractFile.AbstractFile;
import fr.paris10.td4.AbstractFile.AbstractFileFactory;
import fr.paris10.td4.AbstractFile.Directory.WinDirectory;
import fr.paris10.td4.AbstractFile.File.WinOrdinaryFile;

/**
 * Created by galax on 17/10/2016.
 */
public class WinFactory implements AbstractFileFactory {
    private WinOrdinaryFile myFile;
    private WinDirectory myDirectory;

    public WinFactory(int object) {
        if(object==0){
            WinDirectory tmp = new WinDirectory();
            myDirectory=tmp;
        }else{
           WinOrdinaryFile tmp = new WinOrdinaryFile();
            myFile = tmp;
        }

    }


    public AbstractFile createAbstractFile() {
        return null;
    }
}
