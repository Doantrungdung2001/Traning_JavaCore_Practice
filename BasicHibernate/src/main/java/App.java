
import entity.Authors;
import jakarta.persistence.*;

import java.util.List;


public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

//            Authors Dung = new Authors();
//            Dung.setAuthorId(10);
//            Dung.setName("ADungDoan");
//            entityManager.persist(Dung);
        TypedQuery<Authors> authorsTypedQuery = entityManager.createQuery("SELECT a FROM Authors a", Authors.class);
        List<Authors> author = authorsTypedQuery.getResultList();
            for (Authors item : author) {
                System.out.println(author.toString());
            }
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }

    }
}
