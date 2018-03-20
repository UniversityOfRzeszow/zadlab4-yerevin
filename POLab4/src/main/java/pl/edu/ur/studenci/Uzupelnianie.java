/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenci;

import java.util.Scanner;
import lab4.Lab4;

/**
 *
 * @author student
 */
public class Uzupelnianie {

    static public class Studenci {

        public Lab4.Student[] students = new Lab4.Student[100];

        public Studenci(){};

        //Metoda pokazująca dane osoby
        public void pokazDaneWybranego(int index) {
            System.out.println("Wybrany");
            System.out.println(this.students[index].imie);
        }

        //Metoda pokazująca dane osoby
        public void pokazAll() {
            System.out.println("Wybrany");
            for (int i = 0; i < 100; i++) {
                System.out.println(this.students[i]);
            }
        }

        //Metoda pokazująca dane osoby
        public void wprowdz(int index, String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_studiow) {
            this.students[index].imie = imie;
            this.students[index].nazwisko = nazwisko;
            this.students[index].nr_indeksu = nr_indeksu;
            this.students[index].nazwisko = nazwisko;
            this.students[index].rok_studiow = rok_studiow;
        }

        //Metoda pokazująca dane osoby
        public void usun(int index) {
            this.students[index].imie = "";
            this.students[index].nazwisko = "";
        }

        public void pokazZzakresu(int start, int end) {
            System.out.println("Wybrany");
            for (int i = start; i <= end; i++) {
                System.out.println(this.students[i].imie);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Studenci studs = new Studenci();
        for(int i = 0; i<100; i++) {
            studs.students[i] = new Lab4.Student();
        }
        System.out.println("Wybrany pokaz");
        int wybrany = input.nextInt();
        studs.pokazDaneWybranego(wybrany);
        studs.pokazAll();
        System.out.println("Wybrany wprowdz");
        wybrany = input.nextInt();
        System.out.println("Imie");
        String imie = input.next();
        System.out.println("Nazwisko");
        String nazwisko = input.next();
        System.out.println("Nr indeksu");
        int nr_indeksu = input.nextInt();
        System.out.println("Nazwa specjlanosci");
        String nazwa_specjalnosci = input.next();
        System.out.println("Rok studiow");
        int rok_studiow = input.nextInt();
        studs.wprowdz(wybrany, imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        System.out.println("Wybrany usun");
        wybrany = input.nextInt();
        studs.usun(wybrany);
        System.out.println("Wybrany od");
        wybrany = input.nextInt();
        System.out.println("Wybrany do");
        int koniec = input.nextInt();
        studs.pokazZzakresu(wybrany, koniec);

    }
}
