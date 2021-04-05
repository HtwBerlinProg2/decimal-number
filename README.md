# DecimalNumber

Das Interface `DecimalNumber` spezifiziert ein Verhalten für Fließkommazahlen mit einer konfigurierbaren Anzahl an Nachkommastellen.

Aufgaben:
1. Implementieren Sie das gegebene Interface `DecimalNumber` gemäß der im JavaDoc gegebenen Spezifikation.
   
2. Schreiben Sie für jede Methode mind. einen Unit-Test.

Die Verwendung der Interface-Implementierung könnte bspw. wie folgt aussehen:

```java
DecimalNumber a = new DecimalNumberImpl("10.25", 2);
DecimalNumber b = new DecimalNumberImpl("5.5", 1);
DecimalNumber result = a.divide(b);
System.out.println(result.asString()); // should print 1.86
```