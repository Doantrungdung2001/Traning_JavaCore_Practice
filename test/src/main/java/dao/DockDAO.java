package dao;
import utils.HibernateUtils;
import entity.Dock;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
public class DockDAO {
    public static List<Dock> getAllDocks() {
        //open session
        Session session = HibernateUtils.getSessionFactory().openSession() ;

        List<Dock> docks = null;

        try {
            //create query
            final String hql = "SELECT d FROM Dock d";
            Query query = session.createQuery(hql);

            // Get all docks
            docks = query.list();

        } catch (HibernateException e) {
            System.err.println(e);
        } finally {
            session.close();
        }
        return docks;
    }
}
