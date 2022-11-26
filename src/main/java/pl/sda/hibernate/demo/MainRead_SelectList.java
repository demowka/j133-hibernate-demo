package pl.sda.hibernate.demo;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;

import java.util.List;

public class MainRead_SelectList {

    public static void main(String[] args) {
        // wywołaj try-with-resources który zamknie sesję automatycznie po opuszczeniu try
        try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()) {
            //Tworzymy obiekt "Zapytanie o typ" (TypeQuerty) gdzie tworzymy na obiekcie zapytanie "Select [nie podane] [FROM student]"
            TypedQuery<Student> zapytanie = session.createQuery("from Student", Student.class);

            //wywolujemy metode 'getResultList' ktora oznacza ([SELECT *] [FROM Student])
            List<Student> listaWszystichStudentow = zapytanie.getResultList();

            //wypisz wyniki
            for (Student student: listaWszystichStudentow) {
                System.out.println(student);
            }
        } catch (Exception ioe) {
            // jeśli złapiemy błąd, to wywoła się catch

        }
    }
}

