    package dao;

    import Utils.HibernateUtil;
    import entity.Dock;
    import org.hibernate.HibernateException;
    import org.hibernate.Session;
    import org.hibernate.query.Query;

    import java.util.List;

    public class dockDAO {
        public static List<Dock> getAllDocks() {
            //open session
            Session session = HibernateUtil.getSessionFactory().openSession() ;

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
