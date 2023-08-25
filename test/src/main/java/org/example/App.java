package org.example;
import dao.DockDAO;
import entity.Dock;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Dock> docks1 = DockDAO.getAllDocks();

        for(Dock item : docks1) {
            System.out.println(item.toString());

        }
    }
}
