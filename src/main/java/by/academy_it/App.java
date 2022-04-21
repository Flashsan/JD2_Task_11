package by.academy_it;

import by.academy_it.util.HibernateUtil;

import javax.persistence.EntityManager;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.getTransaction().commit();
        HibernateUtil.close();

    }
}
