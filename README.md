# ChristmasTree

Das Programm gibt einen ASCII-Weihnachtsbaum auf der Konsole aus. Die Idee stammt von hier: https://ccd-school.de/coding-dojo/function-katas/tannenbaum/. Bei der Umsetzung habe ich versucht, Clean Code zu programmieren.

Beim Ausführen des Programms auf der Kommandozeile können 2 Argumente übergeben werden: Eins für die Höhe des Baums und eins für den Typ.
`java dev.xmas.Main 5 0` gibt einen einfachen Baum mit Stern und 5 Ebenen aus:
```
    *
    X
   XXX
  XXXXX
 XXXXXXX
XXXXXXXXX
    I
```
Bei `java dev.xmas.Main 5 1` ist der Baum mit zusätzlichen Sternen dekoriert:
```
    *
    X
   X*X
  X*X*X
 X*X*X*X
X*X*X*X*X
    I
```
