/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczanieFigur;

import java.util.Scanner;
import lab4.Lab4;

/**
 *
 * @author student
 */
public class Figury {
    static public class Kolo {
        public double r;
        public double pole;

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        public Kolo(double r) {
            this.r = r;
            obliczPole();
        }
        
        public void obliczPole() {
            this.pole = 4 * Math.PI * this.r * this.r;
        }
        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("Kolo");
            System.out.println("pole: " + this.pole);
        }
    }
    
    static public class Kwadrat {
        public double a;
        public double pole;

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        public Kwadrat(double a) {
            this.a = a;
            obliczPole();
        }
        
        public void obliczPole() {
            this.pole = this.a * this.a;
        }
        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("Kwadrat");
            System.out.println("pole: " + this.pole);
        }
    }
    

    static public class Prostokat {
        public double a;
        public double b;
        public double pole;

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        public Prostokat(double a, double b) {
            this.a = a;
            this.b = a;
            obliczPole();
        }
        
        public void obliczPole() {
            this.pole = this.a * this.b;
        }
        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("Prostokat");
            System.out.println("pole: " + this.pole);
        }
    }
    
    static public class Szczescian {
        public double a;
        public double pole;
        public double objetosc;
        

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        public Szczescian(double a) {
            this.a = a;
            obliczPole();
            obliczObjetosc();
            
        }
        
        public void obliczPole() {
            this.pole =  6 * this.a * this.a;
        }
        
        public void obliczObjetosc() {
            this.objetosc = this.a * this.a * this.a;
        }
        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("Szczescian");
            System.out.println("pole: " + this.pole);
            System.out.println("objetosc: " + this.objetosc);
        }
    }
    
    static public class Prostopadloscian {
        public double a;
        public double b;
        public double c;
        public double pole;
        public double objetosc;

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        public Prostopadloscian(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            obliczPole();
            obliczObjetosc();
        }
        
        public void obliczPole() {
            this.pole =  2* (this.a*this.b) + 2*(this.a*this.c) + 2*(this.b*this.c);
        }
        
        public void obliczObjetosc() {
            this.objetosc = this.a * this.b * this.c;
        }
        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("Prostopadloscian");
            System.out.println("pole: " + this.pole);
            System.out.println("objetosc: " + this.objetosc);
        }
    }
    
    static public class Kula {
        public double r;
        public double pole;
        public double objetosc;

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        public Kula(double r) {
            this.r = r;
            obliczPole();
            obliczObjetosc();
        }
        
        public void obliczPole() {
            this.pole =  4*Math.PI*this.r*this.r;
        }
        
        public void obliczObjetosc() {
            this.objetosc = (4/3)*Math.PI*this.r*this.r*this.r;
        }
        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("KUla");
            System.out.println("pole: " + this.pole);
            System.out.println("objetosc: " + this.objetosc);
        }
    }
    
    static public class Stozek {
        public double r;
        public double l;
        public double h;
        public double pole;
        public double objetosc;

        /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
        // Konstruktor pierwszy
        public Stozek(double r, double h, double l) {
            this.r = r;
            this.h = h;
            this.l = l;
            obliczPole();
            obliczObjetosc();
        }
        
        public void obliczPole() {
            this.pole =  this.r*this.r*Math.PI + Math.PI*this.l*this.r;
        }
        
        public void obliczObjetosc() {
            this.objetosc = (1/3)*Math.PI*this.r*this.r*this.h;
        }
        /* -------
     * Methods
     * ------- */
        //Metoda pokazująca dane osoby
        public void pokazDane() {
            System.out.println("Stozek");
            System.out.println("pole: " + this.pole);
            System.out.println("objetosc: " + this.objetosc);
        }
    }
    
        public static void main(String[] args) {

        Kolo kolo = new Kolo(4.0);
        kolo.pokazDane();
        Kwadrat kwadrat = new Kwadrat(4.0);
        kwadrat.pokazDane();
        Prostokat prostokat = new Prostokat(4.0, 5.0);
        prostokat.pokazDane();
        Szczescian szczescian = new Szczescian(4.0);
        szczescian.pokazDane();
        Prostopadloscian prostokatscian = new Prostopadloscian(4.0, 5.0, 2.0);
        prostokatscian.pokazDane();
        Kula kula = new Kula(4.0);
        kula.pokazDane();
        Stozek stozek = new Stozek(4.0, 5.0, 4.0);
        stozek.pokazDane();
    }
    
}
