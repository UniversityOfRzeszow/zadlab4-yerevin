/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author student
 */


public class Lab4 {

    static public class Osoba {

        /* ------
     * Fields
     * ------ */
        public String imie;      //
        public String nazwisko;  // Pola klasy osoba
        public int wiek;         //

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        public Osoba(String imie, String nazwisko, int wiek) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.wiek = wiek;
        }

        // Konstruktor drugi
        public Osoba(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        // Konstruktor trzeci
        public Osoba() {
        }

        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("Osoba");
            System.out.println("imię: " + this.imie);
            System.out.println("nazwisko: " + this.nazwisko);
            System.out.println("wiek: " + this.wiek + " lat");
        }
    } //end class
    
    static public class Student {

        /* ------
     * Fields
     * ------ */
        public String imie = "";      //
        public String nazwisko = "";  // Pola klasy osoba
        public int nr_indeksu = 0;
        public String nazwa_specjalnosci = "";
        public int rok_studiow = 0;         //

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        
        public Student() {
        }
        
        public Student(String imie) {
            this.imie = imie;
        }

        // Konstruktor drugi
        public Student(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        // Konstruktor drugi
        public Student(String imie, String nazwisko, int nr_indeksu) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nr_indeksu = nr_indeksu;
        }

        // Konstruktor trzeci
        public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_studiow) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nr_indeksu = nr_indeksu;
            this.nazwa_specjalnosci = nazwa_specjalnosci;
            this.rok_studiow = rok_studiow;
        }

        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("Osoba");
            System.out.println("imię: " + this.imie);
            System.out.println("nazwisko: " + this.nazwisko);
            System.out.println("nr_indeksu: " + this.nr_indeksu);
            System.out.println("nazwa_specjalnosci: " + this.nazwa_specjalnosci);
            System.out.println("rok_studiow: " + this.rok_studiow);
            
        } //end class
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Imie");
        String imie = input.nextLine();
        System.out.println("Nazwisko");
        String nazwisko = input.nextLine();
        System.out.println("Nr indeksu");
        int nr_indeksu = input.nextInt();
        System.out.println("Nazwa specjlanosci");
        String nazwa_specjalnosci = input.next();
        System.out.println("Rok studiow");
        int rok_studiow = input.nextInt();
        Student osoba1 = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        osoba1.pokazDane();

    }
}
