package fr.paris10.td4.FileSystem;

import fr.paris10.td4.AbstractFile.Factory.LinuxFactory;
import fr.paris10.td4.AbstractFile.Factory.WinFactory;

/**
 * Created by galax on 17/10/2016.
 */
public class FileSystemJ {
    LinuxFactory myLinuxDirectory = new LinuxFactory(0);
    LinuxFactory myLinuxFile = new LinuxFactory(1);
    WinFactory myWinDirectory = new WinFactory(0);
    WinFactory myWinFile = new WinFactory(1);
}
