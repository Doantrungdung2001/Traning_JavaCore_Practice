package org.example;
import dao.BikeDAO;
import dao.DockDAO;
import dao.TwinsBikeDAO;
import entity.Bike;
import entity.Dock;
import entity.Twinsbike;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        DockDAO docktest = new DockDAO();
//        docktest.saveDock(test);
//        docktest.updateDock(test);
//        docktest.removeDockById("dock1");
//        docktest.getDockById("dock1");
//        docktest.getAllDocks();
        Bike bike1 = new Bike("bike11","dock5","99K1-1239","12367",0,1,600000);
//        Bike bike2 = new Bike("bike12","dock5","99K1-1639","18367",1,1,700000);
//
//        Set<Bike> list = new HashSet<>();
//        //        Set<Bike> list = new HashSet<>();
//        list.add(bike1);
//        list.add(bike2);
//
//        Dock test = new Dock("dock5","Station5",4,46,6,"99st,Dinh Cong Ha",list);
//
//        session.save(bike1);
//        session.save(bike2);
//
//        session.update(test);
//
//        Bike bike2 = new Bike("bike14","dock5","99K1-1539","19377",0,1,400000);

        BikeDAO bikeDAO = new BikeDAO();
        bikeDAO.getBikeById("bike14");

        Twinsbike twinsbike = new Twinsbike();
        TwinsBikeDAO twinsBikeDAO = new TwinsBikeDAO();
        twinsBikeDAO.getAllBike();


    }
}