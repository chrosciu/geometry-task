# Nowe elementy Javy

### Zadanie

Celem zadania jest stworzenie prostego systemu klas modelującego figury geometryczne na płaszczyźnie z wykorzystaniem funkcjonalności dodanych w najnowszych wersjach Javy (rekordy, klasy zapieczętowane, pattern matching dla `switch`)

**Ze względu na to, iż jest to zadanie z programowania a nie z matematyki 🙂 wszystkie metody jakie mają zostać napisane powinny (zamiast wykonywanie obliczeń) zwracać typ String opisujący co dana metoda ma robić i dla jakich argumentów została zawołana. Przykład:**

```java
class Square {
    public String getArea() {
        return String.format("getArea() called for %s", this.toString());     
    }
}
```

1. Stworzyć nowy projekt oparty o Maven. Projekt powinien używać Javy w wersji 17. 
2. Stworzyć rekord `Point` reprezentujący punkt na płaszczyźnie
    - składowymi rekordu powinny być współrzędne x i y (obydwie typu double)
    - rekord powinien dodatkowo zawierać metodę o sygnaturze: `String distance(Point p)` służącą do wyliczania odległości od drugiego punktu
3. Utworzyć rekord `Circle` reprezentujący koło
    - składowymi rekordu powinny być obiekt `Point` reprezentujący środek koła oraz wielkość typu double będąca promieniem koła
    - konstruktor powinien sprawdzać czy przekazany promień nie jest ujemny - jeżeli jest to powinien zostać rzucony wyjątek
4. Dodać interfejs `Shape` reprezentujący ogólne możliwości figur na płaszczyźnie zawierający metodę `String getArea()` służącą do obliczenia pola powierzchni figury
5. Zaimplementować interfejs `Shape` w rekordzie `Circle`
6. Stworzyć abstrakcyjną klasę `Polygon` reprezentującą wielokąt o dowolnej liczbie wierzchołków. 
7. Zaimplementować interfejs `Shape`w klasie `Polygon`
8. Uniemożliwić implementację interfejsu `Shape` innym klasom niż `Circle` i `Polygon`. W celu sprawdzenia czy blokada działa, spróbować dołożyć klasę `Square` reprezentującą kwadrat i sprawdzić że próba implementacji przez nią interfejsu `Shape` powoduje błąd
9. Stworzyć klasę `Section` reprezentującą odcinek (reprezentowany przez dwa punkty) i dziedziczącą po klasie `Polygon`
10. Stworzyć klasę `Triangle` reprezentującą trójkąt (reprezentowany przez trzy punkty) - również dziedziczącą po klasie `Polygon`
11. Zablokować możliwość dziedziczenia po klasie `Polygon` przez inne klasy niż `Section` i `Triangle`. Ponownie zweryfikować poprawność blokady próbując dziedziczyć po klasie `Polygon` w klasie `Square`
12. W interfejsie `Shape` dodać nową metodę `String getDiameter()` służącą do obliczenia średnicy koła opisanego na danej figurze  
13. Zapewnić domyślną implementację metody `getDiameter()`
    - Implementacja powinna sprawdzać po kolei czy dane `Shape` jest typu `Circle`, `Section` czy `Triangle` i wypisywać dla jakiego obiektu została zawołana.
    - W implementacji użyć instrukcji `switch` z wykorzystaniem pattern matching (konstrukcja z Javy 17)
14.  Napisać testy jednostkowe do stworzonych klas
