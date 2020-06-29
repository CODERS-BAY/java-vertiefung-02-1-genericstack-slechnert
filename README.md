Implementiere einen generischen Stack. Du kannst dir auf [Tutorialspoint](https://www.tutorialspoint.com/java/java_generics.htm) ansehen wie man Generics implementiert.

Der Stack sollte folgende Methoden besitzen: 
* public int length() 
    * returniert die Anzahl der Elemente im Stack
* public T pop() 
    * returniert das letzte Element im Stack und löscht es vom Stack
    * wirft eine StackEmptyException falls der Stack leer ist
* public T peek() 
    * returniert das letzte Element im Stack, lässt den Stack aber unverändert
    * wirft eine StackEmptyException falls der Stack leer ist
* public T push() 
    * fügt dem Stack ein Element hinzu

Teste deine Implementierung *ausführlich* mit Unit Tests. Verwende mindestens einen MyStack<Integer>, MyStack<String> und MyStack<Bill>.
Bill darf dabei eine ganz simple Klasse zur Repräsentation einer Rechnung sein. 

