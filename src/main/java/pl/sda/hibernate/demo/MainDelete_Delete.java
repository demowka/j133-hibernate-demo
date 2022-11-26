package pl.sda.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class MainDelete_Delete {
    public static void main(String[] args) {
        // wywołaj try-with-resources który zamknie sesję automatycznie po opuszczeniu try
        try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            //Najpierw select *from student where id = 2l
            Student student = session.get(Student.class, 2L);

            //jesli udalo sie znalezc
            if (student != null) {
                session.remove(student);

            }


            //zatwierdzamy studenta
            transaction.commit();

        } catch (Exception ioe) {
            // jeśli złapiemy błąd, to wywoła się catch

        }
    }
}
