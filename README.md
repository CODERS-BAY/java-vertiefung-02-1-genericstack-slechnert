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

Teste und nutze MyStack<Integer>, Mystack<Boolean> und Mystack<String>.
