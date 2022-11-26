package pl.sda.hibernate.demo.cwiczenie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

    @Data
    @Entity
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class Student {
        @Id // primary key
        @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
        private  Long id;                                   //ID INT PRIMARY KEY AUTO INCREMENT

        @Column(nullable = false)
        private  String imie;                                   //imie VARCHAR 255
        private LocalDate dataUrodzenia;                        //DATA UR DATE
        private  String kierunekNauczania;                      //KIER N VARCHAR 255
        private  String indeks;                                 // INDEKS VARCHAR 255

    }
