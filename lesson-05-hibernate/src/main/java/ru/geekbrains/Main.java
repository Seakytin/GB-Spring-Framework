package ru.geekbrains;

import org.hibernate.cfg.Configuration;
import ru.geekbrains.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        EntityManager em = emFactory.createEntityManager();

        //INSERT
//       em.getTransaction().begin();

//       em.persist(new User(null,"alex", "pass1"));

//       em.getTransaction().commit();
        //SELECT
//        System.out.println("User");
//        User user = em.find(User.class, 1L);
//        System.out.println(user);
//
//        System.out.println("Users");
//
//        List<User> users = em.createQuery("select u from User u where u.username = :username", User.class)
//                        .setParameter("username", "alex")
//                        .getResultList();
//        System.out.println(users);
//
//        users = em.createNativeQuery("select * from users", User.class)
//                        .getResultList();
//        System.out.println(users);
        //UPDATE 1
//       User user = em.find(User.class, 1L);

//       em.getTransaction().begin();

//       user.setPassword("password234");
//       em.getTransaction().commit();
//       //UPDATE 2
//       User user = new User(1L, "petr", "password1245");

//       em.getTransaction().begin();

//       em.merge(user);

//       em.getTransaction().commit();

        //UPDATE 3

//       em.getTransaction().begin();

//       em.createQuery("update User set username = :username, password = :password where id = :id")
//                       .setParameter("username", "alex")
//                           .setParameter("password", "password2132")
//                               .setParameter("id", 1l)
//                                       .executeUpdate();

//       em.getTransaction().commit();
        //DELETE 1

//        em.getTransaction().begin();
//        User user = em.find(User.class, 1L);
//        em.remove(user);
//
//        em.getTransaction().commit();

        //DELETE2
//        em.getTransaction().begin();
//        em.createQuery("delete from User where id = :id")
//                        .setParameter("id", 1L)
//                                .executeUpdate();
//        em.getTransaction().commit();


        em.close();
    }
}
