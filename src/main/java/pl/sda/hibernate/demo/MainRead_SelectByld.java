package pl.sda.hibernate.demo;

import org.hibernate.Session;

public class MainRead_SelectByld {
    public static void main(String[] args) {


        try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()) {
            Student student = session.get(Student.class, 2L);

                System.out.println("Znalezlismy studenta: " + student);
            }
        catch (Exception ioe) {
        System.err.println(("Blad bazy:" + ioe));
        }}
    }