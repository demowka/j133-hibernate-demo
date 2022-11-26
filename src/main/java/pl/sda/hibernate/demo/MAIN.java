package pl.sda.hibernate.demo;

import org.hibernate.Session;

public class MAIN {
    public static void main(String[] args) {
        Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession();
        session.close();
    }
}
