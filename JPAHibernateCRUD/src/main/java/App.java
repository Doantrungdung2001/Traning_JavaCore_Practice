import Utils.HibernateUtil;

import dao.dockDAO;
import entity.Dock;
import org.hibernate.Session;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Dock> docks = dockDAO.getAllDocks();

        for (Dock item : docks) {
            System.out.println(item.toString());
        }
    }

    public static void MysqlVersion() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            Object objects = session.createNativeQuery("SELECT VERSION()").getSingleResult();
            System.out.println(objects);
        }
    }
    public  static  void printDateTime()
    {
        try(Session session = HibernateUtil.getSessionFactory().openSession())
        {
            Object obj = session.createNativeQuery("SELECT NOW()").getSingleResult();
            System.out.println(obj);
        }
    }
}
