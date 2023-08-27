package dao;
import org.hibernate.Transaction;
import utils.HibernateUtils;
import entity.Dock;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
public class DockDAO {

    // Create dock
    public void saveDock(Dock dock) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()){
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(dock);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    // Get all Dock
    public void  getAllDocks() {
        //open session
        Session session = HibernateUtils.getSessionFactory().openSession() ;
        try {
            //create query
            final String hql = "SELECT d FROM Dock d";
            Query query = session.createQuery(hql);

            // Get all docks
            List<Dock> docks = query.list();
            for(Dock item : docks) {
                System.out.println(item.toString());
            }

        } catch (HibernateException e) {
            System.err.println(e);
        } finally {
            session.close();
        }
    }
    // Get Dock by id
    public void getDockById(int id){
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            final String hql = "SELECT d FROM Dock d WHERE d.id = :dockId";
            Query query = session.createQuery(hql);
            query.setParameter("dockId", id);

            // Get all docks
            List<Dock> docks = query.list();
            for(Dock item : docks) {
                System.out.println(item.toString());
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateDock(Dock dock){
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()){
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.saveOrUpdate(dock);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void removeDockById(int id){
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            final String hql = "SELECT d FROM Dock d WHERE d.id = :dockId";
            Query query = session.createQuery(hql);
            query.setParameter("dockId", id);

            // Remove Dock
            List<Dock> docks = query.list();
            for(Dock item : docks) {
                System.out.println("Delete "+ docks.toString());
                session.delete(item);
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}