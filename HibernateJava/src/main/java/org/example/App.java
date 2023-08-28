package org.example;
import dao.DockDAO;
import entity.Dock;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        Dock test = new Dock(3,"test",34,16,9,"Luong Tai");
        DockDAO docktest = new DockDAO();
//        docktest.saveDock(test);
//        docktest.updateDock(test);
//        docktest.removeDockById("dock1");
        docktest.getDockById("dock1");
        docktest.getAllDocks();
    }
}