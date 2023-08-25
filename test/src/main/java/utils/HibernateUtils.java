package utils;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtils {
    private static SessionFactory sessionFactory;

        static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            sessionFactory = configuration.buildSessionFactory();
        } catch (HibernateException e) {
            throw e;
        }
    }
    public  static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
