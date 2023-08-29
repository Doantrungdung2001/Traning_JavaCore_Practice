package dao;

import entity.Bike;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtils;

import java.util.List;

public class BikeDAO {

    public void saveBike(Bike bike) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()){
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(bike);
            // commit transaction
            transaction.commit();
            System.out.println("Insert Success");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public void getAllBike() {
        //open session
        Session session = HibernateUtils.getSessionFactory().openSession() ;
        try {
            //create query
//            final String hql = "SELECT d FROM Bike d";
//            Query query = session.createQuery(hql);
//            // Get all bike
//            List<Bike> bikes = query.list();
//            for(Bike item : bikes) {
//                System.out.println(item.toString());
//            }
            List<Bike> bikes = session.createQuery("from Bike ", Bike.class).list();
            bikes.forEach(e -> System.out.println(e.toString()));

        } catch (HibernateException e) {
            System.err.println(e);
        } finally {
            session.close();
        }
    }

    //Get Bike by Id
    public void getBikeById(String id){
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            final String hql = "SELECT d FROM Bike d WHERE d.id = :BikeId";
            Query query = session.createQuery(hql);
            query.setParameter("BikeId", id);

            // Get all docks
            List<Bike> bikes = query.list();
            for(Bike item : bikes) {
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

    // Update Bike
    public void updateBike(Bike bike){
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()){
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.saveOrUpdate(bike);
            // commit transaction
            transaction.commit();
            System.out.println("Update Success");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void removeBikeyId(String id){
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            final String hql = "SELECT d FROM Bike d WHERE d.id = :BikeId";
            Query query = session.createQuery(hql);
            query.setParameter("BikeId", id);

            // Remove Dock
            List<Bike> bikes = query.list();
            for(Bike item : bikes) {
                System.out.println("Delete Success"+ bikes.toString());
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
