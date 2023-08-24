package Utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;

    static {
        try {
            if ( sessionFactory == null) {
               standardServiceRegistry = new StandardServiceRegistryBuilder().configure("src/main/resources/hibernate.cfg.xml").build();
//                standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
                MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
                Metadata metadata = metadataSources.getMetadataBuilder().build();

                sessionFactory = metadata.getSessionFactoryBuilder().build();
            }

        } catch (Exception e) {
            if (standardServiceRegistry != null) {
                StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            }
        }
    }
//    static {
//        try {
////            Configuration configuration = new Configuration().configure("src/main/resources/hibernate.cfg.xml");
//            Configuration configuration = new Configuration();
//            configuration.configure("hibernate.cfg.xml");
//
//            sessionFactory = configuration.buildSessionFactory();
//        } catch (HibernateException e) {
//            throw e;
//        }
//    }
    public  static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
