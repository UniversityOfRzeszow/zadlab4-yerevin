# OOPL4
Obiekty w języku Java

## Zadanie 1
Utwórz dwie klasy:

* DaneOsobowe
* Osoba


Uzupełnij klasy następującym kodem:
* Osoba

```java
package pl.edu.ur.polab4;

public class Osoba {

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
```

* DaneOsobowe

```java
package pl.edu.ur.polab4;

public class DaneOsobowe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 15);
        osoba1.pokazDane();
        
        System.out.println("---------------------");
        Osoba osoba2 = new Osoba("Adam", "Nowak");
        osoba2.pokazDane();
        
        System.out.println("---------------------");
        osoba2.imie = "Stefan";
        osoba2.wiek = 70;
        osoba2.pokazDane();
        
        System.out.println("---------------------");
        Osoba osoba3 = new Osoba();
        osoba3.imie = "Anna";
        osoba3.nazwisko = "Wiśniewska";
        osoba3.wiek = 45;
        osoba3.pokazDane();
        
    }
}

```

Jakie wyniki zostaną wyświetlone na konsoli?

### Ważne (przeczytać !!!):

* Konstruktory służą do tworzenia obiektów. W języku Java konstruktor posiada następujące cechy: jego nazwa jest identyczna z nazwą klasy, w której się znajduje; może posiadać parametry, którymi najczęściej ustawia wartości pól w klasie; w odróżnieniu od metod nie zwraca żadnej wartości. Jeśli programista nie zdefiniuje, żadnego konstruktora wewnątrz klasy, kompilator utworzy w trakcie kompilacji konstruktor domniemany dla tej klasy. Będzie on ekwiwalentem konstruktora pustego, z tą różnicą, że nie będzie on obecny w kodzie programu. Java tworzy konstruktory domyślne tylko w przypadku braku jakiegokolwiek konstruktora w kodzie klasy. 

* Konstruktory i metody w języku Java podlegają mechanizmowi przeciążenia (ang. overload). Oznacza to, że mogą występować w różnych wersjach (pod różnymi postaciami). Metody przeciążane cechują się tą samą nazwą. Różnić się natomiast mogą ilością argumentów, typem argumentów, typem zwracanym i wnętrzem metody (kodem programu wewnątrz metody). Podobnie jest z konstruktorami, przy czym te z definicji mają tę samą nazwę i dodatkowo w przeciwieństwie do metod nie zwracają wartości. Jeśli zatem konstruktory nie zwracają wartości, nie można ich przeciążać po zwracanym typie. Solidarnie do nich również i metody nie mogą być przeciążane po zwracanym typie, co jednak nie oznacza, że wszystkie one muszą mieć ten sam typ zwracany. Konkludując, można stwierdzić, że wariantywność przeciążanych metod objawia się poprzez różnice w ilości i typie argumentów przyjmowanych przez metodę czy konstruktor. Mechanizm przeciążania należy do zjawisk polimorfizmu w językach programowania.

## Zadanie 2
Na podstawie zadania utwórz klasę `Student`, która posiada następujące pola: `imię`, `nazwisko`, `nr_indeks`u, `nazwa specjalności`, `rok_studiow`. Dla pól dobierz odpowiedni typ danych. Utwórz cztery przeciążenia konstruktorów dla tej klasy (każda wersja konstruktora powinna przyjmować przynajmniej jeden parametr -  nie tworzyć konstruktora pustego). Utwórz metodę wyświetlającą dane o studencie. Utwórz cztery obiekty klasy student, każdy korzystający z innego przeciążenia konstruktora podczas tworzenia obiektu. Dla każdego obiektu uruchom metodę wyświetlającą dane.

## Zadanie 3
Utwórz klasę (zawierającą metode `main`), która umożliwia wprowadzanie danych studenta z konsoli. Użyj do tego celu znanego już obiektu `Scanne`r oraz klasy `Student` z zadania 2.

## Zadanie 4
W nowym pakiecie (np. `pl.edu.ur.polab4.obliczanieFigur`) utwórz klasy opisujące następujące figury geometryczne: `Koło`, `Kwadrat`, `Prostokąt`, `Sześcian`, `Prostopadłościan`, `Kula`, `Stożek`. Dla każdej klasy dobierz odpowiednie pola. Utwórz także metody obliczające pola figur, obwody (dla figur płaskich), oraz objętości (dla figur przestrzennych). Dla każdej klasy utwórz metodę wyświetlającą dane dotyczące figury tj. nazwa, parametry, wartość pola i obwodu lub objętości. Utwórz obiekty tych figur i pokaż wyniki obliczeń przy użyciu funkcji wyświetlającej dane.

*Utwórz kalkulator dla figur geometrycznych tj. odpowiednie menu pozwalające na: wybór figury geometrycznej oraz wprowadzanie parametrów dla tej figury z konsoli. Następnie wyświetl wyniki przy użyciu metody wyświetlającej dane. 

## Zadanie 5
W nowym pakiecie (np. `pl.edu.ur.polab4.wprowadzDane`) utwórz klasę zawierającą 100 elementową tablicę klasy `Student` (użyj klasy Student z zadania 2). Utwórz metodę tworzącą obiekt dla każdego elementu tablicy i ustawiającą domyślne wartości dla niego tj. dla typu liczbowego: `0`, dla typu łańcuchowego: łańcuch pusty `""`.

Utwórz metody umożliwiające:

*	wprowadzanie danych studenta pod wybrany index tablicy,
*	edycję (nadpisanie danych studenta) spod wybranego indeksu,
*	usunięcie danych studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi),
*	wyświetlenie obiektu o danym indeksie.
*	wyświetlenie wszystkich obiektów,
*	wyświetlenie zakresu obiektów w podanym zakresie.   

 

##### Opracował dr inż. Wojciech Kozioł
