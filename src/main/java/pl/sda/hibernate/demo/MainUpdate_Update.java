package pl.sda.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class MainUpdate_Update {

    public static void main(String[] args) {
        // wywołaj try-with-resources który zamknie sesję automatycznie po opuszczeniu try
        try (Session session = HibernateUtil.INSTANCE.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            Student student = Student.builder()
                    .dataUrodzenia(LocalDate.of(1990,1,3))
                    .kierunekNauczania("Informatyka")
                    .indeks("123123")
                    .imie("Pawel")
                    .id(2L)
                    .build();

            //SQL UPDATE 'student' SET ... WHERE id=X
            //sluzy do aktualizacji, wymaga podania ID co jest kryterium, aktualizuje obiekt o podanym ID
            //PERMIST SLUZY do wstawiania nowych rekordow, przewaznie nie podaje sie id bo jest generowane
            session.merge(student);

            //zatwierdzamy studenta
            transaction.commit();

        } catch (Exception ioe) {
            // jeśli złapiemy błąd, to wywoła się catch

        }
    }
}
